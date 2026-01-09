package com.docencia.mixto.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Alumno a = new Alumno("ID-1", 0);
        Alumno b = new Alumno("ID-1", 0);
        Alumno c = new Alumno("ID-2", 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Alumno a = new Alumno("ID-1", 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals("APROBADOS=2;SUSPENSOS=1;SOBRESALIENTES=1", Ejercicio2.resumenAprobados(new Alumno[]{new Alumno("A1",4), new Alumno("A2",7), new Alumno("A3",10)}));
    }
}
