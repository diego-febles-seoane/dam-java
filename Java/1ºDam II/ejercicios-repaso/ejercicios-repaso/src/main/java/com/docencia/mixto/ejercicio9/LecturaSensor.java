package com.docencia.mixto.ejercicio9;

import java.util.Objects;

public class LecturaSensor {
    private String sensorId;
    private String tipo;
    private double valor;

    public LecturaSensor() {
        // TODO: constructor vacío
    }

    public LecturaSensor(String sensorId, String tipo, double valor) {
        // TODO: constructor con identificador y datos

    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
