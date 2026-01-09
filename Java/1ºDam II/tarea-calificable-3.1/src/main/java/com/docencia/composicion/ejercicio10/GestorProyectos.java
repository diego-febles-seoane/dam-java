package com.docencia.composicion.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class GestorProyectos {
    private final List<Proyecto> proyectos = new ArrayList<>();

    public Proyecto crearProyecto(String nombre) {
        if (nombre == null)
            return null;
        String trim = nombre.trim();
        if (trim.isEmpty())
            return null;
        Proyecto p = new Proyecto(trim);
        proyectos.add(p);
        return p;
    }

    public boolean anadirTareaAProyecto(String nombreProyecto, String descripcionTarea) {
        if (nombreProyecto == null || descripcionTarea == null)
            return false;
        String nombreP = nombreProyecto.trim();
        String desc = descripcionTarea.trim();
        if (nombreP.isEmpty() || desc.isEmpty())
            return false;

        for (Proyecto p : proyectos) {
            if (p.getNombre().equalsIgnoreCase(nombreP)) {
                Tarea t = new Tarea(desc);
                p.anadirTarea(t);
                return true;
            }
        }
        return false;
    }

    public int contarTareasPendientes(String nombreProyecto) {
        if (nombreProyecto == null)
            return 0;
        String nombreP = nombreProyecto.trim();
        if (nombreP.isEmpty())
            return 0;
        for (Proyecto p : proyectos) {
            if (p.getNombre().equalsIgnoreCase(nombreP)) {
                int contador = 0;
                for (Tarea t : p.getTareas()) {
                    if (!t.isCompletada())
                        contador++;
                }
                return contador;
            }
        }
        return 0;
    }

    public List<Proyecto> getProyectos() {
        return new ArrayList<>(proyectos);
    }
}
