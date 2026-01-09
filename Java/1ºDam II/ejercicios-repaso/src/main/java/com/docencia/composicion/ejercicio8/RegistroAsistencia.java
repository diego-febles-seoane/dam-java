package com.docencia.composicion.ejercicio8;


import java.util.ArrayList;
import java.util.List;


public class RegistroAsistencia {
    private final Alumno alumno;
    private final String dia;
    private final boolean presente;

    public RegistroAsistencia(Alumno alumno, String dia, boolean presente) {
        this.alumno = alumno;
        this.dia = dia;
        this.presente = presente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public String getDia() {
        return dia;
    }

    public boolean isPresente() {
        return presente;
    }
}
