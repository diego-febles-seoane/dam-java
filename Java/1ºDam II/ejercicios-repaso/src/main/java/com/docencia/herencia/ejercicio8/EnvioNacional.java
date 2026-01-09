package com.docencia.herencia.ejercicio8;

public class EnvioNacional extends Envio {
    
        private final double tarifaBase;
        private final double precioPorKg;

        public EnvioNacional(String destino, double pesoKg, double tarifaBase, double precioPorKg) {
            super(destino, pesoKg);
            this.tarifaBase = tarifaBase;
            this.precioPorKg = precioPorKg;
        }

        @Override
        public double calcularCoste() {
            // TODO: implementar coste según tests.
            return 0.0;
        }
    }
