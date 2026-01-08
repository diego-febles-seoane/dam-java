package com.docencia.mixto.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio5Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Reserva a = new Reserva("ID-1", null, 0, false);
        Reserva b = new Reserva("ID-1", null, 0, false);
        Reserva c = new Reserva("ID-2", null, 0, false);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Reserva a = new Reserva("ID-1", null, 0, false);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(202.0, Ejercicio5.precioTotal(new Reserva[]{new Reserva("R1","ALTA",2,true), new Reserva("R2","BAJA",1,false)}), 0.0001);
    }
}
