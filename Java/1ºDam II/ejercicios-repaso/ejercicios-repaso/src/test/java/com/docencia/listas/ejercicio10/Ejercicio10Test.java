package com.docencia.listas.ejercicio10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    void filtrarPorPrefijo_basico() {
        var textos = Arrays.asList(" Ana", "Andrés ", "Pedro", null, "  antonio ", "  ");
        var res = Ejercicio10.filtrarPorPrefijo(textos, " an ");
        assertEquals(Arrays.asList("Ana", "Andrés", "antonio"), res);
    }

    @Test
    void filtrarPorPrefijo_prefijoInvalidoOListaNull() {
        assertTrue(Ejercicio10.filtrarPorPrefijo(null, "a").isEmpty());
        assertTrue(Ejercicio10.filtrarPorPrefijo(Collections.emptyList(), "a").isEmpty());
        assertTrue(Ejercicio10.filtrarPorPrefijo(Arrays.asList("Ana"), "   ").isEmpty());
        assertTrue(Ejercicio10.filtrarPorPrefijo(Arrays.asList("Ana"), null).isEmpty());
    }
}
