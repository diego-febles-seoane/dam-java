package com.docencia.mixto.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio13Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Partido a = new Partido("ID-1", null);
        Partido b = new Partido("ID-1", null);
        Partido c = new Partido("ID-2", null);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Partido a = new Partido("ID-1", null);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(4, Ejercicio13.puntosTotales(new Partido[]{new Partido("1","G"), new Partido("2","E"), new Partido("3","P")}));
    }
}
