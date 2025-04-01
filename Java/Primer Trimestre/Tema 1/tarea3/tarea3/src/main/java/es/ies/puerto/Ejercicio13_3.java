package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio13_3 {
    /**
    * Si la energía del traje de Iron Man es mayor al 70%, puede volar. Si es mayor al 30% pero menor o igual al 70%, puede caminar. Si es menor o igual al 30%, está en modo crítico.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el porcentaje de energia del traje de Ironman: ");
        int energiaTraje = scanner.nextInt();
        scanner.close();
        if (energiaTraje > 70) {
            System.out.println("Puede volar");
            } else if (energiaTraje > 30 && energiaTraje <= 70){
                System.out.println("Puede caminar");
            } else {
                System.out.println("Está en modo critico");
                }
    }
}