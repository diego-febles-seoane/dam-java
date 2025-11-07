package com.docencia.programacion;

public class Ejercicio13 {
    public static int[] filterEvenNumbers(int[] input) {
        if (input == null)
            return new int[0];
        int count = 0;
        for (int v : input)
            if (v % 2 == 0)
                count++;
        if (count == 0)
            return new int[0];
        int[] res = new int[count];
        int idx = 0;
        for (int v : input) {
            if (v % 2 == 0) {
                res[idx++] = v;
            }
        }
        return res;
    }
}
