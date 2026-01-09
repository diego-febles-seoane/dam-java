package com.docencia.listas.ejercicio12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio12Test {

    @Test
    void unionOrdenadaSinDuplicados_basico() {
        var a = Arrays.asList(1, 2, 2, null, 5);
        var b = Arrays.asList(3, 2, 5, 4, null);
        var res = Ejercicio12.unionOrdenadaSinDuplicados(a, b);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), res);
    }

    @Test
    void unionOrdenadaSinDuplicados_listasNullOVacias() {
        assertTrue(Ejercicio12.unionOrdenadaSinDuplicados(null, null).isEmpty());
        assertEquals(Arrays.asList(1, 2),
                Ejercicio12.unionOrdenadaSinDuplicados(Arrays.asList(1, 2), null));
        assertEquals(Arrays.asList(1, 2),
                Ejercicio12.unionOrdenadaSinDuplicados(null, Arrays.asList(2, 1)));
    }
}
