package com.docencia.condiciones.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {
    @Test
    void caso1() {
        assertEquals("Lunes", Ejercicio2.nombreDia(1));
    }

    @Test
    void caso2() {
        assertEquals("Domingo", Ejercicio2.nombreDia(7));
    }

    @Test
    void caso3() {
        assertEquals("ERROR", Ejercicio2.nombreDia(9));
    }

}
