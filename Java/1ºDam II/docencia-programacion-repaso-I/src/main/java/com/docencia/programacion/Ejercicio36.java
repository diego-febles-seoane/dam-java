package com.docencia.programacion;

public class Ejercicio36 {
    private final double[] temps;

    public Ejercicio36(double[] temps) {
        // clonar defensivamente
        if (temps == null) {
            this.temps = new double[0];
        } else {
            this.temps = new double[temps.length];
            for (int i = 0; i < temps.length; i++)
                this.temps[i] = temps[i];
        }
    }

    public double getMaxTemperature() {
        if (temps.length == 0)
            return -1.0;
        double m = temps[0];
        for (int i = 1; i < temps.length; i++)
            if (temps[i] > m)
                m = temps[i];
        return m;
    }

    public double getMinTemperature() {
        if (temps.length == 0)
            return -1.0;
        double m = temps[0];
        for (int i = 1; i < temps.length; i++)
            if (temps[i] < m)
                m = temps[i];
        return m;
    }

    public double getAverageTemperature() {
        if (temps.length == 0)
            return -1.0;
        double s = 0.0;
        for (double t : temps)
            s += t;
        return s / temps.length;
    }

    public int countAbove(double threshold) {
        if (temps.length == 0)
            return 0;
        int c = 0;
        for (double t : temps)
            if (t > threshold)
                c++;
        return c;
    }
}
