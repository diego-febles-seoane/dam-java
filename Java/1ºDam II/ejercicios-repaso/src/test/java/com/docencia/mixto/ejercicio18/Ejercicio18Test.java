package com.docencia.mixto.ejercicio18;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio18Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Alumno3 a = new Alumno3("ID-1", null);
        Alumno3 b = new Alumno3("ID-1", null);
        Alumno3 c = new Alumno3("ID-2", null);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Alumno3 a = new Alumno3("ID-1", null);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals("MEDIA=6;ESTADO=APROBADO", Ejercicio18.mediaYEstado(new Alumno3("A1", new int[]{5,7,8})));
    }
}
