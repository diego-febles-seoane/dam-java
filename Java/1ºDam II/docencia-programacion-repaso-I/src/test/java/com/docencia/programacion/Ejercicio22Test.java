package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio22Test {

    @Test
    @Order(1)
    void dniInvalid() {
        assertFalse(Ejercicio22.isValidDni("1234567Z"));
        assertFalse(Ejercicio22.isValidDni("ABCDEFGHZ"));
        assertFalse(Ejercicio22.isValidDni("123456789"));
        assertFalse(Ejercicio22.isValidDni(null));
    }

    @Test
    @Order(2)
    void dniValid() {
        assertTrue(Ejercicio22.isValidDni("12345678Z"));
        assertTrue(Ejercicio22.isValidDni("00000000A"));
    }
}
