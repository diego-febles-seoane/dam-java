package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio13Test {

    @Test
    @Order(1)
    void filterEvenNumbersNull() {
        int[] evens = Ejercicio13.filterEvenNumbers(null);
        assertArrayEquals(new int[0], evens);
    }

    @Test
    @Order(2)
    void filterEvenNumbersNoEven() {
        int[] evens = Ejercicio13.filterEvenNumbers(new int[]{1,3,5});
        assertArrayEquals(new int[0], evens);
    }

    @Test
    @Order(3)
    void filterEvenNumbersCheck() {
        int[] data = {1,2,3,4,5,6};
        int[] evens = Ejercicio13.filterEvenNumbers(data);
        assertArrayEquals(new int[]{2,4,6}, evens);
    }
}
