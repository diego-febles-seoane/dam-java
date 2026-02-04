package com.docencia.fecha.ejercicio3;

import java.time.Duration;
import java.time.LocalTime;

/**
 * EJERCICIO 3) Minutos hasta una hora objetivo (hoy o mañana)
 *
 * Calcula los minutos desde 'ahora' hasta 'objetivo'.
 * - Si objetivo es igual o posterior a ahora, calcula la diferencia dentro del
 * mismo día.
 * - Si objetivo es anterior a ahora, se considera que el objetivo ocurre
 * "mañana"
 * y se calcula el tiempo restante hasta el final del día + el tiempo desde
 * 00:00 hasta objetivo.
 *
 * Programación defensiva:
 * - Si ahora u objetivo son null, lanza IllegalArgumentException.
 *
 * Ejemplos:
 * - ahora=10:00, objetivo=10:10 => 10
 * - ahora=23:50, objetivo=00:10 => 20
 */
public class Ejercicio03 {
    public static long minutosHasta(LocalTime ahora, LocalTime objetivo) {
        throw new UnsupportedOperationException("TODO");
    }
}
