package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio5_2 {
    /**
    * Escribe un programa que pida al usuario tres números de tipo float y calcule el promedio de los tres.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Introduce el segundo numero: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Introduce el tercero numero: ");
        float numero3 = scanner.nextFloat();

        float  promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los tres es " +promedio);
        scanner.close();
    }
}