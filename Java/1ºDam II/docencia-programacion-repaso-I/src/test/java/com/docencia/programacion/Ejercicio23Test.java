package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio23Test {

    @Test
    @Order(1)
    void randomRangeCheck() {
        for (int i = 0; i < 100; i++) {
            int r = Ejercicio23.randomInRange(1, 6);
            assertTrue(r >= 1 && r <= 6, "Out of range: " + r);
        }
    }
}
