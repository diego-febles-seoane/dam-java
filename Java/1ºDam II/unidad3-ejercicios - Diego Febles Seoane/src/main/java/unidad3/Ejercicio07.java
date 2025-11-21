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
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }

        return new ParesImpares(pares, impares);
    }
}
