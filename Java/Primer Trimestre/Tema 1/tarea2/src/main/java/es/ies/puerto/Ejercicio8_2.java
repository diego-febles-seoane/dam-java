package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio8_2 {
    /**
    * Crea un programa que convierta una distancia en millas a kilómetros.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero de millas: ");
        double numeroMillas = scanner.nextDouble();
        
        double conversion = numeroMillas * 1.60934;
        System.out.println(numeroMillas + " millas son " + conversion + " kilómetros");
        scanner.close();
    }
}