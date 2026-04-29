# fichero actualizado con regla 80%
# documentacion solo cuenta si >=80% tests OK

from __future__ import annotations

from pathlib import Path
import re
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parent.parent
REPORTS = ROOT / 'target' / 'surefire-reports'
TARGET = ROOT / 'target'
SERVICE_DIR = ROOT / 'src' / 'main' / 'java' / 'com' / 'ejemplo' / 'service'

PESOS_TESTS = {
    'socio': 4.0,
    'clase': 4.0,
}

PESOS_DOCUMENTACION = {
    'socio': 1.0,
    'clase': 1.0,
}

UMBRAL_DOCUMENTACION = 0.80

INTERFACES = {
    'socio': SERVICE_DIR / 'ISocioService.java',
    'clase': SERVICE_DIR / 'IClaseService.java',
}

METODOS_ESPERADOS = {
    'socio': {
        'create': ['crea', 'socio'],
        'findById': ['busca', 'identificador'],
        'findAll': ['lista', 'socios'],
        'update': ['actualiza', 'socio'],
        'deleteById': ['elimina', 'socio'],
        'findActivos': ['activos'],
        'findByPlan': ['plan'],
        'findSociosConReservas': ['join', 'reservas'],
    },
    'clase': {
        'create': ['crea', 'clase'],
        'findById': ['busca', 'identificador'],
        'findAll': ['lista', 'clases'],
        'update': ['actualiza', 'clase'],
        'deleteById': ['elimina', 'clase'],
        'findDisponibles': ['disponibles'],
        'findByTipo': ['tipo'],
        'findByMonitor': ['monitor'],
        'findClasesConMonitor': ['join', 'monitor'],
        'findReservasConSocio': ['join', 'socio'],
    },
}


def detectar_bloque(nombre_clase: str) -> str:
    nombre = nombre_clase.lower()
    if 'socio' in nombre:
        return 'socio'
    if 'clase' in nombre:
        return 'clase'
    return 'otros'


def normalizar_texto(texto: str) -> str:
    texto = texto.lower()
    texto = texto.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u')
    texto = re.sub(r'\s+', ' ', texto)
    return texto.strip()


def extraer_javadocs_por_metodo(interface_path: Path) -> dict[str, str]:
    if not interface_path.exists():
        return {}
    texto = interface_path.read_text(encoding='utf-8')
    patron = re.compile(
        r'/\*\*(?P<javadoc>[\s\S]*?)\*/\s*(?:public\s+)?[\w<>\[\], ?]+\s+(?P<metodo>\w+)\s*\(',
        flags=re.MULTILINE,
    )
    resultado = {}
    for match in patron.finditer(texto):
        resultado[match.group('metodo')] = normalizar_texto(match.group('javadoc'))
    return resultado


def puntuar_documentacion_interface(interface_path: Path, bloque: str, ratio_tests: float) -> dict:
    esperados = METODOS_ESPERADOS[bloque]
    encontrados = []
    faltantes = []
    javadocs = extraer_javadocs_por_metodo(interface_path)

    for metodo, palabras_clave in esperados.items():
        texto = javadocs.get(metodo)
        if texto is None:
            faltantes.append(metodo)
            continue
        if all(normalizar_texto(palabra) in texto for palabra in palabras_clave):
            encontrados.append(metodo)
        else:
            faltantes.append(metodo)

    ratio_documentacion = 0.0 if not esperados else len(encontrados) / len(esperados)
    puede_sumar = ratio_tests >= UMBRAL_DOCUMENTACION
    puntos = round(ratio_documentacion * PESOS_DOCUMENTACION[bloque], 2) if puede_sumar else 0.0

    return {
        'puntos': puntos,
        'faltantes': faltantes,
        'encontrados': encontrados,
        'total_metodos': len(esperados),
        'ratio_documentacion': ratio_documentacion,
        'bloqueada_por_tests': not puede_sumar,
    }


def calcular_resumen_tests(report_files: list[Path]) -> dict:
    resumen = {
        'socio': {'total': 0, 'passed': 0, 'failed': 0},
        'clase': {'total': 0, 'passed': 0, 'failed': 0},
    }
    for file in report_files:
        root = ET.parse(file).getroot()
        bloque = detectar_bloque(root.attrib.get('name', 'desconocido'))
        if bloque not in resumen:
            continue
        tests = int(root.attrib.get('tests', 0))
        failures = int(root.attrib.get('failures', 0))
        errors = int(root.attrib.get('errors', 0))
        skipped = int(root.attrib.get('skipped', 0))
        failed = failures + errors + skipped
        passed = max(0, tests - failed)
        resumen[bloque]['total'] += tests
        resumen[bloque]['passed'] += passed
        resumen[bloque]['failed'] += failed
    return resumen


def generar_informe() -> str:
    report_files = sorted(REPORTS.glob('TEST-*.xml'))
    resumen = calcular_resumen_tests(report_files)
    ratios_tests = {
        bloque: 0.0 if datos['total'] == 0 else datos['passed'] / datos['total']
        for bloque, datos in resumen.items()
    }
    documentacion = {
        bloque: puntuar_documentacion_interface(ruta, bloque, ratios_tests[bloque])
        for bloque, ruta in INTERFACES.items()
    }

    total_nota = 0.0
    lineas = [
        '=== CALIFICACION AUTOMATICA POR BLOQUE ===',
        '',
        'PESOS:',
        f"- Tests socio: {PESOS_TESTS['socio']:.2f} puntos",
        f"- Documentacion socio: {PESOS_DOCUMENTACION['socio']:.2f} puntos",
        f"- Tests clase: {PESOS_TESTS['clase']:.2f} puntos",
        f"- Documentacion clase: {PESOS_DOCUMENTACION['clase']:.2f} puntos",
        f"- Regla documentacion: solo suma si el bloque tiene al menos {UMBRAL_DOCUMENTACION:.0%} de tests pasados",
        '',
        'RESULTADOS:',
    ]

    for bloque in ('socio', 'clase'):
        total = resumen[bloque]['total']
        passed = resumen[bloque]['passed']
        failed = resumen[bloque]['failed']
        ratio = ratios_tests[bloque]
        nota_tests = round(ratio * PESOS_TESTS[bloque], 2)
        nota_doc = documentacion[bloque]['puntos']
        subtotal = round(nota_tests + nota_doc, 2)
        total_nota += subtotal

        lineas.append('')
        lineas.append(f"{bloque.upper()}")
        lineas.append(f"- Tests: {passed}/{total} pasados, {failed} fallados ({ratio:.0%})")
        lineas.append(f"- Nota tests: {nota_tests:.2f}/{PESOS_TESTS[bloque]:.2f}")
        lineas.append(
            f"- Documentacion encontrada: {len(documentacion[bloque]['encontrados'])}/"
            f"{documentacion[bloque]['total_metodos']} metodos "
            f"({documentacion[bloque]['ratio_documentacion']:.0%})"
        )
        if documentacion[bloque]['bloqueada_por_tests']:
            lineas.append(f"- Nota documentacion: 0.00/{PESOS_DOCUMENTACION[bloque]:.2f} (bloqueada por no llegar al 80% de tests)")
        else:
            lineas.append(f"- Nota documentacion: {nota_doc:.2f}/{PESOS_DOCUMENTACION[bloque]:.2f}")
        if documentacion[bloque]['faltantes']:
            lineas.append(f"- Metodos no documentados correctamente: {', '.join(documentacion[bloque]['faltantes'])}")
        else:
            lineas.append('- Interfaz completa para este bloque')
        lineas.append(f"- Subtotal: {subtotal:.2f}/{PESOS_TESTS[bloque] + PESOS_DOCUMENTACION[bloque]:.2f}")

    lineas.append('')
    lineas.append('=== NOTA FINAL ===')
    lineas.append(f"Nota final: {round(total_nota, 2):.2f}/10")
    return '\n'.join(lineas) + '\n'


def main() -> int:
    informe = generar_informe()
    TARGET.mkdir(parents=True, exist_ok=True)
    salida = TARGET / 'nota.txt'
    salida.write_text(informe, encoding='utf-8')
    print(informe, end='')
    print(f'Fichero generado: {salida}')
    return 0


if __name__ == '__main__':
    raise SystemExit(main())
