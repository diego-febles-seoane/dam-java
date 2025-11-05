package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio26Test {

    @Test
    @Order(1)
    void mergeWithNull() {
        int[] a = {1,2};
        int[] m = Ejercicio26.mergeSorted(a,null);
        assertArrayEquals(new int[]{1,2}, m);
    }

    @Test
    @Order(2)
    void mergeEmpty() {
        int[] m = Ejercicio26.mergeSorted(new int[]{}, new int[]{});
        assertArrayEquals(new int[]{}, m);
    }

    @Test
    @Order(3)
    void mergeBasic() {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int[] m = Ejercicio26.mergeSorted(a,b);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, m);
    }
}
