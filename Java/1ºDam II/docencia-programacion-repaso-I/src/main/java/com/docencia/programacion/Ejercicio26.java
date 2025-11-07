package com.docencia.programacion;

public class Ejercicio26 {
    public static int[] mergeSorted(int[] a, int[] b) {
        if (a == null && b == null)
            return new int[0];
        if (a == null)
            return b.clone();
        if (b == null)
            return a.clone();
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                res[k++] = a[i++];
            else
                res[k++] = b[j++];
        }
        while (i < a.length)
            res[k++] = a[i++];
        while (j < b.length)
            res[k++] = b[j++];
        return res;
    }
}
