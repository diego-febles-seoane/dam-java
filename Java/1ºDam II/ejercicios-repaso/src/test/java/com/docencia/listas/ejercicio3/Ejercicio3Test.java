package com.docencia.listas.ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @Test
    void interseccionOrdenada_basico() {
        var a = Arrays.asList(1, 2, 2, 3, null, 5);
        var b = Arrays.asList(2, 3, 4, 5, 5);
        var res = Ejercicio3.interseccionOrdenada(a, b);
        assertEquals(Arrays.asList(2, 3, 5), res);
    }

    @Test
    void interseccionOrdenada_conListasNull() {
        assertTrue(Ejercicio3.interseccionOrdenada(null, null).isEmpty());
        assertTrue(Ejercicio3.interseccionOrdenada(Arrays.asList(1, 2), null).isEmpty());
    }
}
