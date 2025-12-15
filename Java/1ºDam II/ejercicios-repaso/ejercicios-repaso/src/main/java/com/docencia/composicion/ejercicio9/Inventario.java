package com.docencia.composicion.ejercicio9;


import java.util.ArrayList;
import java.util.List;


public class Inventario {
    private final List<LineaInventario> lineas = new ArrayList<>();

    public void anadirStock(String nombreProducto, int cantidad) {
        // TODO: implementar según enunciado/tests.
        if (nombreProducto == null) {
            return;
        }
        if (cantidad <= 0) {
            return;
        }
        lineas.add(new LineaInventario(new Producto(nombreProducto), cantidad));
    }

    public boolean retirarStock(String nombreProducto, int cantidad) {
        // TODO: implementar según enunciado/tests.
        return false;
    }

    public int stockDe(String nombreProducto) {
        // TODO: implementar según enunciado/tests.
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
