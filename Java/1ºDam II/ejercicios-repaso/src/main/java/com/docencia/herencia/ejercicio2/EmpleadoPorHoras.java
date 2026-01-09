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
        // TODO: devolver horas * tarifaPorHora, controlando valores negativos.
        return 0.0;
    }

    public static double costeTotalNomina(List<Empleado> empleados) {
        // TODO: sumar salarios de empleados no nulos.
        return 0.0;
    }
}
