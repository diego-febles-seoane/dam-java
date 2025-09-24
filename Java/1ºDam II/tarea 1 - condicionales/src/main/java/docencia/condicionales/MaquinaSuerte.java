package docencia.condicionales;

import java.util.Scanner;
/**
 * El usuario ingresa el clima y el programa responde con una ocurrencia.
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class MaquinaSuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Hoy encontrarás una galleta… ¡y será deliciosa!");
                break;
            case 2:
                System.out.println("Un pato te mirará raro en la calle.");
                break;
            case 3:
                System.out.println("Tendrás suerte… si compartes tu comida.");
                break;
            default:
                System.out.println("Número misterioso: ¡prepárate para lo inesperado!");
        }
        sc.close();
    }
}
