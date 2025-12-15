package com.docencia.mixto.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio10Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Movimiento a = new Movimiento("ID-1", null, 0);
        Movimiento b = new Movimiento("ID-1", null, 0);
        Movimiento c = new Movimiento("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Movimiento a = new Movimiento("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(80.0, Ejercicio10.saldoFinal(100.0, new Movimiento[]{new Movimiento("M1","RETIRO",30.0), new Movimiento("M2","INGRESO",10.0)}), 0.0001);
    }
}
