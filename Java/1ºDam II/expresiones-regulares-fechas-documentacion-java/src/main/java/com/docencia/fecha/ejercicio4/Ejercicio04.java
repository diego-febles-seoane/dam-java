package com.docencia.fecha.ejercicio4;

import java.time.LocalTime;

/**
     * EJERCICIO 4) Redondear al siguiente múltiplo de X minutos (ceil)
     *
     * Dada una hora t y un paso en minutos pasoMin (por ejemplo 15),
     * devuelve la hora redondeada hacia arriba al siguiente múltiplo de pasoMin.
     * - Si t ya cae exactamente en un múltiplo, debe devolver t.
     * - Si el redondeo supera las 23:59, debe "pasar" al día siguiente (mod 24h).
     *
     * Programación defensiva:
     * - Si t es null, lanza IllegalArgumentException.
     * - Si pasoMin <= 0 o pasoMin > 60, lanza IllegalArgumentException.
     * - Recomendado: exigir que 60 % pasoMin == 0 (si no, documenta tu estrategia).
     *
     * Ejemplos (pasoMin=15):
     * - 10:01 => 10:15
     * - 10:15 => 10:15
     * - 10:59 => 11:00
     */
public class Ejercicio04 {
public static LocalTime redondearArriba(LocalTime t, int pasoMin) {
        throw new UnsupportedOperationException("TODO");
    }
}
