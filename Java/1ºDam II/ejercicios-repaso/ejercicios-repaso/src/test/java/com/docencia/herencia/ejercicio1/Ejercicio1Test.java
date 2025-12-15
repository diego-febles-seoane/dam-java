package com.docencia.herencia.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    void areaTotal_figuras() {
        Figura c =
                new Ejercicio1.Circulo(1.0); // área ~3.14159
        Figura r =
                new Ejercicio1.Rectangulo(2.0, 3.0); // área 6

        double total = Ejercicio1.areaTotal(Arrays.asList(c, r, null));
        assertEquals(Math.PI * 1.0 * 1.0 + 6.0, total, 0.0001);
    }

    @Test
    void areaTotal_listaNullOVacia() {
        assertEquals(0.0, Ejercicio1.areaTotal(null), 0.0001);
        assertEquals(0.0, Ejercicio1.areaTotal(Collections.emptyList()), 0.0001);
    }
}
