package com.docencia.arrays.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio5Test {
    @Test
    void caso1() {
        assertEquals(1, Ejercicio5.indiceDe(new int[]{7,8,9}, 8));
    }

    @Test
    void caso2() {
        assertEquals(-1, Ejercicio5.indiceDe(new int[]{7,8,9}, 5));
    }

}
