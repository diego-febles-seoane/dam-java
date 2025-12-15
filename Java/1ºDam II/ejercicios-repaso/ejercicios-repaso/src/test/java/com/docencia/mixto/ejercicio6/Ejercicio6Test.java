package com.docencia.mixto.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio6Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Ticket a = new Ticket("ID-1", null, false);
        Ticket b = new Ticket("ID-1", null, false);
        Ticket c = new Ticket("ID-2", null, false);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Ticket a = new Ticket("ID-1", null, false);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(1, Ejercicio6.contarAbiertosPorPrioridad(new Ticket[]{new Ticket("T1","ALTA",false), new Ticket("T2","ALTA",true), new Ticket("T3","MEDIA",false)}, "ALTA"));
    }
}
