package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio11Test {

    @Test
    @Order(1)
    void emptyOrNullCases() {
        assertEquals(0, Ejercicio11.sumArray(new int[]{}));
        assertEquals(0, Ejercicio11.sumArray(null));

        assertEquals(Integer.MIN_VALUE, Ejercicio11.maxArray(new int[]{}));
        assertEquals(Integer.MIN_VALUE, Ejercicio11.maxArray(null));
    }

    @Test
    @Order(2)
    void normalCases() {
        assertEquals(15, Ejercicio11.sumArray(new int[]{1,2,3,4,5}));
        assertEquals(9, Ejercicio11.maxArray(new int[]{1,9,2,3}));
        assertEquals(-5, Ejercicio11.maxArray(new int[]{-10, -5, -99}));
    }
}
