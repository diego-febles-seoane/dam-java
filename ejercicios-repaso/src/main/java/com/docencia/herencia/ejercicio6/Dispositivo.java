package com.docencia.herencia.ejercicio6;


import java.util.List;


public abstract class Dispositivo {
    private final String nombre;

    protected Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double consumoHora();
}
