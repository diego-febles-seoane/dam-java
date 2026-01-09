package com.docencia.composicion.ejercicio14;


import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private final Plato plato;
    private final int cantidad;

    public Pedido(Plato plato, int cantidad) {
        this.plato = plato;
        this.cantidad = cantidad;
    }

    public Plato getPlato() {
        return plato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImporte() {
        return plato.getPrecio() * cantidad;
    }
}
