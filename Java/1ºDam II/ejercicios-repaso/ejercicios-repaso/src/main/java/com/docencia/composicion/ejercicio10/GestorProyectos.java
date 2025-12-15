package com.docencia.composicion.ejercicio10;


import java.util.ArrayList;
import java.util.List;


public class GestorProyectos {
    private final List<Proyecto> proyectos = new ArrayList<>();

    public Proyecto crearProyecto(String nombre) {
        // TODO: validar nombre y añadir proyecto si es válido.
        if (nombre == null) {
            return null;
        }
        Proyecto p = new Proyecto(nombre);
        proyectos.add(p);
        return p;
    }

    public boolean anadirTareaAProyecto(String nombreProyecto, String descripcionTarea) {
        // TODO: implementar según enunciado/tests.
        return false;
    }

    public int contarTareasPendientes(String nombreProyecto) {
        // TODO: implementar según enunciado/tests.
        return 0;
    }

    public List<Proyecto> getProyectos() {
        return new ArrayList<>(proyectos);
    }
}
