package com.docencia.fecha.ejercicio10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
     * EJERCICIO 10) Generador de alarmas repetidas (mod 24h)
     *
     * Genera una lista con las próximas n alarmas empezando en 'inicio', separadas por pasoMin minutos.
     * La lista debe incluir 'inicio' como primera alarma.
     * Si al sumar se cruza medianoche, debe continuar desde 00:00 (mod 24h).
     *
     * Programación defensiva:
     * - Si inicio es null, lanza IllegalArgumentException.
     * - Si pasoMin <= 0, lanza IllegalArgumentException.
     * - Si n < 0, lanza IllegalArgumentException.
     * - Si n == 0, devuelve una lista vacía.
     *
     * Ejemplo:
     * - inicio=23:50, pasoMin=15, n=4 => [23:50, 00:05, 00:20, 00:35]
     */
public class Ejercicio10 {
public static List<LocalTime> generarAlarmas(LocalTime inicio, int pasoMin, int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
