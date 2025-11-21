package unidad3;

public class Ejercicio08 {

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n debe ser >= 2");
        }
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        int limite = (int) Math.sqrt(n);
        for (int i = 3; i <= limite; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
