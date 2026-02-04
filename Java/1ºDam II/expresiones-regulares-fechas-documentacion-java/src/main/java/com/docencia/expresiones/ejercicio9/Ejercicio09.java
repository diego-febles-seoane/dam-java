package com.docencia.expresiones.ejercicio9;

import java.util.regex.Pattern;

/**
 * 9) ISO-8601 DATETIME CON ZONA Y MILISEGUNDOS OPCIONALES
 *    - Validar datetimes ISO-8601 tipo:
 *      "2025-01-02T03:04:05Z"
 *      "2025-01-02T03:04:05.123+02:00"
 *      Reglas:
 *      - milisegundos opcionales (1 a 3 dígitos)
 *      - zona obligatoria: 'Z' o ±HH:MM
 *    Válidos:   "2025-12-31T23:59:59Z", "2025-12-31T23:59:59.9-03:30"
 *    Inválidos: "2025-12-31 23:59:59Z", "2025-12-31T23:59:59", "2025-12-31T23:59:59+2:00"
 * 
 */
public class Ejercicio09 {

  public static boolean isValidIsoDateTimeWithZone(String text) {
    throw new UnsupportedOperationException("TODO");
  }
}
