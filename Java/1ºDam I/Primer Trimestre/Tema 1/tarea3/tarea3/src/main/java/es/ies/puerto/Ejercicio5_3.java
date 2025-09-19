package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio5_3 {
    /**
    * Goku está en una batalla. Si su nivel de poder es mayor de 9000, está en "Modo Super Saiyan". Si no, está en "Modo normal".
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el nivel de poder de Goku: ");
        int nivelPoder = scanner.nextInt();
        scanner.close();
        if (nivelPoder > 9000) {
            System.out.println("Goku está en Modo Super Saiyan");
            } else {
                System.out.println("Goku está en Modo normal");
                }
                
            }
        }