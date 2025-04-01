package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio6_3 {
    /**
    * Estás cazando pokémon. Si el pokémon es de tipo Agua, Fuego o Planta, puedes usar la pokébola. Si es de cualquier otro tipo, no.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el tipo del pokemon: ");
        String tipoPokemon = scanner.nextLine();
        if (tipoPokemon.equals("Agua") || tipoPokemon.equals("Fuego") || tipoPokemon.equals("Planta")) {
            System.out.println("Puedes usar la pokébola");
            } else {
                System.out.println("No puedes usar la pokébola");
                scanner.close();
                }
            }
        }