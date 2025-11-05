package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio15Test {

    @Test
    @Order(1)
    void studentData() {
        Ejercicio15 s = new Ejercicio15("Lucia", 17);
        assertEquals("Lucia", s.getName());
        assertEquals(17, s.getAge());
    }

    @Test
    @Order(2)
    void adultCheck() {
        Ejercicio15 minor = new Ejercicio15("Alex", 15);
        Ejercicio15 adult = new Ejercicio15("Maria", 19);

        assertFalse(minor.isAdult());
        assertTrue(adult.isAdult());
    }
}
