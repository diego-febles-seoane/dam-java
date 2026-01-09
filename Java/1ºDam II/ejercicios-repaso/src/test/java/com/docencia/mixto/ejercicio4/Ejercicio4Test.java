package com.docencia.mixto.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio4Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Vehiculo a = new Vehiculo("ID-1", null, 0);
        Vehiculo b = new Vehiculo("ID-1", null, 0);
        Vehiculo c = new Vehiculo("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Vehiculo a = new Vehiculo("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(146.0, Ejercicio4.impuestoTotal(new Vehiculo[]{new Vehiculo("M1","GASOLINA",2010), new Vehiculo("M2","ELECTRICO",2020)}, 2025), 0.0001);
    }
}
