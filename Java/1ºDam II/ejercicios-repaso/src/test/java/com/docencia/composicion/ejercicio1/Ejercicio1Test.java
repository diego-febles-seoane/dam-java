package com.docencia.composicion.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    void anadirTarea_y_marcarComoCompletada() {
        var lista = new ListaTareas();
        lista.anadirTarea("  Estudiar ");
        lista.anadirTarea("  ");  // no debería añadirse
        lista.anadirTarea(null);  // no debería añadirse

        assertTrue(lista.marcarComoCompletada("estudiar"));
        List<Tarea> pendientes = lista.obtenerPendientes();
        assertEquals(0, pendientes.size());
    }

    @Test
    void marcarComoCompletada_tareaInexistente() {
        var lista = new ListaTareas();
        lista.anadirTarea("Comprar pan");
        assertFalse(lista.marcarComoCompletada("Ir al gimnasio"));
    }
}
