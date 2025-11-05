package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio6Test {

    @Test
    @Order(1)
    void priceNoTax() {
        double total = Ejercicio6.calculateFinalPrice(99.99, 0.0);
        assertEquals(99.99, total, 0.0001);
    }

    @Test
    @Order(2)
    void priceWithTax() {
        double total = Ejercicio6.calculateFinalPrice(10.00, 0.07);
        assertEquals(10.70, total, 0.0001);
    }
}
