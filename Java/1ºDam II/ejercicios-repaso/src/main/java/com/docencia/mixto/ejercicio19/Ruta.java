package com.docencia.mixto.ejercicio19;

import java.util.Objects;

public class Ruta {
    private String id;
    private int[] kms;

    public Ruta() {
        // TODO: constructor vacío
    }

    public Ruta(String id, int[] kms) {
        // TODO: constructor con identificador y datos
        this.id = id;
        this.kms = kms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getKms() {
        return kms;
    }

    public void setKms(int[] kms) {
        this.kms = kms;
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
