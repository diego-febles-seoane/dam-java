package unidad3;

public class Ejercicio04 {

    public static class ContadorSignos {
        private final int positivos;
        private final int negativos;
        private final int ceros;

        public ContadorSignos(int positivos, int negativos, int ceros) {
            this.positivos = positivos;
            this.negativos = negativos;
            this.ceros = ceros;
        }

        public int getPositivos() {
            return positivos;
        }

        public int getNegativos() {
            return negativos;
        }

        public int getCeros() {
            return ceros;
        }
    }

    public static ContadorSignos contarSignos(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return new ContadorSignos(0, 0, 0);
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i : numeros) {
            if (i > 0)
                positivos++;
            else if (i < 0)
                negativos++;
            else
                ceros++;
        }

        return new ContadorSignos(positivos, negativos, ceros);
    }
}
