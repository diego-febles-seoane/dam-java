package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio8_3 {
    /**
    * Rick ha activado su pistola de portales. Si ingresa un número divisible por 3, el portal lleva a la dimensión A. Si es divisible por 5, lleva a la dimensión B. Si es divisible por ambos, lleva a la dimensión C.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El portal lleva a la dimensión C");
        } else if (numero % 3 == 0) {
            System.out.println("El portal lleva a la dimensión A");
        } else if (numero % 5 == 0) {
            System.out.println("El portal lleva a la dimensión B");
        } else {
            System.out.println("El portal no lleva a ninguna dimensión");
            scanner.close();
            }
        }
    }

