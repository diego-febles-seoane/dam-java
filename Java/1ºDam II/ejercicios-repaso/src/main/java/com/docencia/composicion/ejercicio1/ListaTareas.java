package com.docencia.composicion.ejercicio1;


import java.util.ArrayList;
import java.util.List;


public class ListaTareas {
    private final List<Tarea> tareas = new ArrayList<>();

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public void anadirTarea(String descripcion) {
        // provisional: añade incluso descripciones inválidas
        tareas.add(new Tarea(descripcion));
    }

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public boolean marcarComoCompletada(String descripcion) {
        // provisional: no encuentra nada
        return false;
    }

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public List<Tarea> obtenerPendientes() {
        // provisional: devuelve todas
        return new ArrayList<>(tareas);
    }
}
