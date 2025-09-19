package es.ies.puerto;

public class Ejercicio23 {
/**
 * Dado el código Sith: "La paz es una mentira, solo hay pasión", crea un programa que cuente cuántas veces aparece la palabra "es".
 * @author diego-febles-seoane
 * @version 1.0.0
 */

    public static void main(String[] args) {
        String frase = "La paz es una mentira, solo hay pasión";
        int contador = 0;
        String palabra = "es";
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.startsWith(palabra, i)) {
                contador++;
                i = i + palabra.length() - 1;
                }
            }
        System.out.println("La palabra 'es' aparece " + contador + " veces en la  frase.");
    }
}