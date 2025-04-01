package es.ies.puerto;

public class Ejercicio7 {
/**
 * Dado un texto sobre Wakanda, usa el método substring() para extraer solo la palabra "Wakanda" de la frase "El vibranium en Wakanda es sagrado".
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String texto = "El vibranium en Wakanda es sagrado";
        String palabra = texto.substring(16,23);
        System.out.println(palabra);
        }
    }