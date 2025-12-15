package com.docencia.herencia.ejercicio10;


import java.util.List;


public abstract class Contenido {
    private final String titulo;
    private final int duracionMinutos;

    protected Contenido(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public abstract boolean esLargo();
}
