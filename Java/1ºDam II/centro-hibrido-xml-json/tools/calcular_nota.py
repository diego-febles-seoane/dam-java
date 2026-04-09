#!/usr/bin/env python3
from __future__ import annotations

import glob
import os
import sys
import xml.etree.ElementTree as ET

PESOS = {'xmlDevuelveTresProfesoresInicialesTest': 0.2, 'xmlDevuelveCuatroModulosInicialesTest': 0.2, 'xmlRecuperaProfesorExistentePorIdTest': 0.2, 'xmlNoRecuperaProfesorInexistentePorIdTest': 0.2, 'xmlRecuperaModuloExistentePorIdTest': 0.2, 'xmlNoRecuperaModuloInexistentePorIdTest': 0.2, 'xmlFindAllProfesoresDevuelveCopiaDefensivaTest': 0.2, 'xmlFindAllModulosDevuelveCopiaDefensivaTest': 0.2, 'jsonDevuelveSeisEvaluacionesInicialesTest': 0.2, 'jsonDevuelveCuatroIncidenciasInicialesTest': 0.2, 'jsonGuardaNuevaEvaluacionTest': 0.2, 'jsonSobrescribeEvaluacionDuplicadaPorAlumnoYModuloTest': 0.2, 'jsonFiltraEvaluacionesPorModuloTest': 0.2, 'jsonDevuelveListaVaciaSiNoHayEvaluacionesDelModuloTest': 0.2, 'jsonGuardaNuevaIncidenciaTest': 0.2, 'jsonFiltraIncidenciasPorProfesorTest': 0.2, 'jsonDevuelveListaVaciaSiNoHayIncidenciasDelProfesorTest': 0.2, 'jsonFindAllEvaluacionesDevuelveCopiaDefensivaTest': 0.2, 'jsonFindAllIncidenciasDevuelveCopiaDefensivaTest': 0.2, 'jsonPersisteCambiosEntreLecturasTest': 0.2, 'servicioBuscaProfesorExistenteTest': 0.3, 'servicioNoEncuentraProfesorInexistenteTest': 0.3, 'servicioNoBuscaProfesorConIdBlankTest': 0.3, 'servicioBuscaModuloExistenteTest': 0.3, 'servicioListaDosModulosDeProfesorTest': 0.3, 'servicioListaVaciaDeModulosSiProfesorNoExisteTest': 0.3, 'servicioRegistraEvaluacionValidaTest': 0.3, 'servicioRegistraEvaluacionRecortandoEspaciosTest': 0.3, 'servicioRechazaEvaluacionDeModuloInexistenteTest': 0.3, 'servicioRechazaEvaluacionConAlumnoBlankTest': 0.3, 'servicioRechazaEvaluacionConNotaMayorQueDiezTest': 0.3, 'servicioListaEvaluacionesDeModuloExistenteTest': 0.3, 'servicioCalculaMediaCorrectaDeModuloTest': 0.3, 'servicioCalculaMediaCorrectaDeProfesorTest': 0.3, 'servicioRegistraIncidenciaValidaTest': 0.3, 'servicioRechazaIncidenciaDeProfesorInexistenteTest': 0.3, 'servicioListaIncidenciasDeProfesorExistenteTest': 0.3, 'servicioSobrescribeEvaluacionDuplicadaTest': 0.3, 'servicioNuevaIncidenciaAumentaListadoTest': 0.3, 'servicioBuscarProfesorRecortaEspaciosTest': 0.3}

BLOQUES = {
    "repositorio_xml": {'xmlRecuperaProfesorExistentePorIdTest', 'xmlDevuelveTresProfesoresInicialesTest', 'xmlFindAllModulosDevuelveCopiaDefensivaTest', 'xmlRecuperaModuloExistentePorIdTest', 'xmlDevuelveCuatroModulosInicialesTest', 'xmlNoRecuperaProfesorInexistentePorIdTest', 'xmlFindAllProfesoresDevuelveCopiaDefensivaTest', 'xmlNoRecuperaModuloInexistentePorIdTest'},
    "repositorio_json": {'jsonGuardaNuevaIncidenciaTest', 'jsonDevuelveListaVaciaSiNoHayIncidenciasDelProfesorTest', 'jsonSobrescribeEvaluacionDuplicadaPorAlumnoYModuloTest', 'jsonDevuelveSeisEvaluacionesInicialesTest', 'jsonDevuelveListaVaciaSiNoHayEvaluacionesDelModuloTest', 'jsonPersisteCambiosEntreLecturasTest', 'jsonFindAllEvaluacionesDevuelveCopiaDefensivaTest', 'jsonFiltraIncidenciasPorProfesorTest', 'jsonFiltraEvaluacionesPorModuloTest', 'jsonDevuelveCuatroIncidenciasInicialesTest', 'jsonFindAllIncidenciasDevuelveCopiaDefensivaTest', 'jsonGuardaNuevaEvaluacionTest'},
    "servicio": {'servicioListaDosModulosDeProfesorTest', 'servicioBuscaModuloExistenteTest', 'servicioCalculaMediaCorrectaDeModuloTest', 'servicioCalculaMediaCorrectaDeProfesorTest', 'servicioBuscaProfesorExistenteTest', 'servicioRechazaEvaluacionConAlumnoBlankTest', 'servicioListaVaciaDeModulosSiProfesorNoExisteTest', 'servicioRechazaIncidenciaDeProfesorInexistenteTest', 'servicioBuscarProfesorRecortaEspaciosTest', 'servicioNoBuscaProfesorConIdBlankTest', 'servicioRegistraIncidenciaValidaTest', 'servicioRechazaEvaluacionDeModuloInexistenteTest', 'servicioListaIncidenciasDeProfesorExistenteTest', 'servicioNoEncuentraProfesorInexistenteTest', 'servicioNuevaIncidenciaAumentaListadoTest', 'servicioListaEvaluacionesDeModuloExistenteTest', 'servicioSobrescribeEvaluacionDuplicadaTest', 'servicioRegistraEvaluacionValidaTest', 'servicioRegistraEvaluacionRecortandoEspaciosTest', 'servicioRechazaEvaluacionConNotaMayorQueDiezTest'}
}

ORDEN_BLOQUES = ["repositorio_xml", "repositorio_json", "servicio"]

def leer_testcases(report_dir: str):
    for path in glob.glob(os.path.join(report_dir, "TEST-*.xml")):
        try:
            root = ET.parse(path).getroot()
        except Exception:
            continue
        for tc in root.iter("testcase"):
            classname = tc.attrib.get("classname", "UNKNOWN_CLASS")
            testname = tc.attrib.get("name", "UNKNOWN_TEST")
            if tc.find("skipped") is not None:
                yield classname, testname, False, False, "SKIPPED"
                continue
            failure = tc.find("failure")
            error = tc.find("error")
            if failure is not None:
                yield classname, testname, True, False, failure.attrib.get("message", "failure")
            elif error is not None:
                yield classname, testname, True, False, error.attrib.get("message", "error")
            else:
                yield classname, testname, True, True, ""

def bloque_de_test(testname: str) -> str:
    for bloque, tests in BLOQUES.items():
        if testname in tests:
            return bloque
    return "sin_clasificar"

def main() -> int:
    base = os.getcwd()
    report_dir = os.path.join(base, "target", "surefire-reports")
    out_path = os.path.join(base, "target", "nota.txt")
    if not os.path.isdir(report_dir):
        print("No se ha encontrado target/surefire-reports. Ejecuta antes: mvn test")
        return 1

    total_max = sum(PESOS.values())
    total_obtenido = 0.0
    resultados = []
    acumulado_bloques = {k: 0.0 for k in BLOQUES}
    max_bloques = {k: sum(PESOS[t] for t in v) for k, v in BLOQUES.items()}
    vistos = set()

    for classname, testname, ejecutado, correcto, detalle in leer_testcases(report_dir):
        if testname not in PESOS:
            continue
        vistos.add(testname)
        peso = PESOS[testname]
        puntos = peso if (ejecutado and correcto) else 0.0
        bloque = bloque_de_test(testname)
        if bloque in acumulado_bloques:
            acumulado_bloques[bloque] += puntos
        total_obtenido += puntos
        resultados.append((bloque, classname, testname, correcto, peso, puntos, detalle))

    for testname, peso in PESOS.items():
        if testname not in vistos:
            bloque = bloque_de_test(testname)
            resultados.append((bloque, "NO_CLASS", testname, False, peso, 0.0, "NO_EJECUTADO"))

    resultados.sort(key=lambda x: (ORDEN_BLOQUES.index(x[0]) if x[0] in ORDEN_BLOQUES else 99, x[2]))
    nota_sobre_10 = 0.0 if total_max == 0 else round((total_obtenido / total_max) * 10, 2)

    os.makedirs(os.path.dirname(out_path), exist_ok=True)
    with open(out_path, "w", encoding="utf-8") as f:
        f.write(f"puntosObtenidos={total_obtenido:.2f}\n")
        f.write(f"puntosMaximos={total_max:.2f}\n")
        f.write(f"notaSobre10={nota_sobre_10:.2f}\n\n")
        f.write("NOTA_POR_BLOQUE (bloque | puntosObtenidos | puntosMaximos | notaSobre10)\n")
        for bloque in ORDEN_BLOQUES:
            pobt = acumulado_bloques[bloque]
            pmax = max_bloques[bloque]
            nota_bloque = 0.0 if pmax == 0 else (pobt / pmax) * 10
            f.write(f"{bloque} | {pobt:.2f} | {pmax:.2f} | {nota_bloque:.2f}\n")
        f.write("\nDETALLE_POR_TEST (bloque | clase | test | correcto | peso | puntos | detalle)\n")
        for bloque, classname, testname, correcto, peso, puntos, detalle in resultados:
            f.write(f"{bloque} | {classname} | {testname} | {correcto} | {peso:.2f} | {puntos:.2f} | {detalle}\n")

    print("=" * 52)
    print(f"Nota final: {nota_sobre_10:.2f} / 10")
    print(f"Puntos: {total_obtenido:.2f} / {total_max:.2f}")
    print("Nota por bloque:")
    for bloque in ORDEN_BLOQUES:
        pobt = acumulado_bloques[bloque]
        pmax = max_bloques[bloque]
        nota_bloque = 0.0 if pmax == 0 else (pobt / pmax) * 10
        print(f" - {bloque}: {nota_bloque:.2f} / 10 ({pobt:.2f}/{pmax:.2f})")
    print(f"Detalle generado en: {out_path}")
    print("=" * 52)
    return 0

if __name__ == "__main__":
    sys.exit(main())
