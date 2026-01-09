package com.docencia.listas.ejercicio2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void invertirYFiltrarNoVacias_basico() {
        var res = Ejercicio2.invertirYFiltrarNoVacias(
                Arrays.asList("hola", "  ", null, "adios")
        );
        assertEquals(Arrays.asList("aloh", "soida"), res);
    }

    @Test
    void invertirYFiltrarNoVacias_listaNullOVacia() {
        assertTrue(Ejercicio2.invertirYFiltrarNoVacias(null).isEmpty());
        assertTrue(Ejercicio2.invertirYFiltrarNoVacias(Collections.emptyList()).isEmpty());
    }
}
