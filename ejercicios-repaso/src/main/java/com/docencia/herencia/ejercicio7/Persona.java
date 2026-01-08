package com.docencia.herencia.ejercicio7;


import java.util.ArrayList;
import java.util.List;


public abstract class Persona {
    private final String nombre;

    protected Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String descripcionRol();
}
