package com.docencia.herencia.ejercicio1;


import java.util.List;


/**
 * Ejercicio 1
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio1 {

    private Ejercicio1() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Circulo extends Figura {
        private final double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double area() {
            // TODO: implementar fórmula del área del círculo.
            return 0.0;
        }
    }

    public static class Rectangulo extends Figura {
        private final double ancho;
        private final double alto;

        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
        }

        @Override
        public double area() {
            // TODO: implementar área = ancho * alto.
            return 0.0;
        }
    }

    public static double areaTotal(List<Figura> figuras) {
        // TODO: sumar áreas de todas las figuras no nulas.
        return 0.0;
    }

}
