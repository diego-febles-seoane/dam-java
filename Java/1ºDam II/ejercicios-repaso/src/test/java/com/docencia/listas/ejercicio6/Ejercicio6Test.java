package com.docencia.listas.ejercicio6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio6Test {

    @Test
    void contarOcurrencias_basico() {
        var lista = Arrays.asList("Hola", " hola ", "adiós", null, "HOLA");
        int n = Ejercicio6.contarOcurrencias(lista, " hola ");
        assertEquals(3, n);
    }

    @Test
    void contarOcurrencias_listaNullObjetivoInvalido() {
        assertEquals(0, Ejercicio6.contarOcurrencias(null, "hola"));
        assertEquals(0, Ejercicio6.contarOcurrencias(Collections.singletonList("hola"), "   "));
        assertEquals(0, Ejercicio6.contarOcurrencias(Collections.singletonList("hola"), null));
    }
}
