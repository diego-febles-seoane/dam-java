package com.docencia.herencia.ejercicio12;


import java.util.List;


/**
 * Ejercicio 12
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio12 {

    private Ejercicio12() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Cubo extends Figura3D {
        private final double lado;

        public Cubo(double lado) {
            this.lado = lado;
        }

        @Override
        public double volumen() {
            // TODO: implementar volumen del cubo.
            return 0.0;
        }
    }

    public static class Esfera extends Figura3D {
        private final double radio;

        public Esfera(double radio) {
            this.radio = radio;
        }

        @Override
        public double volumen() {
            // TODO: implementar volumen de la esfera.
            return 0.0;
        }
    }

    public static double volumenTotal(List<Figura3D> figuras) {
        // TODO: sumar volúmenes de figuras no nulas.
        return 0.0;
    }

}
