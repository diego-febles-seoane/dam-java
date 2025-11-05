package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio7Test {

    @Test
    @Order(1)
    void nullAndEmptyCases() {
        assertEquals(0, Ejercicio7.lengthSafe(""));
        assertEquals(0, Ejercicio7.lengthSafe(null));

        assertEquals("", Ejercicio7.toUpperSafe(null));
        assertEquals("", Ejercicio7.toUpperSafe(""));

        assertEquals('\0', Ejercicio7.firstCharOrNullChar(""));
        assertEquals('\0', Ejercicio7.firstCharOrNullChar(null));
    }

    @Test
    @Order(2)
    void normalCases() {
        assertEquals(4, Ejercicio7.lengthSafe("Hola"));
        assertEquals("HOLA", Ejercicio7.toUpperSafe("Hola"));
        assertEquals('H', Ejercicio7.firstCharOrNullChar("Hola"));
    }
}
