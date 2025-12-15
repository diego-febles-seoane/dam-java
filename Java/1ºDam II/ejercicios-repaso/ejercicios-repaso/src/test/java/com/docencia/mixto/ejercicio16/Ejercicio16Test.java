package com.docencia.mixto.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio16Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Factura a = new Factura("ID-1", 0, 0);
        Factura b = new Factura("ID-1", 0, 0);
        Factura c = new Factura("ID-2", 0, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Factura a = new Factura("ID-1", 0, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(125.0, Ejercicio16.totalPorTrimestre(new Factura[]{new Factura("F1",2,100.0), new Factura("F2",5,50.0), new Factura("F3",3,25.0)}, 1), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Ejercicio16.totalPorTrimestre(new Factura[]{}, 99));
    }
}
