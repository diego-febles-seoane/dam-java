package com.docencia.listas.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio5Test {

    @Test
    void normalizarNombres_basico() {
        var entrada = Arrays.asList(" ana ", "PEDRO", null, "   ", "luIs");
        var res = Ejercicio5.normalizarNombres(entrada);
        assertEquals(Arrays.asList("Ana", "Pedro", "Luis"), res);
    }

    @Test
    void normalizarNombres_listaNullOVacia() {
        assertTrue(Ejercicio5.normalizarNombres(null).isEmpty());
        assertTrue(Ejercicio5.normalizarNombres(Collections.emptyList()).isEmpty());
    }
}
