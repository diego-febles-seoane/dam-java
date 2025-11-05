package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio27Test {

    @Test
    @Order(1)
    void invalidIndex() {
        assertEquals(0, Ejercicio27.sumRow(null, 0));
        assertEquals(0, Ejercicio27.sumRow(new int[][]{}, 5));
        assertEquals(0, Ejercicio27.sumColumn(null, 0));
    }

    @Test
    @Order(2)
    void matrixSums() {
        int[][] m = {
            {1,2,3},
            {4,5,6}
        };
        assertEquals(6, Ejercicio27.sumRow(m, 0));
        assertEquals(15, Ejercicio27.sumRow(m, 1));

        assertEquals(5, Ejercicio27.sumColumn(m, 0));
        assertEquals(7, Ejercicio27.sumColumn(m, 1));
        assertEquals(9, Ejercicio27.sumColumn(m, 2));
    }
}
