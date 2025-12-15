package com.docencia.mixto.ejercicio12;

import java.util.Objects;

public class Envio {
    private String tracking;
    private int zona;
    private double peso;

    public Envio() {
        // TODO: constructor vacío
    }

    public Envio(String tracking, int zona, double peso) {
        // TODO: constructor con identificador y datos
        this.tracking = tracking;
        this.zona = zona;
        this.peso = peso;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
