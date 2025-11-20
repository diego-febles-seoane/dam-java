package unidad3;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio07 {

    public static class ParesImpares {
        private final List<Integer> pares;
        private final List<Integer> impares;

        public ParesImpares(List<Integer> pares, List<Integer> impares) {
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


    public static ParesImpares calcularParesImpares(int a, int b) {

        return new ParesImpares(null, null);
    }
}
