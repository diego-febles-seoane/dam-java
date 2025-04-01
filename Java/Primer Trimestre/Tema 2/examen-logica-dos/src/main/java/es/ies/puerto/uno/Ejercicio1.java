package es.ies.puerto.uno;

import java.util.Scanner;

/**
 * Crea un programa que solicite un año al usuario y determine si es bisiesto (divisible por 4, pero no por 100, excepto si es divisible por 400).
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio1 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un año: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        scanner.close();
    }
}