package com.docencia.mixto.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio19Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Ruta a = new Ruta("ID-1", null);
        Ruta b = new Ruta("ID-1", null);
        Ruta c = new Ruta("ID-2", null);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Ruta a = new Ruta("ID-1", null);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals("TOTAL=35;TIPO=MEDIA", Ejercicio19.kmsTotalYTipo(new Ruta("R1", new int[]{5,10,20})));
    }
}
