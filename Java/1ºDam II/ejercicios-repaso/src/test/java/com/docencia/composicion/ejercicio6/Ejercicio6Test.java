package com.docencia.composicion.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio6Test {

    @Test
    void carritoCompra_basico() {
        var p1 = new Producto("Libro", 10.0);
        var p2 = new Producto("Bolígrafo", 1.0);
        var carrito = new CarritoCompra();

        carrito.anadirLinea(p1, 2);   // 20
        carrito.anadirLinea(p2, 3);   // 3
        carrito.anadirLinea(p2, 0);   // inválida
        carrito.anadirLinea(null, 5); // inválida

        double total = carrito.calcularTotal(10.0); // 10% IVA
        // base 23 -> 23 * 1.10 = 25.3
        assertEquals(25.3, total, 0.0001);
    }

    @Test
    void carritoCompra_sinLineasValidas() {
        var p = new Producto("Prueba", -5.0); // precio inválido
        var carrito = new CarritoCompra();
        carrito.anadirLinea(p, 2);
        double total = carrito.calcularTotal(21.0);
        assertEquals(0.0, total, 0.0001);
    }
}
