package es.ies.puerto;

public class Ejercicio4 {
/**
 * Dada la frase "Un Anillo para gobernarlos a todos", comprueba si contiene la palabra "gobernarlos" usando el método contains().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String frase = "Un Anillo para gobernarlos a todos";
        String palabra = "gobernarlos";
        boolean existe = frase.contains(palabra);
        System.out.println("La palabra 'gobernarlos' esta en la frase: " + existe);
    }
}