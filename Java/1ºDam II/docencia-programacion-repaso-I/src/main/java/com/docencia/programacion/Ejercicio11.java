package com.docencia.programacion;

public class Ejercicio11 {
    public static int sumArray(int[] values) {
        if (values == null || values.length == 0)
            return 0;
        int s = 0;
        for (int v : values)
            s += v;
        return s;
    }

    public static int maxArray(int[] values) {
        if (values == null || values.length == 0)
            return Integer.MIN_VALUE;
        int m = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > m)
                m = values[i];
        }
        return m;
    }
}
