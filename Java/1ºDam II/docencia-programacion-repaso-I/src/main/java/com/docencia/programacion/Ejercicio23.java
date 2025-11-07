package com.docencia.programacion;

public class Ejercicio23 {
    public static int randomInRange(int min, int max) {
        if (min > max) {
            int t = min;
            min = max;
            max = t;
        }
        // inclusive
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
}
