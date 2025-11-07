package com.docencia.programacion;

public class Ejercicio25 {
    public static int[] bubbleSortAscending(int[] arr) {
        if (arr == null)
            return null;
        int[] a = arr.clone();
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }
}
