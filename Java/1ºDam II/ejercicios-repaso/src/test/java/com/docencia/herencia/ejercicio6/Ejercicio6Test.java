package com.docencia.herencia.ejercicio6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio6Test {

    @Test
    void dispositivos_consumoTotal() {
        var b = new Ejercicio6.Bombilla("Lámpara", 60.0); // 60 Wh
        var cEco = new Ejercicio6.Calefactor("Calefactor eco", 2000.0, true); // 1000 Wh
        var cNormal = new Ejercicio6.Calefactor("Calefactor normal", 2000.0, false); // 2000 Wh

        double total = Ejercicio6.consumoTotalHora(Arrays.asList(b, cEco, cNormal, null));
        assertEquals(60.0 + 1000.0 + 2000.0, total, 0.0001);
    }

    @Test
    void consumoTotal_listaNullOVacia() {
        assertEquals(0.0, Ejercicio6.consumoTotalHora(null), 0.0001);
        assertEquals(0.0, Ejercicio6.consumoTotalHora(Collections.emptyList()), 0.0001);
    }
}
