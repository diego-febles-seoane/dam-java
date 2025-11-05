package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio38Test {

    @Test
    @Order(1)
    void geometryAreas() {
        assertEquals(Math.PI, Ejercicio38.areaCircle(1.0), 0.0001);
        assertEquals(20.0, Ejercicio38.areaRectangle(5.0,4.0), 0.0001);
        assertEquals(20.0, Ejercicio38.areaTriangle(10.0,4.0), 0.0001);
    }
}
