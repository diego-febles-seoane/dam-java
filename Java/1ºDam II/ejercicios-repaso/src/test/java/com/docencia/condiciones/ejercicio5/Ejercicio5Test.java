package com.docencia.condiciones.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio5Test {
    @Test
    void caso1() {
        assertEquals(true, Ejercicio5.esBisiesto(2000));
    }

    @Test
    void caso2() {
        assertEquals(false, Ejercicio5.esBisiesto(1900));
    }

    @Test
    void caso3() {
        assertEquals(true, Ejercicio5.esBisiesto(2024));
    }

    @Test
    void caso4() {
        assertEquals(false, Ejercicio5.esBisiesto(2023));
    }

}
