package unidad3;

public class Ejercicio06 {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        if (n > 20) { // 21! no cabe en long
            throw new IllegalArgumentException("n demasiado grande");
        }

        long resultado = 1L;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
