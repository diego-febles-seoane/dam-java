package com.docencia.programacion;

public class Ejercicio10 {
    public static double calculateWeeklySalary(double hours, double hourlyRate) {
        if (hours <= 0 || hourlyRate <= 0){
            return 0.0;
        }
        double salarioSemanal = hours*hourlyRate;
        return salarioSemanal;
    }
}
