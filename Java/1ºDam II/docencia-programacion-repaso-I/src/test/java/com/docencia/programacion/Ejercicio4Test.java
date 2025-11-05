package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio4Test {

    @Test
    @Order(1)
    void areaCheck() {
        assertEquals(20, Ejercicio4.area(4,5));
        assertEquals(0, Ejercicio4.area(0,5));
    }

    @Test
    @Order(2)
    void perimeterCheck() {
        assertEquals(18, Ejercicio4.perimeter(4,5));
        assertEquals(10, Ejercicio4.perimeter(0,5));
    }
}
