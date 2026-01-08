package com.docencia.arrays.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {
    @Test
    void caso1() {
        assertEquals(9, Ejercicio2.maximo(new int[]{5,1,9,2}));
    }

    @Test
    void nullDebeDevolverCero() {
        assertEquals(0, Ejercicio2.maximo(null));
    }

    @Test
    void vacioDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio2.maximo(new int[]{}));
    }
}
