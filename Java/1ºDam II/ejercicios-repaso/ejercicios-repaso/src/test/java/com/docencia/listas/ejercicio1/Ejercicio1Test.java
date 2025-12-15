package com.docencia.listas.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    void contarMayoresQue_basico() {
        int n = Ejercicio1.contarMayoresQue(Arrays.asList(1, 5, 10, null, 3), 3);
        assertEquals(2, n); // 5 y 10
    }

    @Test
    void contarMayoresQue_listaNullOVacia() {
        assertEquals(0, Ejercicio1.contarMayoresQue(null, 0));
        assertEquals(0, Ejercicio1.contarMayoresQue(Collections.emptyList(), 0));
    }

    @Test
    void contarMayoresQue_todosPorDebajo() {
        int n = Ejercicio1.contarMayoresQue(Arrays.asList(-1, 0, 1), 5);
        assertEquals(0, n);
    }
}
