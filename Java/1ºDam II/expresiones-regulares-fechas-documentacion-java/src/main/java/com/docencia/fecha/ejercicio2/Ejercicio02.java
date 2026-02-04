package com.docencia.fecha.ejercicio2;

import java.time.LocalTime;

/**
     * EJERCICIO 2) Dentro de intervalo circular (puede cruzar medianoche)
     *
     * Dadas t, inicio y fin, devuelve true si t está dentro del intervalo [inicio, fin)
     * incluso cuando el intervalo cruza medianoche. Por ejemplo: [22:00, 06:00).
     *
     * Interpretación:
     * - Si inicio < fin: es un intervalo normal (igual que el ejercicio 1).
     * - Si inicio > fin: el intervalo cruza medianoche y cubre desde inicio hasta 23:59:59.999...
     *   y desde 00:00 hasta fin (sin incluir fin).
     *
     * Programación defensiva:
     * - Si algún parámetro es null, lanza IllegalArgumentException.
     * - Si inicio.equals(fin), define y documenta el comportamiento:
     *   recomendado: tratarlo como intervalo vacío (devuelve false).
     *
     * Ejemplos:
     * - t=23:00, [22:00,06:00) => true
     * - t=05:59, [22:00,06:00) => true
     * - t=06:00, [22:00,06:00) => false
     */
public class Ejercicio02 {
    public static boolean estaDentroCircular(LocalTime t, LocalTime inicio, LocalTime fin) {
        throw new UnsupportedOperationException("TODO");
    }
}
