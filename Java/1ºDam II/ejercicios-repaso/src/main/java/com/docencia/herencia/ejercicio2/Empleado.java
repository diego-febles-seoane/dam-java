package com.docencia.herencia.ejercicio2;


import java.util.List;


public abstract class Empleado {
    private final String nombre;

    protected Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSalarioMensual();
}
