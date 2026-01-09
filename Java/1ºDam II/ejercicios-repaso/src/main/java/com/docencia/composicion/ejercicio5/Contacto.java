package com.docencia.composicion.ejercicio5;


import java.util.ArrayList;
import java.util.List;


public class Contacto {
    private final String nombre;
    private final String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
