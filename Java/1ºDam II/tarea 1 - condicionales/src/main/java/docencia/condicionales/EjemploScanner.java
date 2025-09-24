package docencia.condicionales;

import java.util.Scanner;
/**
 * Ejemplo Scanner
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class EjemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu edad:");
        String edad = sc.nextLine();

        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");

        sc.close();
    }
}
