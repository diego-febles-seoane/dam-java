package com.docencia.mixto.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio3Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Empleado a = new Empleado("ID-1", null, 0, 0, 0);
        Empleado b = new Empleado("ID-1", null, 0, 0, 0);
        Empleado c = new Empleado("ID-2", null, 0, 0, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Empleado a = new Empleado("ID-1", null, 0, 0, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(2200.0, Ejercicio3.nominaTotal(new Empleado[]{new Empleado("E1","FIJO",0,1000.0,6), new Empleado("E2","HORAS",80,0.0,2)}), 0.0001);
    }
}
