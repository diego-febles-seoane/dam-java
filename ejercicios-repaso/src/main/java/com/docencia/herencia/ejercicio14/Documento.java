package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;


public abstract class Documento {
    private final String titulo;

    protected Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract String descripcion();
}
