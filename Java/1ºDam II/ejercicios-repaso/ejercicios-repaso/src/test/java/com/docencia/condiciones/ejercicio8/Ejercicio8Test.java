package com.docencia.condiciones.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio8Test {
    @Test
    void caso1() {
        assertEquals(10.0, Ejercicio8.costeEnvio(2.0, 1), 0.0001);
    }

    @Test
    void caso2() {
        assertEquals(10.5, Ejercicio8.costeEnvio(1.5, 2), 0.0001);
    }

    @Test
    void zonaInvalidaDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio8.costeEnvio(1.0, 99));
    }
}
