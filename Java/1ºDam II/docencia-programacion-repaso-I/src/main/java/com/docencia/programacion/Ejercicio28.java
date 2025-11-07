package com.docencia.programacion;

public class Ejercicio28 {
    private final double x;
    private final double y;

    public Ejercicio28(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ejercicio28 add(Ejercicio28 other) {
        if (other == null)
            return new Ejercicio28(this.x, this.y);
        return new Ejercicio28(this.x + other.x, this.y + other.y);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(Ejercicio28 other) {
        if (other == null)
            return magnitude();
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
