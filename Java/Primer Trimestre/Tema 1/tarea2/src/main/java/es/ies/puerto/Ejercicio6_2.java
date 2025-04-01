package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio6_2 {
    /**
    * Escribe un programa que reciba un número entero y determine si es par o impar.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int numero = scanner.nextInt();

        String    resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El  numero " + numero + " es " + resultado);
        scanner.close();
    }
}