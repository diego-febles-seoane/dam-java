package com.docencia.listas.ejercicio7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    void concatenarConSeparador_basico() {
        var partes = Arrays.asList("uno", "  ", null, "dos", "tres");
        String res = Ejercicio7.concatenarConSeparador(partes, " - ");
        assertEquals("uno - dos - tres", res);
    }

    @Test
    void concatenarConSeparador_separadorNullYSinPartesValidas() {
        String res1 = Ejercicio7.concatenarConSeparador(
                Arrays.asList("  ", null, "   "), null);
        assertEquals("", res1);

        String res2 = Ejercicio7.concatenarConSeparador(
                Arrays.asList("a", "b"), null);
        assertEquals("a, b", res2); // separador por defecto ", "
    }

    @Test
    void concatenarConSeparador_listaNullOVacia() {
        assertEquals("", Ejercicio7.concatenarConSeparador(null, ", "));
        assertEquals("", Ejercicio7.concatenarConSeparador(Collections.emptyList(), ", "));
    }
}
