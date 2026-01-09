package com.docencia.composicion.ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    void gestorIncidencias_basico() {
        var gestor = new GestorIncidencias();

        var i1 = gestor.crearIncidencia("  Primera incidencia ");
        var i2 = gestor.crearIncidencia("Segunda incidencia");
        var iInvalida = gestor.crearIncidencia("   "); // null
        assertNotNull(i1);
        assertNotNull(i2);
        assertNull(iInvalida);

        assertEquals(2L, gestor.contarAbiertas());

        assertTrue(gestor.cerrarIncidencia(i1.getId()));
        assertEquals(1L, gestor.contarAbiertas());

        // Cerrar de nuevo la misma debe devolver false
        assertFalse(gestor.cerrarIncidencia(i1.getId()));
    }
}
