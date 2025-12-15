package com.docencia.herencia.ejercicio13;


import java.util.List;


/**
 * Ejercicio 13
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio13 {

    private Ejercicio13() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Coche extends Vehiculo {
        private final int puertas;

        public Coche(String marca, int velocidadMaxima, int puertas) {
            super(marca, velocidadMaxima);
            this.puertas = puertas;
        }

        public int getPuertas() {
            return puertas;
        }

        @Override
        public boolean esRapido() {
            // TODO: rápido si velocidadMaxima >= 180.
            return false;
        }
    }

    public static class Moto extends Vehiculo {
        private final int cilindrada;

        public Moto(String marca, int velocidadMaxima, int cilindrada) {
            super(marca, velocidadMaxima);
            this.cilindrada = cilindrada;
        }

        public int getCilindrada() {
            return cilindrada;
        }

        @Override
        public boolean esRapido() {
            // TODO: rápido si velocidadMaxima >= 140.
            return false;
        }
    }

    public static int contarRapidos(List<Vehiculo> vehiculos) {
        // TODO: contar vehículos rápidos ignorando null.
        return 0;
    }

}
