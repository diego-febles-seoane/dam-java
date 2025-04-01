package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
/**
 * Dada la frase: "Luke Skywalker es un Jedi muy poderoso", crea un programa que reemplace todas las ocurrencias de "Skywalker" por "Kenobi" y lo imprima.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String frase = "Luke Skywalker es un Jedi muy poderoso";
        String salida = frase.replace("Skywalker", "Kenobi");
        System.out.println(salida);
    }
}