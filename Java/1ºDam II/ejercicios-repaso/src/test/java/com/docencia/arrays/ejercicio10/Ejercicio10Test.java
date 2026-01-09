package com.docencia.arrays.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio10Test {
    @Test
    void caso1() {
        assertArrayEquals(new int[]{0,2,0}, Ejercicio10.normalizarNegativos(new int[]{-1, 2, -3}));
    }

}
