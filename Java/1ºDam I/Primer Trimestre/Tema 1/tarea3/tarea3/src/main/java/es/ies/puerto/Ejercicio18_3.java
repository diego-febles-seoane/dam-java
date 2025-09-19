package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio18_3 {
    /**
    * Si tienes más de 18 años, eres aceptado en la Resistencia. Si tienes menos de 18 pero eres hábil con armas, también eres aceptado. Si no, debes esperar.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Cuántos años tienes?");
        int edad = scanner.nextInt();
        System.out.println("¿Eres hábil con armas? (1 si 0 no)");
        int habilidad = scanner.nextInt();
        if (edad > 18) {
            System.out.println("Eres aceptado en la Resistencia");
        } else if (edad <= 18 && habilidad == 1) {
                System.out.println("Eres aceptado en la Resistencia");
        } else if (edad > 18  && habilidad == 1) {
            System.out.println("Eres aceptado en la Resistencia");
        } else {
            System.out.println("Debes esperar");
                    }
                    }
                    }