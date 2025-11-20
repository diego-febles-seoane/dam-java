package unidad3;

public class Ejercicio10 {

    public static String cuadrado(int n) {
        return null;
    }

    /**
     * Genera un triángulo rectángulo de asteriscos de altura n.
     *
     * @param n altura (>=1)
     * @return String con el triángulo (cada línea terminada en '\n', excepto la última)
     */
    public static String triangulo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n debe ser >= 1");
        }

        StringBuilder sb = new StringBuilder();
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 0; col < fila; col++) {
                sb.append('*');
            }
            if (fila < n) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
