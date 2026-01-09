package com.docencia.herencia.ejercicio16;


import java.util.List;


/**
 * Ejercicio 16
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio16 {

    private Ejercicio16() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class OfertaPorcentaje extends Oferta {
        private final double descuentoPorcentaje;

        public OfertaPorcentaje(double precioBase, double descuentoPorcentaje) {
            super(precioBase);
            this.descuentoPorcentaje = descuentoPorcentaje;
        }

        @Override
        public double precioFinal() {
            // TODO: aplicar descuento porcentual sin dejar precio negativo.
            return 0.0;
        }
    }

    public static class OfertaCantidadFija extends Oferta {
        private final double descuento;

        public OfertaCantidadFija(double precioBase, double descuento) {
            super(precioBase);
            this.descuento = descuento;
        }

        @Override
        public double precioFinal() {
            // TODO: aplicar descuento fijo sin dejar precio negativo.
            return 0.0;
        }
    }

    public static double sumaPreciosFinales(List<Oferta> ofertas) {
        // TODO: sumar precios finales de ofertas no nulas.
        return 0.0;
    }

}
