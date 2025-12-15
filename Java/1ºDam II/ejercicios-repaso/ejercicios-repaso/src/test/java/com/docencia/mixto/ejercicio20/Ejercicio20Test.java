package com.docencia.mixto.ejercicio20;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio20Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Examen a = new Examen("ID-1", null);
        Examen b = new Examen("ID-1", null);
        Examen c = new Examen("ID-2", null);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Examen a = new Examen("ID-1", null);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertArrayEquals(new int[]{3,1,1,1}, Ejercicio20.contarPorOpcion(new Examen("X1", new char[]{'A','B','A','D','C','A'})));
    }
}
