#!/usr/bin/env python3
from __future__ import annotations

"""Calcula una nota sobre 10 a partir de los reportes XML de Maven Surefire.

Nota = 10 * (tests_pasados / tests_totales)
- Los tests "skipped" no cuentan como pasados.
- Si no hay reportes, nota = 0.

Genera: target/nota.txt
"""

import glob
import os
import sys
import xml.etree.ElementTree as ET


def sumar_reportes(report_dir: str) -> tuple[int, int]:
    total = 0
    passed = 0
    for path in glob.glob(os.path.join(report_dir, 'TEST-*.xml')):
        try:
            root = ET.parse(path).getroot()
        except Exception:
            continue
        tests = int(root.attrib.get('tests', 0))
        failures = int(root.attrib.get('failures', 0))
        errors = int(root.attrib.get('errors', 0))
        skipped = int(root.attrib.get('skipped', 0))
        effective_total = max(0, tests - skipped)
        effective_passed = max(0, effective_total - failures - errors)
        total += effective_total
        passed += effective_passed
    return total, passed


def main() -> int:
    base = os.getcwd()
    report_dir = os.path.join(base, 'target', 'surefire-reports')
    out_path = os.path.join(base, 'target', 'nota.txt')
    os.makedirs(os.path.dirname(out_path), exist_ok=True)

    total, passed = sumar_reportes(report_dir)
    nota = 0.0 if total <= 0 else 10.0 * (passed / total)
    nota = max(0.0, min(10.0, nota))

    with open(out_path, 'w', encoding='utf-8') as f:
        f.write(f"testsTotales={total}\n")
        f.write(f"testsPasados={passed}\n")
        f.write(f"notaSobre10={nota:.2f}\n")

    print('==============================')
    print(f"Nota automatica: {nota:.2f} / 10")
    print(f"(Pasados {passed} de {total})")
    print(f"Fichero generado: {out_path}")
    print('==============================')

    return 0


if __name__ == '__main__':
    sys.exit(main())
