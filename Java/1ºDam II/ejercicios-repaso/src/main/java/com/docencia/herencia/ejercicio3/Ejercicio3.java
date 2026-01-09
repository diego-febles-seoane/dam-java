package com.docencia.herencia.ejercicio3;


import java.util.List;


/**
 * Ejercicio 3
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio3 {

    private Ejercicio3() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Perro extends Animal {
        public Perro(String nombre) {
            super(nombre);
        }

        @Override
        public String sonido() {
            // TODO: devolver "guau".
            return "";
        }
    }

    public static class Gato extends Animal {
        public Gato(String nombre) {
            super(nombre);
        }

        @Override
        public String sonido() {
            // TODO: devolver "miau".
            return "";
        }
    }

    public static String concatenarSonidos(List<Animal> animales) {
        // TODO: concatenar sonidos separados por espacio, ignorando animales null.
        return "";
    }

}
