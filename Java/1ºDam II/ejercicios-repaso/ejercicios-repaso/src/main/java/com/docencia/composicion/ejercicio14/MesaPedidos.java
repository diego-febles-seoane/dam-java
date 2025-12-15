package com.docencia.composicion.ejercicio14;


import java.util.ArrayList;
import java.util.List;


public class MesaPedidos {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void anadirPedido(Plato plato, int cantidad) {
        // TODO: validar plato, precio y cantidad.
        if (plato != null) {
            pedidos.add(new Pedido(plato, cantidad));
        }
    }

    public double importeTotal() {
        // TODO: sumar importes válidos.
        return 0.0;
    }

    public double importeConDescuento(double porcentaje) {
        // TODO: aplicar descuento sobre importeTotal.
        return 0.0;
    }

    public List<Pedido> getPedidos() {
        return new ArrayList<>(pedidos);
    }
}
