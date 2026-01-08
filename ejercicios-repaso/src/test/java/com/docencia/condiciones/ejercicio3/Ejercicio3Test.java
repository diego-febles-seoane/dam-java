package com.docencia.condiciones.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio3Test {
    @Test
    void caso1() {
        assertEquals(10, Ejercicio3.calculadora(8, 2, '+'));
    }

    @Test
    void caso2() {
        assertEquals(6, Ejercicio3.calculadora(8, 2, '-'));
    }

    @Test
    void caso3() {
        assertEquals(16, Ejercicio3.calculadora(8, 2, '*'));
    }

    @Test
    void caso4() {
        assertEquals(4, Ejercicio3.calculadora(8, 2, '/'));
    }

    @Test
    void opInvalidoDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio3.calculadora(1, 2, '%'));
    }
}
