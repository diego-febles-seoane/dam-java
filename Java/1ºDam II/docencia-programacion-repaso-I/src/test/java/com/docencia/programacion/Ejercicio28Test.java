package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio28Test {

    @Test
    @Order(1)
    void magnitudeCheck() {
        Ejercicio28 v = new Ejercicio28(3,4);
        assertEquals(5.0, v.magnitude(), 0.0001);
    }

    @Test
    @Order(2)
    void distanceCheck() {
        Ejercicio28 a = new Ejercicio28(0,0);
        Ejercicio28 b = new Ejercicio28(3,4);
        assertEquals(5.0, a.distanceTo(b), 0.0001);
    }

    @Test
    @Order(3)
    void vectorAddition() {
        Ejercicio28 v1 = new Ejercicio28(1,2);
        Ejercicio28 v2 = new Ejercicio28(3,4);
        Ejercicio28 sum = v1.add(v2);

        assertEquals(4.0, sum.getX(), 0.0001);
        assertEquals(6.0, sum.getY(), 0.0001);
    }
}
