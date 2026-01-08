package com.docencia.listas.ejercicio11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio11Test {

    @Test
    void ordenarDescSinNulls_basico() {
        var entrada = Arrays.asList(3, null, 1, 5, 2, null);
        var res = Ejercicio11.ordenarDescSinNulls(entrada);
        assertEquals(Arrays.asList(5, 3, 2, 1), res);
    }

    @Test
    void ordenarDescSinNulls_listaNullOVacia() {
        assertTrue(Ejercicio11.ordenarDescSinNulls(null).isEmpty());
        assertTrue(Ejercicio11.ordenarDescSinNulls(Collections.emptyList()).isEmpty());
    }
}
