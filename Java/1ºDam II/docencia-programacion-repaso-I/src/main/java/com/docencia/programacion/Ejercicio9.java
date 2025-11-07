package com.docencia.programacion;

public class Ejercicio9 {
    public static int absValue(int x) {
        return Math.abs(x);
    }

    public static int maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }

    public static double distance2D(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
