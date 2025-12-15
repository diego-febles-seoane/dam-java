package com.docencia.composicion.ejercicio15;


import java.util.ArrayList;
import java.util.List;


public class Trabajador {
    private final String nombre;
    private final double salario;

    public Trabajador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}
