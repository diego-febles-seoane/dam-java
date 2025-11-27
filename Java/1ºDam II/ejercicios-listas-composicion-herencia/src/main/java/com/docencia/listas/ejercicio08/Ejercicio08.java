package com.docencia.listas.ejercicio08;

import java.util.List;

public class Ejercicio08 {

    private Ejercicio08() {
    }

    public static class ResultadoParticion {
        private final List<Integer> pares;
        private final List<Integer> impares;

        public ResultadoParticion(List<Integer> pares, List<Integer> impares) {
            this.pares = pares;
            this.impares = impares;
        }

        public List<Integer> getPares() {
            return pares;
        }

        public List<Integer> getImpares() {
            return impares;
        }
    }

    public static ResultadoParticion partir(List<Integer> lista) {
        throw new UnsupportedOperationException("Por implementar");
    }
}
