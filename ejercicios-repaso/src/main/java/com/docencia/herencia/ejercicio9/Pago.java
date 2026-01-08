package com.docencia.herencia.ejercicio9;


import java.util.List;


public abstract class Pago {
    private final double importeBase;

    protected Pago(double importeBase) {
        this.importeBase = importeBase;
    }

    public double getImporteBase() {
        return importeBase;
    }

    public abstract double calcularImporteFinal();
}
