package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio10_3 {
    /**
    * Según tus respuestas en el sombrero seleccionador, te pueden asignar a Gryffindor, Slytherin, Ravenclaw o Hufflepuff. Elige entre valiente, astuto, sabio o leal y el programa te asignará una casa. Cada palabra equivala a la casa repestiva.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Selecciona entre valiente, astuto,  sabio o leal: ");
        String caracteristicaCasa = scanner.nextLine();
        switch (caracteristicaCasa) {
            case "valiente":
            System.out.println("Has sido asignado a Gryffindor");
            break;
            case "astuto":
            System.out.println("Has sido asignado a Slytherin");
            break;
            case "sabio":
            System.out.println("Has sido asignado a Ravenclaw");
            break;
            case "leal":
            System.out.println("Has sido asignado a Hufflepuff");
        }
        scanner.close();

        }
    }