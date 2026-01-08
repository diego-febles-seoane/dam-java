package com.docencia.mixto.ejercicio20;

import java.util.Objects;

public class Examen {
    private String codigo;
    private char[] respuestas;

    public Examen() {
        // TODO: constructor vacío
    }

    public Examen(String codigo, char[] respuestas) {
        // TODO: constructor con identificador y datos
        this.codigo = codigo;
        this.respuestas = respuestas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(char[] respuestas) {
        this.respuestas = respuestas;
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
