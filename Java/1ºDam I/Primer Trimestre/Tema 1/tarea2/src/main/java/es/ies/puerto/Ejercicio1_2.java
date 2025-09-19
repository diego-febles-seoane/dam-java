package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio1_2 {
    /**
    * Declara dos variables de tipo boolean: una que indique si una persona tiene licencia de conducir y otra si posee un vehículo. Muestra ambas variables
    * @author diego-febles-seo
    * @version 1.0.1
    */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        
        int anoActual = 2024;
        int edad = anoActual - anoNacimiento;
        
        System.out.println("Tienes " + edad + " años.");
        scanner.close();
    }
}