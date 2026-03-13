#!/usr/bin/env python3
from __future__ import annotations

import glob
import os
import re
import sys
import xml.etree.ElementTree as ET
from collections import defaultdict


# ====== CONFIG: cómo reconocer el "ejercicio" a partir del classname ======
# Opción A (por defecto): cada clase = un ejercicio
def ejercicio_de_classname(classname: str) -> str:
    return classname

# Opción B: agrupar por "EjercicioN" si aparece en el nombre (Ejercicio1Test, Ejercicio2_AlgoTest, etc.)
# Descomenta para usarlo:
# def ejercicio_de_classname(classname: str) -> str:
#     base = classname.split(".")[-1]  # quita paquete
#     m = re.search(r"(Ejercicio\s*\d+|Ej\d+)", base, re.IGNORECASE)
#     return m.group(1).replace(" ", "") if m else base


def puntos_por_clase(incorrectos: int) -> float:
    if incorrectos == 0:
        return 1.0
    if 1 <= incorrectos <= 2:
        return 0.75
    return 0.0  # >= 3 incorrectos


def leer_testcases(report_dir: str):
    """Itera por testcase de Surefire: devuelve tuplas (classname, ejecutado, incorrecto)."""
    for path in glob.glob(os.path.join(report_dir, "TEST-*.xml")):
        try:
            root = ET.parse(path).getroot()
        except Exception:
            continue

        for tc in root.iter("testcase"):
            classname = tc.attrib.get("classname") or root.attrib.get("name") or "UNKNOWN_CLASS"

            # skipped => no cuenta
            if tc.find("skipped") is not None:
                yield classname, False, False
                continue

            incorrecto = (tc.find("failure") is not None) or (tc.find("error") is not None)
            yield classname, True, incorrecto


def main() -> int:
    base = os.getcwd()
    report_dir = os.path.join(base, "target", "surefire-reports")
    out_path = os.path.join(base, "target", "nota.txt")
    os.makedirs(os.path.dirname(out_path), exist_ok=True)

    # Stats por clase
    clase_ejecutados = defaultdict(int)
    clase_incorrectos = defaultdict(int)

    for classname, ejecutado, incorrecto in leer_testcases(report_dir):
        if not ejecutado:
            continue
        clase_ejecutados[classname] += 1
        if incorrecto:
            clase_incorrectos[classname] += 1

    # Filtrar clases sin tests ejecutados
    clases = sorted([c for c in clase_ejecutados.keys() if clase_ejecutados[c] > 0])

    # Calcular puntos por clase y agrupar por ejercicio
    ejercicio_clases = defaultdict(list)  # ejercicio -> list[classname]
    puntos_clase = {}  # classname -> puntos
    detalle_clase = []  # (ejercicio, classname, ejecutados, incorrectos, puntos)

    for c in clases:
        inc = clase_incorrectos[c]
        pts = puntos_por_clase(inc)
        puntos_clase[c] = pts

        ej = ejercicio_de_classname(c)
        ejercicio_clases[ej].append(c)

        detalle_clase.append((ej, c, clase_ejecutados[c], inc, pts))

    # Nota por ejercicio: promedio de sus clases * 10
    notas_ejercicio = []  # (ejercicio, clases_count, puntos_obt, puntos_max, nota10)
    for ej in sorted(ejercicio_clases.keys()):
        cls = ejercicio_clases[ej]
        puntos_obt = sum(puntos_clase[c] for c in cls)
        puntos_max = float(len(cls)) if cls else 0.0
        nota10 = 0.0 if puntos_max == 0 else 10.0 * (puntos_obt / puntos_max)
        notas_ejercicio.append((ej, len(cls), puntos_obt, puntos_max, nota10))

    # Nota global: promedio de ejercicios (cada ejercicio pesa igual)
    if len(notas_ejercicio) == 0:
        nota_global = 0.0
    else:
        nota_global = sum(n for *_rest, n in notas_ejercicio) / len(notas_ejercicio)

    # Escribir salida
    with open(out_path, "w", encoding="utf-8") as f:
        f.write(f"ejerciciosEvaluados={len(notas_ejercicio)}\n")
        f.write(f"notaSobre10Global={nota_global:.2f}\n\n")

        f.write("NOTA_POR_EJERCICIO (ejercicio | numClases | puntosObtenidos | puntosMax | notaSobre10)\n")
        for ej, ncls, pobt, pmax, nota10 in notas_ejercicio:
            f.write(f"{ej} | {ncls} | {pobt:.2f} | {pmax:.2f} | {nota10:.2f}\n")

        f.write("\nDETALLE_POR_CLASE (ejercicio | clase | ejecutados | incorrectos | puntos)\n")
        for ej, c, ejec, inc, pts in sorted(detalle_clase):
            f.write(f"{ej} | {c} | {ejec} | {inc} | {pts:.2f}\n")

    print("==============================")
    print(f"Nota global (media de ejercicios): {nota_global:.2f} / 10")
    print("Notas por ejercicio:")
    for ej, _ncls, _pobt, _pmax, nota10 in notas_ejercicio:
        print(f" - {ej}: {nota10:.2f} / 10")
    print(f"Fichero generado: {out_path}")
    print("==============================")
    return 0


if __name__ == "__main__":
    sys.exit(main())