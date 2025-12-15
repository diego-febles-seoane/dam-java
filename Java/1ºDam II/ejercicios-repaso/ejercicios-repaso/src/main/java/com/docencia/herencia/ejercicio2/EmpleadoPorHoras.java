package com.docencia.herencia.ejercicio2;

import java.util.List;

public class EmpleadoPorHoras extends Empleado {
    private final int horas;
    private final double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horas, double tarifaPorHora) {
        super(nombre);
        this.horas = horas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        if (horas < 0 || tarifaPorHora < 0) {
            return 0.0;
        }
        return horas * tarifaPorHora;
    }

    public static double costeTotalNomina(List<Empleado> empleados) {
        double total = 0.0;
        for (Empleado e : empleados) {
            if (e != null) {
                total += e.calcularSalarioMensual();
            }
        }
        return total;
    }
}
