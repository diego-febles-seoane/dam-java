package com.docencia.herencia.ejercicio12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio12Test {

    @Test
    void figuras3D_volumenTotal() {
        Figura3D f1 =
                new Ejercicio12.Cubo(2.0); // 8
        Figura3D f2 =
                new Ejercicio12.Esfera(1.0); // 4/3 * pi * 1^3

        double total = Ejercicio12.volumenTotal(Arrays.asList(f1, f2, null));
        assertEquals(8.0 + 4.0 / 3.0 * Math.PI, total, 0.0001);
    }

    @Test
    void figuras3D_listaNullOVacia() {
        assertEquals(0.0, Ejercicio12.volumenTotal(null), 0.0001);
        assertEquals(0.0, Ejercicio12.volumenTotal(Collections.emptyList()), 0.0001);
    }
}
