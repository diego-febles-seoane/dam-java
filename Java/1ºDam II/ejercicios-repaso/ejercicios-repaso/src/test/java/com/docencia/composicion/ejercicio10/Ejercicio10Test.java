package com.docencia.composicion.ejercicio10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    void gestorProyectos_basico() {
        var gestor = new GestorProyectos();
        var p1 = gestor.crearProyecto(" Proyecto A ");
        var pInvalido = gestor.crearProyecto("   ");
        assertNotNull(p1);
        assertNull(pInvalido);

        assertTrue(gestor.anadirTareaAProyecto("proyecto a", "Tarea 1"));
        assertTrue(gestor.anadirTareaAProyecto("Proyecto A", "Tarea 2"));
        assertFalse(gestor.anadirTareaAProyecto("Inexistente", "Tarea X"));
        assertFalse(gestor.anadirTareaAProyecto("Proyecto A", "   "));

        // Marcamos como completada la primera tarea
        p1.getTareas().get(0).marcarCompletada();

        assertEquals(1, gestor.contarTareasPendientes(" proyecto a "));
        assertEquals(0, gestor.contarTareasPendientes(" proyecto inexistente "));
    }
}
