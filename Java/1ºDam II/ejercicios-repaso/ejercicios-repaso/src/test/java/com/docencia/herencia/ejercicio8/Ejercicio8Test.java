package com.docencia.herencia.ejercicio8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio8Test {

    @Test
    void envios_costeTotal() {
        var e1 = new EnvioNacional("Madrid", 2.0, 5.0, 3.0);
        var e2 = new EnvioInternacional("París", 1.0, 10.0, 5.0, 2.0);

        double coste1 = e1.calcularCoste(); // 5 + 2*3 = 11
        double coste2 = e2.calcularCoste(); // (10 + 1*5) * 2 = 30

        assertEquals(11.0, coste1, 0.0001);
        assertEquals(30.0, coste2, 0.0001);

        double total = EnvioInternacional.costeTotal(Arrays.asList(e1, e2, null));
        assertEquals(41.0, total, 0.0001);
    }

    @Test
    void costeTotal_listaNullOVacia() {
        assertEquals(0.0, EnvioInternacional.costeTotal(null), 0.0001);
        assertEquals(0.0, EnvioInternacional.costeTotal(Collections.emptyList()), 0.0001);
    }
}
