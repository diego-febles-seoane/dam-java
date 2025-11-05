package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio30Test {

    @Test
    @Order(1)
    void totalInventoryValue() {
        Ejercicio29 p1 = new Ejercicio29("Lapiz", 0.5, 10);
        Ejercicio29 p2 = new Ejercicio29("Cuaderno", 2.0, 3);
        Ejercicio30 inv = new Ejercicio30(new Ejercicio29[]{p1, p2});

        assertEquals(11.0, inv.getTotalStockValue(), 0.0001);
    }

    @Test
    @Order(2)
    void findProductByName() {
        Ejercicio29 p1 = new Ejercicio29("Lapiz", 0.5, 10);
        Ejercicio30 inv = new Ejercicio30(new Ejercicio29[]{p1});

        assertNotNull(inv.findByName("Lapiz"));
        assertNull(inv.findByName("Boligrafo"));
    }
}
