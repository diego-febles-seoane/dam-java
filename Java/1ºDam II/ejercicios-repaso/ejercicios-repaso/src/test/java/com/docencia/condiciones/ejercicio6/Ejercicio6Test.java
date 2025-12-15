package com.docencia.condiciones.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio6Test {
    @Test
    void caso1() {
        assertEquals(29, Ejercicio6.diasDelMes(2, 2024));
    }

    @Test
    void caso2() {
        assertEquals(28, Ejercicio6.diasDelMes(2, 2023));
    }

    @Test
    void caso3() {
        assertEquals(30, Ejercicio6.diasDelMes(11, 2025));
    }

}
