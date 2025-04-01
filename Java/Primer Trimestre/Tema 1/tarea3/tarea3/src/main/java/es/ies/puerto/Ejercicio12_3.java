package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio12_3 {
    /**
    * Batman y Superman están peleando. Si la fuerza de Superman es mayor a la de Batman, Superman gana. Si es menor, Batman gana. Si tienen la misma fuerza, es un empate.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el numero de fuerza de Superman ");
        int fuerzaSuperman = scanner.nextInt();
        System.out.println("Introduce el numero de fuerza de Batman ");
        int fuerzaBatman = scanner.nextInt();
        if (fuerzaSuperman > fuerzaBatman) {
            System.out.println("Superman gana");
            } else if (fuerzaSuperman < fuerzaBatman) {
                System.out.println("Batman gana");
            } else {
                System.out.println("Empate");
            scanner.close();
        }
    }
}