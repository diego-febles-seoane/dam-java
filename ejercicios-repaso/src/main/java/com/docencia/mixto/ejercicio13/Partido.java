package com.docencia.mixto.ejercicio13;

import java.util.Objects;

public class Partido {
    private String id;
    private String resultado;

    public Partido() {
        // TODO: constructor vacío
    }

    public Partido(String id, String resultado) {
        // TODO: constructor con identificador y datos
        this.id = id;
        this.resultado = resultado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
