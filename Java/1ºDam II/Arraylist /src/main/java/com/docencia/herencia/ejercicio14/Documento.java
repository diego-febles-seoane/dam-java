package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 14
 *
 * Ejercicio de herencias
 * @author santiago
 * @version 1.0.0
 */
public abstract class Documento {
    private final String titulo;

    protected Documento(String titulo) {
        if(titulo == null|| titulo.isBlank()){
            throw new IllegalArgumentException();
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo.trim();
    }

    public abstract String descripcion();
}
