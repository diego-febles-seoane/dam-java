package es.ies.puerto;

public class Ejercicio9 {
/**
 * Dada la frase "Soy Batman", invierte la cadena usando métodos de StringBuilder.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String frase = "Soy Batman";
        StringBuilder sb = new StringBuilder(frase);
        System.out.println(sb.reverse());
    }
}