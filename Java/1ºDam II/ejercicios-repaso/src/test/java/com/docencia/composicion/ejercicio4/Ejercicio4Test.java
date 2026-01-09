package com.docencia.composicion.ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    @Test
    void enviarMensaje_y_filtrarPorDestinatario() {
        var bandeja = new BandejaMensajes();
        bandeja.enviarMensaje("Ana", "Luis", "Hola");
        bandeja.enviarMensaje("Carlos", "luis", "¿Qué tal?");
        bandeja.enviarMensaje("Ana", "  ", "Mensaje inválido");
        bandeja.enviarMensaje("Ana", null, "Mensaje inválido");
        bandeja.enviarMensaje("Ana", "Luis", "Otro mensaje");

        List<Mensaje> paraLuis =
                bandeja.mensajesPara(" lUiS ");

        assertEquals(3, paraLuis.size());
        assertEquals("Hola", paraLuis.get(0).getTexto());
        assertEquals("¿Qué tal?", paraLuis.get(1).getTexto());
        assertEquals("Otro mensaje", paraLuis.get(2).getTexto());
    }

    @Test
    void mensajesPara_destinatarioInvalido() {
        var bandeja = new BandejaMensajes();
        bandeja.enviarMensaje("Ana", "Luis", "Hola");
        assertTrue(bandeja.mensajesPara(null).isEmpty());
        assertTrue(bandeja.mensajesPara("  ").isEmpty());
    }
}
