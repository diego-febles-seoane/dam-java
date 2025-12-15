package com.docencia.listas.ejercicio13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio13Test {

    @Test
    void filtrarMayoresYOrdenar_basico() {
        var lista = Arrays.asList(1, 5, null, 3, 10, 2);
        var res = Ejercicio13.filtrarMayoresYOrdenar(lista, 3);
        assertEquals(Arrays.asList(3, 5, 10), res);
    }

    @Test
    void filtrarMayoresYOrdenar_listaNullOVacia() {
        assertTrue(Ejercicio13.filtrarMayoresYOrdenar(null, 0).isEmpty());
        assertTrue(Ejercicio13.filtrarMayoresYOrdenar(Collections.emptyList(), 0).isEmpty());
    }

    @Test
    void filtrarMayoresYOrdenar_sinElementosValidos() {
        var lista = Arrays.asList(null, 1, 2);
        var res = Ejercicio13.filtrarMayoresYOrdenar(lista, 5);
        assertTrue(res.isEmpty());
    }
}
