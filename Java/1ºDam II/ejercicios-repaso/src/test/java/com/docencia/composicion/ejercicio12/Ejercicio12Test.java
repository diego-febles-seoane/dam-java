package com.docencia.composicion.ejercicio12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio12Test {

    @Test
    void mesaElectoral_basico() {
        var mesa = new MesaElectoral();
        mesa.registrarVoto(" Ana ");
        mesa.registrarVoto("Luis");
        mesa.registrarVoto("ANA");
        mesa.registrarVoto("   "); // inválido
        mesa.registrarVoto(null);  // inválido
        mesa.registrarVoto("luis");

        assertEquals(2, mesa.votosDe(" ana "));
        assertEquals(2, mesa.votosDe(" LUIS "));
        assertEquals(0, mesa.votosDe("   "));

        String ganador = mesa.ganador();
        // Ana y Luis empatan a 2 votos; Ana alcanzó antes ese máximo
        assertEquals("Ana", ganador);
    }

    @Test
    void mesaElectoral_sinVotosValidos() {
        var mesa = new MesaElectoral();
        assertNull(mesa.ganador());
    }
}
