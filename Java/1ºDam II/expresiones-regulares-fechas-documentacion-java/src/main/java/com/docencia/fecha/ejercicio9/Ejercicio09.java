package com.docencia.fecha.ejercicio9;

import java.time.LocalTime;
import java.util.List;

/**
     * EJERCICIO 9) Obtener mínimo y máximo de una lista (una sola pasada)
     *
     * Dada una lista de LocalTime, devuelve un array de tamaño 2:
     * - índice 0: la hora más temprana
     * - índice 1: la hora más tardía
     * Sin ordenar la lista (solo recorriéndola una vez).
     *
     * Programación defensiva:
     * - Si la lista es null, lanza IllegalArgumentException.
     * - Si la lista está vacía, lanza IllegalArgumentException.
     * - Si la lista contiene null, lanza IllegalArgumentException (o define política e impleméntala).
     *
     * Ejemplo:
     * - [10:00, 09:30, 12:15] => [09:30, 12:15]
     */
public class Ejercicio09 {
    public static LocalTime[] minMax(List<LocalTime> horas) {
        if (horas == null || horas.isEmpty()){
            throw new IllegalArgumentException();
        }
        LocalTime[] resultado = new LocalTime[2];
        LocalTime minimo = horas.get(0);
        LocalTime maximo = horas.get(0);
        for (LocalTime fecha : horas){
            if (fecha == null){
                throw new IllegalArgumentException();
            }
            if (fecha.isBefore(minimo)){
                minimo = fecha;
            }
            if (fecha.isAfter(maximo)){
                maximo = fecha;
            }
        }   
        resultado [0] = minimo;
        resultado [1] = maximo;
        return resultado;
    }
}
