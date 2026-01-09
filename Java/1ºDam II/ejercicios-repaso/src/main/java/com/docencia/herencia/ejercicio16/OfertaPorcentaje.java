package com.docencia.herencia.ejercicio16;

public class OfertaPorcentaje extends Oferta {
    private final double descuentoPorcentaje;

    public OfertaPorcentaje(double precioBase, double descuentoPorcentaje) {
        super(precioBase);
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    @Override
    public double precioFinal() {
        // TODO: aplicar descuento porcentual sin dejar precio negativo.
        return 0.0;
    }
}