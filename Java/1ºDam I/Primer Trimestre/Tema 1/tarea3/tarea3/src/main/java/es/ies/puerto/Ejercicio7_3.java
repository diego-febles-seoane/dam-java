package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio7_3 {
    /**
    * Frodo está viajando a Mordor. Si la distancia es mayor a 1000 kilómetros, necesitará descansar. Si es menor, podrá continuar.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la distancia: ");
        int distancia = scanner.nextInt();
        if (distancia > 1000) {
            System.out.println("Frodo necesita descansar.");
            } else {
                System.out.println("Frodo puede continuar.");
                scanner.close();
                }
            }
        }