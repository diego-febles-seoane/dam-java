package com.docencia.arrays.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio9Test {
    @Test
    void caso1() {
        assertEquals("a-b-c", Ejercicio9.concatenarConGuion(new String[]{"a","b","c"}));
    }

    @Test
    void caso2() {
        assertEquals("", Ejercicio9.concatenarConGuion(new String[]{}));
    }

    @Test
    void nullDebeDevolverVacio() {
        assertEquals("", Ejercicio9.concatenarConGuion(null));
    }

}
