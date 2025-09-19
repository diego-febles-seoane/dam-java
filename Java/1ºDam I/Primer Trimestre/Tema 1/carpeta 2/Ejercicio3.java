import java.util.Scanner;

public class Ejercicio3 {
    /**
     * En un duelo de magos en Hogwarts, Harry necesita al menos 5 pociones de mana
     * para tener suficiente energía. Si tiene menos de 5 pociones, debe imprimir
     * "Pocas pociones, recarga antes del duelo". Si tiene 5 o más, debe imprimir
     * "Suficiente mana para el duelo".
     * 
     * @ahutor aday-ctr
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuántas pociones de mana tienes?");
        int pociones = scanner.nextInt();
        if (pociones < 5) {
            System.out.println("Pocas pociones, recarga antes del duelo");
        } else {
            System.out.println("Suficiente mana para el duelo");
        }

    }
}
