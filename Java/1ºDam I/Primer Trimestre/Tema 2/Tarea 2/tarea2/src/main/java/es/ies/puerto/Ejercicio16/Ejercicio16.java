package es.ies.puerto.Ejercicio16;

import es.ies.puerto.Ejercicio15.Producto;

/**
 * Crea un objeto de la clase Producto con nombre "Cámara", precio 300, y stock
 * 20. Realiza una venta de 5 unidades y muestra el stock restante y el total de
 * la venta.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Producto producto = new Producto("Cámara", 300, 20);

        int unidadesVendidas = 5;
        double totalVenta = producto.vender(unidadesVendidas);
        System.out.println("Stock actualizado: " + producto.getStock());
        System.out.println("Total de la venta: " + totalVenta);
    }
}
