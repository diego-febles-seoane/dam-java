package unidad3;



public class Ejercicio02 {

    
    public static double operar(double a, double b, int opcion) {
        switch (opcion) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b == 0){
                    throw new ArithmeticException();
                }
                return a / b;
            default:
                throw new IllegalArgumentException();
        }
    }
}
