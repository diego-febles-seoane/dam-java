package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio14_3 {
    /**
    * Si tu pokémon es de tipo Agua y el rival es de tipo Fuego, ganas. Si es Planta, pierdes. Si el rival es Agua, empatas.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el tipo de tu pokemon: ");
        String tipoPokemon = scanner.nextLine();
        System.out.println("Introduce el tipo de tu rival: ");
        String tipoRival = scanner.nextLine();
        if (tipoPokemon.equals("Agua") && tipoRival.equals("Fuego")) {
            System.out.println("Ganaste");
        } else if (tipoPokemon.equals("Planta") && tipoRival.equals("Fuego")) {
            System.out.println("Perdiste");
            } else if (tipoPokemon.equals("Agua") && tipoRival.equals("Agua")) {
                System.out.println("Empatamos");
            } else if (tipoPokemon.equals("Planta") && tipoRival.equals("Planta")) {
                System.out.println("Empatamos");
            } else if (tipoPokemon.equals("Agua") && tipoRival.equals("Planta"))  {
                System.out.println("Perdiste");
            } else if (tipoPokemon.equals("Fuego") && tipoRival.equals("Agua")) {
                System.out.println("Perdiste");
            } else if (tipoPokemon.equals("Fuego") && tipoRival.equals("Planta")) {
                System.out.println("Ganaste");
            } else if (tipoPokemon.equals("Fuego") && tipoRival.equals("Fuego")) {
                System.out.println("Empatamos");
            } else if (tipoPokemon.equals("Planta") && tipoRival.equals("Agua")) {
                System.out.println("Ganaste");
            } else {
                System.out.println("Hiciste algo mal");
            }
        }
    }