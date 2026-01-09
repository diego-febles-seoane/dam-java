package com.docencia.herencia.ejercicio8;

import java.util.List;

public class EnvioInternacional extends Envio {
        private final double tarifaBase;
        private final double precioPorKg;
        private final double recargo;

        public EnvioInternacional(String destino, double pesoKg, double tarifaBase, double precioPorKg, double recargo) {
            super(destino, pesoKg);
            this.tarifaBase = tarifaBase;
            this.precioPorKg = precioPorKg;
            this.recargo = recargo;
        }

        @Override
        public double calcularCoste() {
            // TODO: implementar coste con recargo según tests.
            return 0.0;
        }
    

    public static double costeTotal(List<Envio> envios) {
        // TODO: sumar costes de envíos no nulos.
        return 0.0;
    }

}
