package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio9_2 {
    /**
    * Escribe un programa que pida dos números enteros al usuario y determine cuál de ellos es mayor, o si son iguales.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("El numero "  + numero1 + " es mayor que el numero " + numero2);
            } else if (numero1 < numero2) {
                System.out.println("El numero "  + numero2 + " es mayor que el numero " + numero1);
                } else {
                    System.out.println("Los valores son iguales");
                    scanner.close();
        }
    }
}