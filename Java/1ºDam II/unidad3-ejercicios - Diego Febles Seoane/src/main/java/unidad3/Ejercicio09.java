package unidad3;

/**
 * Ejercicio 9: Estadísticas de una serie de números.
 */
public class Ejercicio09 {

    /**
     * Clase auxiliar con las estadísticas calculadas.
     */
    public static class Estadisticas {
        private final int cantidad;
        private final double media;
        private final int maximo;
        private final int minimo;

        public Estadisticas(int cantidad, double media, int maximo, int minimo) {
            this.cantidad = cantidad;
            this.media = media;
            this.maximo = maximo;
            this.minimo = minimo;
        }

        public int getCantidad() {
            return cantidad;
        }

        public double getMedia() {
            return media;
        }

        public int getMaximo() {
            return maximo;
        }

        public int getMinimo() {
            return minimo;
        }
    }

    public static Estadisticas calcularEstadisticas(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("array nulo");
        }
        if (numeros.length == 0) {
            throw new IllegalArgumentException("array vacío");
        }

        int cantidad = numeros.length;
        long suma = 0;
        int max = numeros[0];
        int min = numeros[0];
        for (int numero : numeros) {
            suma += numero;
            if (numero > max)
                max = numero;
            if (numero < min)
                min = numero;
        }
        double media = (double) suma / cantidad;
        return new Estadisticas(cantidad, media, max, min);
    }
}
