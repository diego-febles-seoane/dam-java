package com.docencia.mixto.ejercicio16;

import java.util.Objects;

public class Factura {
    private String numero;
    private int mes;
    private double importe;

    public Factura() {
        // TODO: constructor vacío
    }

    public Factura(String numero, int mes, double importe) {
        // TODO: constructor con identificador y datos
        this.numero = numero;
        this.mes = mes;
        this.importe = importe;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
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
