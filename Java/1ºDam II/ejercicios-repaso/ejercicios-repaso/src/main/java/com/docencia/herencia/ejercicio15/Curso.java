package com.docencia.herencia.ejercicio15;


import java.util.List;


public abstract class Curso {
    private final String nombre;
    private final int horas;

    protected Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public abstract boolean esIntenso();
}
