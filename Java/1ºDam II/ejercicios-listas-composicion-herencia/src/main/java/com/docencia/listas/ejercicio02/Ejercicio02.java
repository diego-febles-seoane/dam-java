package com.docencia.listas.ejercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio02 {

    private Ejercicio02() {
    }

    public static class GestorTareas {
        private final List<String> tareas = new ArrayList<>();

        public void agregarTarea(String tarea) {
            throw new UnsupportedOperationException("Por implementar");
        }

        public List<String> getTareas() {
            throw new UnsupportedOperationException("Por implementar");
        }

        public String completarTarea(int indice) {
            throw new UnsupportedOperationException("Por implementar");
        }

        public void borrarTodas() {
            throw new UnsupportedOperationException("Por implementar");
        }
    }
}
