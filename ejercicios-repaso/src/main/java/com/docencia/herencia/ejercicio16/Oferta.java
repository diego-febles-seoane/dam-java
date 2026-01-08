package com.docencia.herencia.ejercicio16;


import java.util.List;


public abstract class Oferta {
    private final double precioBase;

    protected Oferta(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double precioFinal();
}
