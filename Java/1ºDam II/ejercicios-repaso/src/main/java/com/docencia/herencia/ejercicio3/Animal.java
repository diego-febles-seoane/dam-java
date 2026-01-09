package com.docencia.herencia.ejercicio3;


import java.util.List;


public abstract class Animal {
    private final String nombre;

    protected Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String sonido();
}
