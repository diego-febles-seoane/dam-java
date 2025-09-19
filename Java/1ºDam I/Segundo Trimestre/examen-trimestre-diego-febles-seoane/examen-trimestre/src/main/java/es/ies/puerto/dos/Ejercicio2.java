package es.ies.puerto.dos;

public class Ejercicio2 {
    
    /**
     * En un reino lejano, existe una antigua leyenda sobre el poder oculto de las vocales, una
     * fuerza capaz de transformar cualquier palabra en una expresión poderosa. En esta misión, tu tarea es
     * liberar el poder de una vocal y elevarla a su forma suprema.
     * Otra explicación:Escribir un programa que dada una frase y una vocal, y devuelva la misma
     * frase pero con la vocal introducida en mayúscula.
     * @author diego-febles-seoane
     * @version 1.0.0
     */
    public static void main(String[] args) {
        String frase = "La programación es divertida";
        char vocal = 'a';
    }

    public static String transformarVocal(String frase, char vocal) {
        frase.toUpperCase();
        return "-1";
    }

    private static boolean esVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    

    
}
