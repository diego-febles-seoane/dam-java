package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio11_3 {
    /**
    * Si la velocidad del Halcon Milenario es mayor de 1000, se activan los motores hiperespaciales. Si es mayor de 500 pero menor o igual a 1000, la nave está a máxima velocidad. Si es menor o igual a 500, la nave está en velocidad normal.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la velocidad del Halcon Milenario: ");
        int velocidad = scanner.nextInt();
        scanner.close();
        if (velocidad > 1000) {
            System.out.println("Se activan los motores hiperespaciales");
            } else if (velocidad > 500 && velocidad <= 1000) {
                System.out.println("La nave está a máxima velocidad");
                } else {
                    System.out.println("La nave está en velocidad normal");
                    }
    }
}