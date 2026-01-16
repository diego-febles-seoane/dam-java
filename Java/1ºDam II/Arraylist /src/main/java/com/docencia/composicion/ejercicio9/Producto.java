package com.docencia.composicion.ejercicio9;


import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 9
 *
 * Clase ejercicio de composicion 
 * @author santiago
 * @version 1.0.0
 */
public class Producto {
    private final String nombre;

    public Producto(String nombre) {
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException();
        }
        this.nombre = nombre.trim().toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }
}
