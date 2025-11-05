package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio29Test {

    @Test
    @Order(1)
    void removeStockInvalid() {
        Ejercicio29 p = new Ejercicio29("Goma", 1.0, 2);
        boolean ok = p.removeStock(5);
        assertFalse(ok);
        assertEquals(2, p.getStock());
    }

    @Test
    @Order(2)
    void stockAndValue() {
        Ejercicio29 p = new Ejercicio29("Lapiz", 0.5, 10);
        assertEquals(5.0, p.getStockValue(), 0.0001);

        p.addStock(5);
        assertEquals(15, p.getStock());
        assertEquals(7.5, p.getStockValue(), 0.0001);

        boolean ok = p.removeStock(10);
        assertTrue(ok);
        assertEquals(5, p.getStock());
    }
}
