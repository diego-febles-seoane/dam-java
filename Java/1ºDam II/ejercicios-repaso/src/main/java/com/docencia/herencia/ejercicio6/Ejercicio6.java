package com.docencia.herencia.ejercicio6;


import java.util.List;


/**
 * Ejercicio 6
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio6 {

    private Ejercicio6() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class Bombilla extends Dispositivo {
        private final double vatios;

        public Bombilla(String nombre, double vatios) {
            super(nombre);
            this.vatios = vatios;
        }

        @Override
        public double consumoHora() {
            // TODO: devolver consumo horario en Wh (vatios * 1h).
            return 0.0;
        }
    }

    public static class Calefactor extends Dispositivo {
        private final double potenciaVatios;
        private final boolean modoEco;

        public Calefactor(String nombre, double potenciaVatios, boolean modoEco) {
            super(nombre);
            this.potenciaVatios = potenciaVatios;
            this.modoEco = modoEco;
        }

        @Override
        public double consumoHora() {
            // TODO: si modoEco es true, consumir la mitad de potencia.
            return 0.0;
        }
    }

    public static double consumoTotalHora(List<Dispositivo> dispositivos) {
        // TODO: sumar consumos de dispositivos no nulos.
        return 0.0;
    }

}
