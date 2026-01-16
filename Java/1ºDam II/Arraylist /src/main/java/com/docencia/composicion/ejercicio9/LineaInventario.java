package com.docencia.composicion.ejercicio9;


import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 9
 *
 * Clase ejercicio de composicion 
 * @author santiago
 * @version 1.0.0
 */
public class LineaInventario  {
    private final Producto producto;
    private int cantidad;

    public LineaInventario(Producto producto, int cantidad) {
        this.producto = producto;
        setCantidad(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = 0;
        if(cantidad > 0){
            this.cantidad = cantidad;
        }
    }
}
