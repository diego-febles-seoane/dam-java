package com.docencia.herencia.ejercicio2;

public class EmpleadoFijo extends Empleado {
    private final double salarioMensual; //recuerda la importacia de utilizar final

    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalarioMensual() {
        // TODO: devolver salario mensual.
        return 0.0;
    }

}
