package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio20_3 {
    /**
    * Dos luchadores están en el combate final de Mortal Kombat. Si la salud de un luchador es 0, pierde. Si ambos tienen salud, se evalúa quién tiene más ataque. Si ambos tienen el mismo ataque, el combate es un empate.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Cantidad de salud de luchador 1: ");
        int salud1 = scanner.nextInt();
        System.out.println("Cantidad de ataque de  luchador 1: ");
        int ataque1 = scanner.nextInt();
        System.out.println("Cantidad de salud de luchador 2: ");
        int salud2 = scanner.nextInt();
        System.out.println("Cantidad de ataque de luchador 2: ");
        int ataque2 = scanner.nextInt();
        if (salud1 == 0 || salud2 == 0) {
            System.out.println("El ganador es el luchador con salud");
        } else if (ataque1 > ataque2) {
            System.out.println("El ganador es el luchador 1");
        } else if (ataque2 > ataque1) {
            System.out.println("El ganador es el luchador 2");
        } else {
            System.out.println("El combate es un empate");
            }
            }
            }