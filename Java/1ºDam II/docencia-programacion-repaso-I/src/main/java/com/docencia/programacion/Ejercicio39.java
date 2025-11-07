package com.docencia.programacion;

public class Ejercicio39 {
    public static long factorial(int n) {
        if (n < 0)
            return -1L;
        long res = 1L;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static long fibonacci(int n) {
        if (n < 0)
            return -1L;
        if (n == 0)
            return 0L;
        if (n == 1)
            return 1L;
        long a = 0L, b = 1L;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
