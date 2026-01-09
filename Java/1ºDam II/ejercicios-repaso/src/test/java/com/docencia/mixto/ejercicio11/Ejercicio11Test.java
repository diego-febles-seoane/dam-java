package com.docencia.mixto.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio11Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        ClaseAula a = new ClaseAula("ID-1", 0, 0);
        ClaseAula b = new ClaseAula("ID-1", 0, 0);
        ClaseAula c = new ClaseAula("ID-2", 0, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        ClaseAula a = new ClaseAula("ID-1", 0, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals("A1:VACIA\nA2:PARCIAL\nA3:LLENA", Ejercicio11.estadoAulas(new ClaseAula[]{new ClaseAula("A1",30,0), new ClaseAula("A2",20,10), new ClaseAula("A3",10,10)}));
    }
}
