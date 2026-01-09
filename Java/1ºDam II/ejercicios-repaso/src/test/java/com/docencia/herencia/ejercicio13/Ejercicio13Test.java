package com.docencia.herencia.ejercicio13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio13Test {

    @Test
    void vehiculos_basico() {
        Vehiculo v1 =
                new Ejercicio13.Coche("Marca1", 180, 5); // rápido
        Vehiculo v2 =
                new Ejercicio13.Coche("Marca2", 150, 3); // no rápido
        Vehiculo v3 =
                new Ejercicio13.Moto("Marca3", 140, 600); // rápida
        Vehiculo v4 =
                new Ejercicio13.Moto("Marca4", 100, 125); // no rápida

        assertTrue(v1.esRapido());
        assertFalse(v2.esRapido());
        assertTrue(v3.esRapido());
        assertFalse(v4.esRapido());

        int rapidos = Ejercicio13.contarRapidos(Arrays.asList(v1, v2, v3, v4, null));
        assertEquals(2, rapidos);
    }

    @Test
    void vehiculos_listaNullOVacia() {
        assertEquals(0, Ejercicio13.contarRapidos(null));
        assertEquals(0, Ejercicio13.contarRapidos(Collections.emptyList()));
    }
}
