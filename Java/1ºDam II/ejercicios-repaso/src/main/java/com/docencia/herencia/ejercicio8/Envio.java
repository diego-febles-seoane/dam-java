package com.docencia.herencia.ejercicio8;


import java.util.List;


public abstract class Envio {
    private final String destino;
    private final double pesoKg;

    protected Envio(String destino, double pesoKg) {
        this.destino = destino;
        this.pesoKg = pesoKg;
    }

    public String getDestino() {
        return destino;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public abstract double calcularCoste();
}
