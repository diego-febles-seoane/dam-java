package com.docencia.mixto.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio15Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Alumno2 a = new Alumno2(1, 0);
        Alumno2 b = new Alumno2(1, 0);
        Alumno2 c = new Alumno2(2, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Alumno2 a = new Alumno2(1, 0);
        assertTrue(a.toString().contains(String.valueOf(1)));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals("APTO=2;NO_APTO=1", Ejercicio15.calcularEstado(new Alumno2[]{new Alumno2(1,90), new Alumno2(2,70), new Alumno2(3,80)}));
    }
}
