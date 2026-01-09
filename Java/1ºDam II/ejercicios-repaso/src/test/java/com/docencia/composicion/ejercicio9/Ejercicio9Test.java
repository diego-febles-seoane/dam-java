package com.docencia.composicion.ejercicio9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio9Test {

    @Test
    void inventario_basico() {
        var inv = new Inventario();
        inv.anadirStock(" manzanas ", 10);
        inv.anadirStock("MANZANAS", 5);
        inv.anadirStock("peras", 3);
        inv.anadirStock("   ", 100); // inválido
        inv.anadirStock("peras", -2); // inválido

        assertEquals(15, inv.stockDe("manzanas"));
        assertEquals(3, inv.stockDe(" PERAS "));
        assertEquals(18, inv.totalUnidades());

        assertTrue(inv.retirarStock("manzanas", 5));
        assertEquals(10, inv.stockDe("MANZANAS"));

        assertFalse(inv.retirarStock("manzanas", 100)); // no hay tanto stock
        assertEquals(10, inv.stockDe("manzanas"));
    }

    @Test
    void inventario_nombreInvalidoOCantidadInvalida() {
        var inv = new Inventario();
        inv.anadirStock(null, 10);
        inv.anadirStock("   ", 10);
        inv.anadirStock("naranja", 0);

        assertEquals(0, inv.totalUnidades());
        assertFalse(inv.retirarStock(null, 5));
        assertEquals(0, inv.stockDe("naranja"));
    }
}
