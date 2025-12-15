package com.docencia.composicion.ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio5Test {

    @Test
    void agendaContactos_basico() {
        var agenda = new AgendaContactos();
        agenda.anadirContacto(" Ana ", "123456789");
        agenda.anadirContacto("  ", "000000000"); // inválido
        agenda.anadirContacto("Luis", "1234");    // inválido

        assertEquals("123456789", agenda.buscarTelefono("ana"));
        assertNull(agenda.buscarTelefono("Luis"));
    }

    @Test
    void agendaContactos_buscarNombreInvalido() {
        var agenda = new AgendaContactos();
        agenda.anadirContacto("Ana", "123456789");

        assertNull(agenda.buscarTelefono(null));
        assertNull(agenda.buscarTelefono("   "));
    }
}
