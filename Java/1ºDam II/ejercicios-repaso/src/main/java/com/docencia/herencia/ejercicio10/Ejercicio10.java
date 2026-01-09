package com.docencia.herencia.ejercicio10;


import java.util.List;


/**
 * Ejercicio 10
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio10 {

    private Ejercicio10() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Pelicula extends Contenido {
        public Pelicula(String titulo, int duracionMinutos) {
            super(titulo, duracionMinutos);
        }

        @Override
        public boolean esLargo() {
            // TODO: implementar regla de longitud.
            return false;
        }
    }

    public static class Podcast extends Contenido {
        public Podcast(String titulo, int duracionMinutos) {
            super(titulo, duracionMinutos);
        }

        @Override
        public boolean esLargo() {
            // TODO: implementar regla de longitud.
            return false;
        }
    }

    public static int contarLargos(List<Contenido> contenidos) {
        // TODO: contar contenidos largos ignorando null.
        return 0;
    }

}
