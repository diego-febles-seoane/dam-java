package com.docencia.composicion.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private final List<Tarea> tareas = new ArrayList<>();

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public void anadirTarea(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            tareas.add(new Tarea(descripcion.trim()));
        }
    }

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public boolean marcarComoCompletada(String descripcion) {
        for (Tarea t : tareas) {
            if (t.getDescripcion().equalsIgnoreCase(descripcion.trim())) {
                t.marcarCompletada();
                return true;
            }
        }
        return false;
    }

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public List<Tarea> obtenerPendientes() {
        List<Tarea> pendientes = new ArrayList<>();
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                pendientes.add(t);
            }
        }
        return pendientes;
    }
}
