package com.docencia.fecha.ejercicio7;

import java.time.LocalTime;

/**
     * EJERCICIO 7) Solapamiento de intervalos (sin cruzar medianoche)
     *
     * Determina si dos intervalos horarios [aIni, aFin) y [bIni, bFin) se solapan.
     * Los intervalos se consideran válidos si aIni < aFin y bIni < bFin.
     *
     * Regla típica de solapamiento:
     * - Se solapan si aIni < bFin && bIni < aFin
     *
     * Programación defensiva:
     * - Si cualquier parámetro es null, lanza IllegalArgumentException.
     * - Si aIni no es before aFin, lanza IllegalArgumentException.
     * - Si bIni no es before bFin, lanza IllegalArgumentException.
     *
     * Ejemplos:
     * - [10:00,12:00) y [11:00,13:00) => true
     * - [10:00,12:00) y [12:00,14:00) => false
     */
public class Ejercicio07 {
public static boolean solapan(LocalTime aIni, LocalTime aFin, LocalTime bIni, LocalTime bFin) {
        throw new UnsupportedOperationException("TODO");
    }
}
