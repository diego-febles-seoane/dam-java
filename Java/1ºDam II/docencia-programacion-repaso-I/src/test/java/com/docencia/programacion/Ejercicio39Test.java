package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio39Test {

    @Test
    @Order(1)
    void factorialCheck() {
        assertEquals(1L, Ejercicio39.factorial(0));
        assertEquals(120L, Ejercicio39.factorial(5));
    }

    @Test
    @Order(2)
    void fibonacciCheck() {
        assertEquals(0L, Ejercicio39.fibonacci(0));
        assertEquals(1L, Ejercicio39.fibonacci(1));
        assertEquals(8L, Ejercicio39.fibonacci(6));
    }
}
