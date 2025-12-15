package com.docencia.mixto.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio8Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Pedido a = new Pedido("ID-1", null, 0);
        Pedido b = new Pedido("ID-1", null, 0);
        Pedido c = new Pedido("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Pedido a = new Pedido("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(164.0, Ejercicio8.totalPorEstado(new Pedido[]{new Pedido("P1","ENVIADO",120.0), new Pedido("P2","ENVIADO",50.0)}, "ENVIADO"), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Ejercicio8.totalPorEstado(new Pedido[]{}, "XXX"));
    }
}
