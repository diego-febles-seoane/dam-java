package com.docencia.herencia.ejercicio15;

public class CursoOnline extends Curso {
    private final String plataforma;

    public CursoOnline(String nombre, int horas, String plataforma) {
        super(nombre, horas);
        this.plataforma = plataforma;
    }

    @Override
    public boolean esIntenso() {
        // TODO: intenso si horas >= 40.
        return false;
    }
}
