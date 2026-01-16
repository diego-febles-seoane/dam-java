package com.docencia.composicion.ejercicio9;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 9
 *
 * Clase ejercicio de composicion
 * 
 * @author santiago
 * @version 1.0.0
 */
public class Inventario {
    private final List<LineaInventario> lineas = new ArrayList<>();

    public void anadirStock(String nombreProducto, int cantidad) {
        if (nombreProducto == null || nombreProducto.isBlank()) {
            return;
        }
        lineas.add(new LineaInventario(new Producto(nombreProducto), cantidad));
    }

    public boolean retirarStock(String nombreProducto, int cantidad) {
        if (nombreProducto == null || nombreProducto.isBlank()) {
            return false;
        }
        nombreProducto = nombreProducto.trim().toUpperCase();
        int resultado = 0;
        for (LineaInventario lineaInventario : lineas) {
            if (lineaInventario != null) {
                if (lineaInventario.getProducto().getNombre().equals(nombreProducto)) {
                    if ((lineaInventario.getCantidad() - cantidad) > 0) {
                        lineaInventario.setCantidad(lineaInventario.getCantidad() - cantidad);
                        return true;
                    }
                    resultado = resultado + lineaInventario.getCantidad();
                }
            }
        }
        return false;
    }

    public int stockDe(String nombreProducto) {
        if(nombreProducto == null || nombreProducto.isBlank()){
            return 0;
        }
        nombreProducto = nombreProducto.trim().toUpperCase();
        int resultado = 0;
        for (LineaInventario lineaInventario : lineas) {
            if (lineaInventario != null) {
                if (lineaInventario.getProducto().getNombre().equals(nombreProducto)) {
                    resultado = resultado + lineaInventario.getCantidad();
                }
            }
        }

        return resultado;
    }

    public int totalUnidades() {
        int resultado = 0;
        for (LineaInventario lineaInventario : lineas) {
            if (lineaInventario != null) {
                resultado = resultado + lineaInventario.getCantidad();
            }

        }

        return resultado;
    }

    public List<LineaInventario> getLineas() {
        return new ArrayList<>(lineas);
    }
}
