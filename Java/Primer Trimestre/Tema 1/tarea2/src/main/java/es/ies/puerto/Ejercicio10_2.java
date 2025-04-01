package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio10_2 {
    /**
    * Crea un programa que pida al usuario su peso (en kg) y su altura (en metros), y luego calcule su Índice de Masa Corporal (IMC).
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("El valor del IMC es: " + imc);
        scanner.close();
    }
}