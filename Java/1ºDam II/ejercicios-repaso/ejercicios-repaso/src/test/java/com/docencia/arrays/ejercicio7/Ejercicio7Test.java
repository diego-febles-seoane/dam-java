package com.docencia.arrays.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio7Test {
    @Test
    void caso1() {
        assertEquals(true, Ejercicio7.sonIguales(new int[]{1,2}, new int[]{1,2}));
    }

    @Test
    void caso2() {
        assertEquals(false, Ejercicio7.sonIguales(new int[]{1,2}, new int[]{2,1}));
    }

}
