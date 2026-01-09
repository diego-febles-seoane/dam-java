package com.docencia.composicion.ejercicio14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio14Test {

    @Test
    void restaurante_basico() {
        var p1 = new Plato("Pizza", 10.0);
        var p2 = new Plato("Agua", 1.0);
        var mesa = new MesaPedidos();

        mesa.anadirPedido(p1, 2);   // 20
        mesa.anadirPedido(p2, 3);   // 3
        mesa.anadirPedido(p2, 0);   // inválido
        mesa.anadirPedido(null, 5); // inválido
        mesa.anadirPedido(new Plato("Raro", -5.0), 1); // inválido

        double total = mesa.importeTotal();
        assertEquals(23.0, total, 0.0001);

        double conDescuento = mesa.importeConDescuento(10.0); // 10% descuento
        assertEquals(20.7, conDescuento, 0.0001);
    }

    @Test
    void restaurante_descuentoNegativo() {
        var p1 = new Plato("Prueba", 10.0);
        var mesa = new MesaPedidos();
        mesa.anadirPedido(p1, 1);

        double total = mesa.importeConDescuento(-5.0); // debe tratarse como 0%
        assertEquals(10.0, total, 0.0001);
    }
}
