package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio4_2 {
    /**
    * Crea un programa que solicite al usuario dos números enteros. El programa debe sumar y restar ambos números, y mostrar los resultados.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        float numero1 = scanner.nextFloat();
        
        System.out.print("Introduce el segundo numero: ");
        float numero2 = scanner.nextFloat();
        
        float suma  = numero1 + numero2;
        System.out.println("Resultado de la suma " +suma);
        float resta  = numero1 - numero2;
        System.out.println("Resultado de la resta " +resta);
        scanner.close();

    }
}