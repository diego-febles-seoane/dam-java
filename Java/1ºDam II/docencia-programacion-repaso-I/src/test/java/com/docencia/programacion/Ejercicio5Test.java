package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio5Test {

    @Test
    @Order(1)
    void convert0() {
        assertEquals(32.0, Ejercicio5.celsiusToFahrenheit(0.0), 0.0001);
    }

    @Test
    @Order(2)
    void convert22point5() {
        assertEquals(72.5, Ejercicio5.celsiusToFahrenheit(22.5), 0.0001);
    }

    @Test
    @Order(3)
    void convert100() {
        assertEquals(212.0, Ejercicio5.celsiusToFahrenheit(100.0), 0.0001);
    }
}
