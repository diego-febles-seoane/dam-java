package com.docencia.arrays.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio4Test {
    @Test
    void caso1() {
        assertArrayEquals(new int[]{3,2,1}, Ejercicio4.invertir(new int[]{1,2,3}));
    }

}
