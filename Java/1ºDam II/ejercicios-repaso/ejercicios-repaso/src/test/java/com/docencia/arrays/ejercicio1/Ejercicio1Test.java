package com.docencia.arrays.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    @Test
    void caso1() {
        assertEquals(10, Ejercicio1.sumar(new int[]{1,2,3,4}));
    }

    @Test
    void caso2() {
        assertEquals(0, Ejercicio1.sumar(new int[]{}));
    }

    @Test
    void nullDebeDevolverCero() {
        assertEquals(0, Ejercicio1.sumar(null));
    }

}
