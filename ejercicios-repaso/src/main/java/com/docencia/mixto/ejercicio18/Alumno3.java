package com.docencia.mixto.ejercicio18;

import java.util.Objects;

public class Alumno3 {
    private String dni;
    private int[] notas;

    public Alumno3() {
        // TODO: constructor vacío
    }

    public Alumno3(String dni, int[] notas) {
        // TODO: constructor con identificador y datos
        this.dni = dni;
        this.notas = notas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
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
