package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que convierta grados Celsius a Fahrenheit. Usa variables de tipo double para los cálculos.
 * @author diego-febles-seo
 * @version 1.0.2
 */
public class Ejercicio7 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce temperatura en Grado Celsius");
        double celcius = input.nextDouble();
        double fahrenheit = (9.0/5) *celcius+ 32;
        System.out.println("La temperatura es de: " +fahrenheit);
    }
    
}