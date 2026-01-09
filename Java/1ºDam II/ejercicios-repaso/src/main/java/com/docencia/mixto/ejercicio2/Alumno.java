package com.docencia.mixto.ejercicio2;

import java.util.Objects;

public class Alumno {
    private String dni;
    private int nota;

    public Alumno() {
        // TODO: constructor vacío
    }

    public Alumno(String dni, int nota) {
        // TODO: constructor con identificador y datos

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: equals basado SOLO en el identificador único
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: hashCode consistente con equals
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: toString legible
        return super.toString();
    }
}
