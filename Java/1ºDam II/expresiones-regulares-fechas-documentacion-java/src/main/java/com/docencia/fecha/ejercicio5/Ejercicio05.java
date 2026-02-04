package com.docencia.fecha.ejercicio5;

import java.time.LocalTime;

/**
 * EJERCICIO 5) Sumar/restar minutos con wrap 24h
 *
 * Dada una hora t y un delta en minutos (positivo o negativo), devuelve la hora
 * resultante
 * aplicando aritmética modular de 24 horas.
 *
 * Programación defensiva:
 * - Si t es null, lanza IllegalArgumentException.
 * - deltaMin puede ser muy grande (ej. +/- 1_000_000), no debe romper el
 * cálculo.
 *
 * Ejemplos:
 * - 10:00 + 1500 => 11:00 (1500 min = 25h)
 * - 00:10 - 20 => 23:50
 */
public class Ejercicio05 {
    public static LocalTime sumarMinutos(LocalTime t, long deltaMin) {
        throw new UnsupportedOperationException("TODO");
    }
}
