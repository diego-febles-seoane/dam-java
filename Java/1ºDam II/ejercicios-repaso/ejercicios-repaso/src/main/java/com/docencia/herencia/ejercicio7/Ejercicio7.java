package com.docencia.herencia.ejercicio7;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 7
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio7 {

    private Ejercicio7() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Estudiante extends Persona {
        private final String curso;

        public Estudiante(String nombre, String curso) {
            super(nombre);
            this.curso = curso;
        }

        @Override
        public String descripcionRol() {
            // TODO: devolver descripción según tests.
            return "";
        }
    }

    public static class Profesor extends Persona {
        private final String especialidad;

        public Profesor(String nombre, String especialidad) {
            super(nombre);
            this.especialidad = especialidad;
        }

        @Override
        public String descripcionRol() {
            // TODO: devolver descripción según tests.
            return "";
        }
    }

    public static List<String> descripciones(List<Persona> personas) {
        // TODO: devolver lista de descripciones de personas no nulas.
        return new ArrayList<>();
    }

}
