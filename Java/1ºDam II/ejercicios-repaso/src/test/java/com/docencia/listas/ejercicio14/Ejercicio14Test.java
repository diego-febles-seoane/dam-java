package com.docencia.listas.ejercicio14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio14Test {

    @Test
    void eliminarDuplicadosPreservandoOrden_basico() {
        var entrada = Arrays.asList("a", "b", "a", null, "c", "b");
        var res = Ejercicio14.eliminarDuplicadosPreservandoOrden(entrada);
        assertEquals(Arrays.asList("a", "b", "c"), res);
    }

    @Test
    void eliminarDuplicadosPreservandoOrden_listaNullOVacia() {
        assertTrue(Ejercicio14.eliminarDuplicadosPreservandoOrden(null).isEmpty());
        assertTrue(Ejercicio14.eliminarDuplicadosPreservandoOrden(Collections.emptyList()).isEmpty());
    }
}
