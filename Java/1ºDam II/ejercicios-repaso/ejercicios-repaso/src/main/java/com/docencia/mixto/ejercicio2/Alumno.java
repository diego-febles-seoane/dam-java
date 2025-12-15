package com.docencia.mixto.ejercicio2;

import java.util.Objects;

public class Alumno {
    private String dni;
    private int nota;

    public Alumno() {
        // TODO: constructor vacío
    }

    public Alumno(String dni, int nota) {
        this.dni = dni;
        this.nota = nota;
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Alumno{dni='" + dni + "', nota=" + nota + "}";
    }
}
