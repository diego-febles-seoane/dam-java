package com.docencia.mixto.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio12Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Envio a = new Envio("ID-1", 0, 0);
        Envio b = new Envio("ID-1", 0, 0);
        Envio c = new Envio("ID-2", 0, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Envio a = new Envio("ID-1", 0, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(114, Ejercicio12.costeTotal(new Envio[]{new Envio("E1",1,2.0), new Envio("E2",3,12.0)}), 0.0001);
    }
}
