package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio2_2 {
    /**
    * Declara dos variables de tipo boolean: una que indique si una persona tiene licencia de conducir y otra si posee un vehículo. Muestra ambas variables
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce radio del  círculo: ");
        double radio = scanner.nextDouble();
        
        double pi = 3.1416f;
        double area = (radio*radio)*pi;
        System.out.println("El area es:" +area);
        scanner.close();
    }
}