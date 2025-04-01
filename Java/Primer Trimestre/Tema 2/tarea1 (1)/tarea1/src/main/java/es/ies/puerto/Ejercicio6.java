package es.ies.puerto;

public class Ejercicio6 {
/**
 * Crea un programa que dada la frase "Viva la Resistencia", cuente cuántas veces aparece la letra "a".
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String frase = "Viva la Resistencia";
        int contador = 0;
        char[] arrayFrase = frase.toCharArray();
        for (int i = 0; i < arrayFrase.length; i++) {
            if (arrayFrase[i] == 'a') {
                contador++;
            }
        }
        System.out.println("La letra 'a' aparece " + contador + " veces en la  frase.");
    }
}