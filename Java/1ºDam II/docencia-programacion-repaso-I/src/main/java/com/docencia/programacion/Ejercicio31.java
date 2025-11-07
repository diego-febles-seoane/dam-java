package com.docencia.programacion;

public class Ejercicio31 {
    private final String[] studentNames;
    private final double[] grades;

    public Ejercicio31(String[] studentNames, double[] grades) {
        if (studentNames == null || grades == null || studentNames.length != grades.length) {
            this.studentNames = new String[0];
            this.grades = new double[0];
        } else {
            this.studentNames = new String[studentNames.length];
            for (int i = 0; i < studentNames.length; i++)
                this.studentNames[i] = studentNames[i];
            this.grades = new double[grades.length];
            for (int i = 0; i < grades.length; i++)
                this.grades[i] = grades[i];
        }
    }

    public double getGrade(String name) {
        if (name == null)
            return -1.0;
        for (int i = 0; i < studentNames.length; i++) {
            if (name.equals(studentNames[i]))
                return grades[i];
        }
        return -1.0;
    }

    public double calculateAverageGrade() {
        if (grades.length == 0)
            return 0.0;
        double s = 0.0;
        for (double g : grades)
            s += g;
        return s / grades.length;
    }
}
