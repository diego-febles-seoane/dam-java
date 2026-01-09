package com.docencia.herencia.ejercicio9;

import java.util.List;

public class PagoTarjeta extends Pago {
        private final double recargoPorcentaje;

        public PagoTarjeta(double importeBase, double recargoPorcentaje) {
            super(importeBase);
            this.recargoPorcentaje = recargoPorcentaje;
        }

        @Override
        public double calcularImporteFinal() {
            // TODO: implementar según enunciado/tests.
            return 0.0;
        }
    

    public static double totalPagos(List<Pago> pagos) {
        // TODO: sumar importes finales de pagos no nulos.
        return 0.0;
    }
}
