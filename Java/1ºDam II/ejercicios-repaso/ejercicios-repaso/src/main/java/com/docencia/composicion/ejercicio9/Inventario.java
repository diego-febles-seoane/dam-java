package com.docencia.composicion.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<LineaInventario> lineas = new ArrayList<>();

    public void anadirStock(String nombreProducto, int cantidad) {
        if (nombreProducto == null || nombreProducto.trim().isEmpty() || cantidad <= 0) {
            return;
        }
        String nombre = nombreProducto.trim();
        for (LineaInventario li : lineas) {
            if (li.getProducto().getNombre().equalsIgnoreCase(nombre)) {
                li.setCantidad(li.getCantidad() + cantidad);
                return;
            }
        }
        lineas.add(new LineaInventario(new Producto(nombre), cantidad));
    }

    public boolean retirarStock(String nombreProducto, int cantidad) {
        if (nombreProducto == null || nombreProducto.trim().isEmpty() || cantidad <= 0) {
            return false;
        }
        String nombre = nombreProducto.trim();
        for (LineaInventario li : lineas) {
            if (li.getProducto().getNombre().equalsIgnoreCase(nombre)) {
                if (li.getCantidad() >= cantidad) {
                    li.setCantidad(li.getCantidad() - cantidad);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public int stockDe(String nombreProducto) {
        if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
            return 0;
        }
        String nombre = nombreProducto.trim();
        for (LineaInventario li : lineas) {
            if (li.getProducto().getNombre().equalsIgnoreCase(nombre)) {
                return li.getCantidad();
            }
        }
        return 0;
    }

    public int totalUnidades() {
        int total = 0;
        for (LineaInventario li : lineas) {
            total += li.getCantidad();
        }
        return total;
    }

    public List<LineaInventario> getLineas() {
        return new ArrayList<>(lineas);
    }
}
