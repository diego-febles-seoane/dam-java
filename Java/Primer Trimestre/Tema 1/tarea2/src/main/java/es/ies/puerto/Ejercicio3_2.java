package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio3_2 {
    /**
    * Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce temperatura en celcius: ");
        double celcius = scanner.nextDouble();
        
        double fahrenheit = (9.0/5) *celcius+ 32;
        System.out.println("La temperatura es de: " +fahrenheit);
        scanner.close();
    }
}