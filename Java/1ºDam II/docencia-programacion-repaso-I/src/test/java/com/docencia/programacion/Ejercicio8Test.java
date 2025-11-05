package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio8Test {

    @Test
    @Order(1)
    void invalidNumbers() {
        assertEquals(0, Ejercicio8.safeParseInt("hola"));
        assertEquals(0, Ejercicio8.safeParseInt("12abc"));
        assertEquals(0, Ejercicio8.safeParseInt(""));
        assertEquals(0, Ejercicio8.safeParseInt(null));
    }

    @Test
    @Order(2)
    void validNumbers() {
        assertEquals(123, Ejercicio8.safeParseInt("123"));
        assertEquals(-5, Ejercicio8.safeParseInt("-5"));
    }
}
