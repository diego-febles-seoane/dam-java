package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio35Test {

    @Test
    @Order(1)
    void operationsAndHistory() {
        Ejercicio35 acc = new Ejercicio35();
        acc.deposit(100.0);
        boolean w1 = acc.withdraw(40.0);
        boolean w2 = acc.withdraw(100.0);

        assertTrue(w1);
        assertFalse(w2);
        assertEquals(60.0, acc.getBalance(), 0.0001);

        String[] h = acc.getHistory();
        assertEquals(3, h.length);
        assertEquals("deposit 100.0", h[0]);
        assertEquals("withdraw 40.0 ok", h[1]);
        assertEquals("withdraw 100.0 denied", h[2]);

        h[0] = "hack";
        String[] again = acc.getHistory();
        assertEquals("deposit 100.0", again[0]);
    }
}
