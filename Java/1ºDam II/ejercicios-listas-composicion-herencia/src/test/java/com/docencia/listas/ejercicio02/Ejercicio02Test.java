package com.docencia.listas.ejercicio02;

import com.docencia.listas.ejercicio02.Ejercicio02.GestorTareas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio02Test {

    @Test
    void gestorTareasBasico() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");

        assertEquals(2, gestor.getTareas().size());
        assertEquals("Tarea 1", gestor.getTareas().get(0));

        String completada = gestor.completarTarea(0);
        assertEquals("Tarea 1", completada);
        assertEquals(1, gestor.getTareas().size());

        gestor.borrarTodas();
        assertTrue(gestor.getTareas().isEmpty());
    }
}
