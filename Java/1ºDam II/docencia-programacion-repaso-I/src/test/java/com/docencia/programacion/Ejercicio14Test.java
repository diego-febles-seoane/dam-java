package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio14Test {

    @Test
    @Order(1)
    void gradesStatsCheck() {
        double[] values = {5.5, 7.0, 9.25, 6.0};
        Ejercicio14 r = new Ejercicio14(values);

        assertEquals(9.25, r.getMaxGrade(), 0.0001);
        assertEquals(5.5,  r.getMinGrade(), 0.0001);

        double expectedAverage = (5.5 + 7.0 + 9.25 + 6.0) / 4.0;
        assertEquals(expectedAverage, r.getAverageGrade(), 0.0001);
    }

    @Test
    @Order(2)
    void defensiveCopyCheck() {
        double[] values = {10.0, 2.0};
        Ejercicio14 r = new Ejercicio14(values);
        values[0] = 0.0;

        assertEquals(10.0, r.getMaxGrade(), 0.0001);
        assertEquals(2.0,  r.getMinGrade(), 0.0001);
    }
}
