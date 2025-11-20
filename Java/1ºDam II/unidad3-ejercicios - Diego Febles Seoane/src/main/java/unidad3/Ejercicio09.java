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
            this.media = 0;
            this.maximo = 0;
            this.minimo = 0;
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
        
        return new Estadisticas(numeros.length, 0, 0, 0);
    }
}
