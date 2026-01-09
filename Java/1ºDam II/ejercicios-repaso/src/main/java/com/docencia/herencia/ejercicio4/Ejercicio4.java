package com.docencia.herencia.ejercicio4;


import java.util.List;


/**
 * Ejercicio 4
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio4 {

    private Ejercicio4() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class LibroPublicacion extends Publicacion {

        public LibroPublicacion(String titulo, int anioPublicacion) {
            super(titulo, anioPublicacion);
        }

        @Override
        public boolean esReciente(int anioActual) {
            // TODO: reciente si tiene 5 años o menos.
            return false;
        }
    }

    public static class ArticuloPublicacion extends Publicacion {

        public ArticuloPublicacion(String titulo, int anioPublicacion) {
            super(titulo, anioPublicacion);
        }

        @Override
        public boolean esReciente(int anioActual) {
            // TODO: reciente si tiene 2 años o menos.
            return false;
        }
    }

    public static int contarRecientes(List<Publicacion> publicaciones, int anioActual) {
        // TODO: contar publicaciones recientes ignorando null.
        return 0;
    }

}
