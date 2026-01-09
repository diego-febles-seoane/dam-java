package com.docencia.composicion.ejercicio16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio16Test {

    @Test
    void estacionMeteorologica_basico() {
        var est = new EstacionMeteorologica();
        est.registrarMedicion("2025-01-01", 20.0);
        est.registrarMedicion("2025-01-02", 25.0);
        est.registrarMedicion("   ", 30.0);   // inválida
        est.registrarMedicion("2025-01-03", 15.0);

        assertEquals(25.0, est.maximaTemperatura(), 0.0001);
        assertEquals(2L, est.diasPorEncimaDe(17.0));
    }

    @Test
    void estacionMeteorologica_sinMedicionesValidas() {
        var est = new EstacionMeteorologica();
        assertNull(est.maximaTemperatura());
        assertEquals(0L, est.diasPorEncimaDe(0.0));
    }
}
