package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio9_3 {
    /**
    * Para hacer la fusión, los guerreros deben tener la misma cantidad de ki. Si los valores de ki no coinciden, la fusión falla.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el nivel de Ki de Goku: ");
        int nivelKi = scanner.nextInt();
        System.out.println("Introduce el nivel de Ki de Vegeta: ");
        int nivelKi2 = scanner.nextInt();
        if (nivelKi == nivelKi2) {
            System.out.println("La fusión de Goku y Vegeta es exitosa, conoce a Gogeta");
        } else {
            System.out.println("La fusión de Goku y Vegeta falla, conoce a Crogeta");
            scanner.close();
        }
    }
}