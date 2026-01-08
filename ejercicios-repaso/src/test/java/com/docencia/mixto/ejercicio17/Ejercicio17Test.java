package com.docencia.mixto.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio17Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Juego a = new Juego("ID-1", null, 0);
        Juego b = new Juego("ID-1", null, 0);
        Juego c = new Juego("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Juego a = new Juego("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(181.5, Ejercicio17.aplicarImpuesto(new Juego[]{new Juego("J1","PC",100.0), new Juego("J2","PC",50.0), new Juego("J3","MOVIL",10.0)}, "PC"), 0.0001);
    }
}
