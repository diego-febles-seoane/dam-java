package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
/**
 * Escribe un programa que reciba una entrada del usuario y convierta la primera letra de cada palabra en mayúscula (como si fuera el diario del Capitán Kirk).
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            String primeraLetra = palabra.substring(0,1);
            String primeraLetraMayuscula = primeraLetra.toUpperCase();
            palabra = palabra.replaceFirst(primeraLetra, " "+ primeraLetraMayuscula);  
            System.out.print(palabra);
        }
    }
}