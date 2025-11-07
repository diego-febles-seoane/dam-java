package com.docencia.programacion;

public class Ejercicio14 {
    private final double[] grades;

    public Ejercicio14(double[] grades) {
        if (grades == null) {
            this.grades = new double[0];
        } else {
            this.grades = new double[grades.length];
            for (int i = 0; i < grades.length; i++)
                this.grades[i] = grades[i];
        }
    }

    public double getMaxGrade() {
        if (grades.length == 0)
            return -1.0;
        double m = grades[0];
        for (int i = 1; i < grades.length; i++)
            if (grades[i] > m)
                m = grades[i];
        return m;
    }

    public double getMinGrade() {
        if (grades.length == 0)
            return -1.0;
        double m = grades[0];
        for (int i = 1; i < grades.length; i++)
            if (grades[i] < m)
                m = grades[i];
        return m;
    }

    public double getAverageGrade() {
        if (grades.length == 0)
            return -1.0;
        double s = 0.0;
        for (double g : grades)
            s += g;
        return s / grades.length;
    }
}
