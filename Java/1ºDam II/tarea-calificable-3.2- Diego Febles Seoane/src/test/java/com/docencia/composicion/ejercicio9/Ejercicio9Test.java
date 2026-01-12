package com.docencia.composicion.ejercicio9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio9Test {

    @Test
    @Order(1)
    void anadirStockNormalizaNombreYAcumulaTest() {
        var inv = new Inventario();
        inv.anadirStock(" manzanas ", 10);
        inv.anadirStock("MANZANAS", 5);

        assertEquals(15, inv.stockDe("manzanas"));
        assertEquals(15, inv.stockDe(" MANZANAS "));
    }

    @Test
    @Order(2)
    void anadirStockAgregaProductosDistintosTest() {
        var inv = new Inventario();
        inv.anadirStock("manzanas", 15);
        inv.anadirStock("peras", 3);

        assertEquals(15, inv.stockDe("manzanas"));
        assertEquals(3, inv.stockDe(" PERAS "));
        assertEquals(18, inv.totalUnidades());
    }

    @Test
    @Order(3)
    void anadirStockOgnoraNombreInvalidoTest() {
        var inv = new Inventario();
        inv.anadirStock("   ", 100); // invalido
        inv.anadirStock(null, 50);   // invalido

        assertEquals(0, inv.totalUnidades());
        assertEquals(0, inv.stockDe("manzanas"));
    }

    @Test
    @Order(4)
    void anadirStockIgnoraCantidadNoPositivaTest() {
        var inv = new Inventario();
        inv.anadirStock("peras", -2); // invalido
        inv.anadirStock("naranja", 0); // invalido

        assertEquals(0, inv.totalUnidades());
        assertEquals(0, inv.stockDe("peras"));
        assertEquals(0, inv.stockDe("naranja"));
    }

    @Test
    @Order(5)
    void retirarStockDecrementaStockTest() {
        var inv = new Inventario();
        inv.anadirStock("manzanas", 15);

        assertTrue(inv.retirarStock("manzanas", 5));
        assertEquals(10, inv.stockDe("MANZANAS"));
        assertEquals(10, inv.totalUnidades());
    }

    @Test
    @Order(6)
    void retirarStockFallaSiNoHaySuficienteStock() {
        var inv = new Inventario();
        inv.anadirStock("manzanas", 10);

        assertFalse(inv.retirarStock("manzanas", 100));
        assertEquals(10, inv.stockDe("manzanas"));
    }

    @Test
    @Order(7)
    void retirarStockNombreInvalidoDevuelveFalseTest() {
        var inv = new Inventario();
        inv.anadirStock("manzanas", 10);

        assertFalse(inv.retirarStock(null, 5));
        assertFalse(inv.retirarStock("   ", 5));
        assertEquals(10, inv.stockDe("manzanas"));
    }

    @Test
    @Order(8)
    void stockDeProductoInexistenteFevuelveCeroTest() {
        var inv = new Inventario();
        inv.anadirStock("manzanas", 10);

        assertEquals(0, inv.stockDe("naranja"));
        assertEquals(0, inv.stockDe("   "));
        assertEquals(0, inv.stockDe(null));
    }

    @Test
    @Order(9)
    void totalUnidadesSumaCorrecta() {
        var inv = new Inventario();
        inv.anadirStock("manzanas", 15);
        inv.anadirStock("peras", 3);

        assertEquals(18, inv.totalUnidades());
    }
}

