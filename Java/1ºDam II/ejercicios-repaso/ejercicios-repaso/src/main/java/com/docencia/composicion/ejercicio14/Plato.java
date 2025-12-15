package com.docencia.composicion.ejercicio14;


import java.util.ArrayList;
import java.util.List;


public class Plato {
    private final String nombre;
    private final double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
