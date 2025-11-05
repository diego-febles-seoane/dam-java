package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio2Test {

    @Test
    @Order(1)
    void greetingWithNullOrEmpty() {
        assertEquals("Hola.", Ejercicio2.buildGreeting(null));
        assertEquals("Hola.", Ejercicio2.buildGreeting(""));
    }

    @Test
    @Order(2)
    void greetingWithName() {
        assertEquals("Hola, Ana.", Ejercicio2.buildGreeting("Ana"));
    }
}
