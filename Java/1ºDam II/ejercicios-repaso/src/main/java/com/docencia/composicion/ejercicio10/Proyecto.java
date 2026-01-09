package com.docencia.composicion.ejercicio10;


import java.util.ArrayList;
import java.util.List;


public class Proyecto {
    private final String nombre;
    private final List<Tarea> tareas = new ArrayList<>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() {
        return new ArrayList<>(tareas);
    }

    void anadirTarea(Tarea t) {
        tareas.add(t);
    }
}
