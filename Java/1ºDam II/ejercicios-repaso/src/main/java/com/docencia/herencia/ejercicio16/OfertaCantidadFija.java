package com.docencia.herencia.ejercicio16;

import java.util.List;

public class OfertaCantidadFija extends Oferta {
    private final double descuento;

    public OfertaCantidadFija(double precioBase, double descuento) {
        super(precioBase);
        this.descuento = descuento;
    }

    @Override
    public double precioFinal() {
        // TODO: aplicar descuento fijo sin dejar precio negativo.
        return 0.0;
    }

    public static double sumaPreciosFinales(List<Oferta> ofertas) {
        // TODO: sumar precios finales de ofertas no nulas.
        return 0.0;
    }
}
