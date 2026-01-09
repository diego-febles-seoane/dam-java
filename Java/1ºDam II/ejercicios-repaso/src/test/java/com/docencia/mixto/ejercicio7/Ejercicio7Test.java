package com.docencia.mixto.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio7Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Libro a = new Libro("ID-1", null, 0);
        Libro b = new Libro("ID-1", null, 0);
        Libro c = new Libro("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Libro a = new Libro("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(1, Ejercicio7.contarLargosPorGenero(new Libro[]{new Libro("L1","NOVELA",350), new Libro("L2","NOVELA",250), new Libro("L3","ENSAYO",220)}, "NOVELA"));
    }
}
