package com.docencia.composicion.ejercicio13;


import java.util.ArrayList;
import java.util.List;


public class Libro {
    private final String titulo;
    private final String autor;
    private final int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }
}
