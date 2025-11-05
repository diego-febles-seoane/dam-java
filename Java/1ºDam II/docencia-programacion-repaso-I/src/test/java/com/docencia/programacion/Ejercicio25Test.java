package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio25Test {

    @Test
    @Order(1)
    void nullReturnsNull() {
        assertNull(Ejercicio25.bubbleSortAscending(null));
    }

    @Test
    @Order(2)
    void sortBasic() {
        int[] original = {5,1,4,2};
        int[] sorted = Ejercicio25.bubbleSortAscending(original);
        assertArrayEquals(new int[]{1,2,4,5}, sorted);
        assertNotSame(original, sorted);
    }
}
