package com.docencia.condiciones.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    @Test
    void caso1() {
        assertEquals("SUSPENSO", Ejercicio1.clasificarNota(4));
    }

    @Test
    void caso2() {
        assertEquals("APROBADO", Ejercicio1.clasificarNota(5));
    }

    @Test
    void caso3() {
        assertEquals("NOTABLE", Ejercicio1.clasificarNota(7));
    }

    @Test
    void caso4() {
        assertEquals("SOBRESALIENTE", Ejercicio1.clasificarNota(10));
    }

}
