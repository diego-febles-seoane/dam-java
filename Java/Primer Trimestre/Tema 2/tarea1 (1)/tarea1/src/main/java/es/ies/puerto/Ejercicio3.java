package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
/**
 * Dado el nombre de un Pokémon (como "Pikachu"), crea un programa que convierta el nombre en mayúsculas, minúsculas, y que también imprima la longitud del nombre.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de un Pokémon:");
        String nombrePokemon = scanner.nextLine();
        
        System.out.println("Nombre en mayúsculas: " + nombrePokemon.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombrePokemon.toLowerCase());
        System.out.println("Longitud del nombre: " + nombrePokemon.length());

        scanner.close();
        }
    }