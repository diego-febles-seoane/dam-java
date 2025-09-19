import java.util.Scanner;

public class Ejercicio4 {
    /**
     * El Imperio Galáctico necesita donaciones para construir la Estrella de la
     * Muerte.
     * Dependiendo del tipo de donante, la cantidad que donará será diferente:
     * • Tipo 1: dona el 10% del dinero
     * • Tipo 2: dona el 20%
     * • Tipo 3: dona el 50%
     * Si el tipo de donante no es válido, dona 0.
     * 
     * @ahutor aday-ctr
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingres eel tipo de donante (1, 2 o 3)");
        int tipoDonante = scanner.nextInt();
        System.out.println("Ingrese la cantidad de dinero que donará");
        double dinero = scanner.nextDouble();
        double donacion = 0;
        switch (tipoDonante) {
            case 1:
                donacion = dinero * 0.1;
                break;
            case 2:
                donacion = dinero * 0.2;
                break;
            case 3:
                donacion = dinero * 0.5;
                break;
            default:
                System.out.println("Tipo de donante no válido");
                return;
        }
        System.out.println("La donación es de $" + donacion);

    }
}
