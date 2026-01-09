package com.docencia.composicion.ejercicio6;


import java.util.ArrayList;
import java.util.List;


public class LineaCarrito {
    private final Producto producto;
    private final int cantidad;

    public LineaCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImporte() {
        return producto.getPrecio() * cantidad;
    }
}
