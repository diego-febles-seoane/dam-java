package com.docencia.mixto.ejercicio15;

import java.util.Objects;

public class Alumno2 {
    private int id;
    private int asistencia;

    public Alumno2() {
        // TODO: constructor vacío
    }

    public Alumno2(int id, int asistencia) {
        // TODO: constructor con identificador y datos
        this.id = id;
        this.asistencia = asistencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
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
