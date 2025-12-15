package com.docencia.composicion.ejercicio6;


import java.util.ArrayList;
import java.util.List;


public class CarritoCompra {
    private final List<LineaCarrito> lineas = new ArrayList<>();

    public void anadirLinea(Producto producto, int cantidad) {
        // TODO: validar producto, precio y cantidad.
        if (producto != null) {
            lineas.add(new LineaCarrito(producto, cantidad));
        }
    }

    public double calcularTotal(double porcentajeIva) {
        // TODO: sumar base y aplicar IVA.
        return 0.0;
    }

    public List<LineaCarrito> getLineas() {
        return new ArrayList<>(lineas);
    }
}
