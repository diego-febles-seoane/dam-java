package com.docencia.herencia.ejercicio15;

import java.util.List;

public class CursoPresencial extends Curso {
    private final String aula;

    public CursoPresencial(String nombre, int horas, String aula) {
        super(nombre, horas);
        this.aula = aula;
    }

    @Override
    public boolean esIntenso() {
        // TODO: intenso si horas >= 40.
        return false;
    }

    public static int contarIntensos(List<Curso> cursos) {
        // TODO: contar cursos intensos ignorando null.
        return 0;
    }
}
