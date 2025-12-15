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
            return getAnioPublicacion() >= anioActual - 5;
        }
    }

    public static class ArticuloPublicacion extends Publicacion {

        public ArticuloPublicacion(String titulo, int anioPublicacion) {
            super(titulo, anioPublicacion);
        }

        @Override
        public boolean esReciente(int anioActual) {
            return getAnioPublicacion() >= anioActual - 2;
        }
    }

    public static int contarRecientes(List<Publicacion> publicaciones, int anioActual) {
        int count = 0;
        for (Publicacion p : publicaciones) {
            if (p != null && p.esReciente(anioActual)) {
                count++;
            }
        }
        return count;
    }

}
