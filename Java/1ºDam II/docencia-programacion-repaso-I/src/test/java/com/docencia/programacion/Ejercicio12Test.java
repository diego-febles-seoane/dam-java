package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio12Test {

    @Test
    @Order(1)
    void nullCases() {
        assertNull(Ejercicio12.reversedArray(null));
        assertFalse(Ejercicio12.containsValue(null, 42));
    }

    @Test
    @Order(2)
    void reversedArrayCheck() {
        int[] data = {10, 20, 30};
        int[] result = Ejercicio12.reversedArray(data);

        assertArrayEquals(new int[]{30,20,10}, result);
        assertNotSame(data, result);
    }

    @Test
    @Order(3)
    void containsValueCheck() {
        assertTrue(Ejercicio12.containsValue(new int[]{5,7,9}, 7));
        assertFalse(Ejercicio12.containsValue(new int[]{5,7,9}, 6));
    }
}
