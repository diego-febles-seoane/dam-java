package com.docencia.arrays.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio8Test {
    @Test
    void caso1() {
        assertEquals(3, Ejercicio8.contarOcurrencias(new int[]{1,2,2,2,3}, 2));
    }

}
