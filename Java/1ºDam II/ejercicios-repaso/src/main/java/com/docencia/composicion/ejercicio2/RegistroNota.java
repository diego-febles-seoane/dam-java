package com.docencia.composicion.ejercicio2;


import java.util.ArrayList;
import java.util.List;


public class RegistroNota {
    private final Alumno alumno;
    private final String asignatura;
    private final double nota;

    public RegistroNota(Alumno alumno, String asignatura, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public double getNota() {
        return nota;
    }
}
