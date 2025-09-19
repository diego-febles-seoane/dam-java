package es.ies.puerto.cuatro;

import java.util.Scanner;

public class Ejercicio4 {


    /**
     * Escribe un programa que reciba una cadena de texto y cuente cuántas vocales tiene.
     * @author diego-febles-seoane
     * @version 1.0.0
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = Character.toLowerCase(cadena.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                contadorVocales++;
            } 
        }

        System.out.println("La cadena tiene " + contadorVocales + " vocales.");

        scanner.close();
    }
}