#!/usr/bin/env bash
set -euo pipefail

mvn -q test -Dmaven.test.failure.ignore=true

TOTAL=0
FAILED=0

while IFS= read -r f; do
  t=$(grep -oP 'tests="\K[0-9]+' "$f" | head -n1 || echo 0)
  fa=$(grep -oP 'failures="\K[0-9]+' "$f" | head -n1 || echo 0)
  er=$(grep -oP 'errors="\K[0-9]+' "$f" | head -n1 || echo 0)
  TOTAL=$((TOTAL + t))
  FAILED=$((FAILED + fa + er))
done < <(find target/surefire-reports -name "TEST-*.xml" 2>/dev/null | sort)

PASSED=$((TOTAL - FAILED))
if [ "$TOTAL" -eq 0 ]; then
  echo "No se encontraron tests."
  exit 2
fi

TEST_RATE=$(python3 - <<PY
total=$TOTAL
passed=$PASSED
print(passed/total)
PY
)

JACOCO_CSV="target/site/jacoco/jacoco.csv"
if [ ! -f "$JACOCO_CSV" ]; then
  echo "No existe $JACOCO_CSV (¿fallo JaCoCo?)."
  exit 3
fi

COV=$(python3 - <<PY
import csv
path="$JACOCO_CSV"
miss=cov=0
with open(path, newline='', encoding="utf-8") as f:
    r = csv.DictReader(f)
    for row in r:
        miss += int(row.get("LINE_MISSED", 0))
        cov  += int(row.get("LINE_COVERED", 0))
total = miss + cov
print(0.0 if total==0 else cov/total)
PY
)

GRADE=$(python3 - <<PY
test_rate=float("$TEST_RATE")
cov=float("$COV")
grade=100*(0.70*test_rate + 0.30*cov)
print(int(round(grade)))
PY
)

echo "----------------------------------------"
echo "Tests: $PASSED/$TOTAL"
echo "Cobertura lineas: $(python3 - <<PY
print(round($COV*100,2))
PY
)%"
echo "NOTA FINAL: $GRADE / 100"
echo "----------------------------------------"
