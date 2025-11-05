package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio9Test {

    @Test
    @Order(1)
    void absValueTest() {
        assertEquals(5, Ejercicio9.absValue(5));
        assertEquals(5, Ejercicio9.absValue(-5));
        assertEquals(0, Ejercicio9.absValue(0));
    }

    @Test
    @Order(2)
    void maxOfTwoTest() {
        assertEquals(10, Ejercicio9.maxOfTwo(10, 3));
        assertEquals(7, Ejercicio9.maxOfTwo(7, 7));
        assertEquals(-1, Ejercicio9.maxOfTwo(-5, -1));
    }

    @Test
    @Order(3)
    void distance2DTest() {
        assertEquals(5.0, Ejercicio9.distance2D(0,0,3,4), 0.0001);
        assertEquals(0.0, Ejercicio9.distance2D(2,2,2,2), 0.0001);
    }
}
