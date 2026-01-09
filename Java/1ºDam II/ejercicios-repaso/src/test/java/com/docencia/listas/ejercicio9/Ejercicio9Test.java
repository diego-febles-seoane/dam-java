package com.docencia.listas.ejercicio9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio9Test {

    @Test
    void sumarPositivos_basico() {
        int suma = Ejercicio9.sumarPositivos(Arrays.asList(-1, 0, 5, null, 3));
        assertEquals(8, suma);
    }

    @Test
    void sumarPositivos_listaNullOVacia() {
        assertEquals(0, Ejercicio9.sumarPositivos(null));
        assertEquals(0, Ejercicio9.sumarPositivos(Collections.emptyList()));
    }

    @Test
    void sumarPositivos_sinValoresPositivos() {
        int suma = Ejercicio9.sumarPositivos(Arrays.asList(-1, 0, null, -5));
        assertEquals(0, suma);
    }
}
