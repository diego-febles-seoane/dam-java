package com.docencia.herencia.ejercicio11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio11Test {

    @Test
    void notificaciones_formatear() {
        Notificacion n1 =
                new NotificacionEmail("ana@example.com", "Saludo", "Hola");
        Notificacion n2 =
                new NotificacionSms("600123123", "Recordatorio");

        assertEquals("EMAIL a ana@example.com [Saludo]: Hola", n1.formatear());
        assertEquals("SMS a 600123123: Recordatorio", n2.formatear());

        var lista = NotificacionSms.formatearTodas(Arrays.asList(n1, null, n2));
        assertEquals(Arrays.asList(
                "EMAIL a ana@example.com [Saludo]: Hola",
                "SMS a 600123123: Recordatorio"
        ), lista);
    }

    @Test
    void notificaciones_listaNullOVacia() {
        assertTrue(NotificacionSms.formatearTodas(null).isEmpty());
        assertTrue(NotificacionSms.formatearTodas(Collections.emptyList()).isEmpty());
    }
}
