package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio3Test {

    @Test
    @Order(1)
    void adultAgeCheck() {
        assertFalse(Ejercicio3.isAdult(17));
        assertTrue(Ejercicio3.isAdult(18));
        assertTrue(Ejercicio3.isAdult(30));
    }

    @Test
    @Order(2)
    void nextYearAge() {
        assertEquals(18, Ejercicio3.ageNextYear(17));
        assertEquals(1, Ejercicio3.ageNextYear(0));
    }
}
