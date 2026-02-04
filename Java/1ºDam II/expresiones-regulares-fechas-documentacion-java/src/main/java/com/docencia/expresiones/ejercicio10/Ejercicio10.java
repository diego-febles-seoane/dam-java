package com.docencia.expresiones.ejercicio10;

/**
 /**
 * 10) VALIDAR DNI/NIF ESPAÑOL (8 dígitos + letra) EXACTO
 *    - Validar un DNI/NIF con este formato:
 *      8 dígitos (sin separadores) + 1 letra (mayúscula)
 *    - Reglas:
 *      1) Debe ser EXACTAMENTE: ^\d{8}[A-Z]$
 *      2) Además, la letra debe corresponder al número:
 *         letra = "TRWAGMYFPDXBNJZSQVHLCKE"[numero % 23]
 *
 *    Válidos (si la letra cuadra):
 *      "00000000T", "12345678Z", "53077918Y"
 *
 *    Inválidos:
 *      - Formato incorrecto: "1234567Z", "12345678-z", "12.345.678Z"
 *      - Letra incorrecta:   "12345678A"
 *
 */
public class Ejercicio10 {

    public static boolean validarDNI(String dni) {
        throw new UnsupportedOperationException("TODO");
    }

}
