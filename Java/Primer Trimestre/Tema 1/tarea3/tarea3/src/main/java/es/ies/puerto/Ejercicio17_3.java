package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio17_3 {
    /**
    * En una batalla de rol, si el atacante tiene más fuerza que el defensor, le inflige un daño igual a la diferencia de fuerza. Si no, el defensor bloquea el ataque.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ingrese la fuerza del atacante: ");
        int fuerzaAtacante = scanner.nextInt();
        System.out.println("Ingrese la fuerza del defensor: ");
        int fuerzaDefensor = scanner.nextInt();
        int daño = 0;
        if (fuerzaAtacante > fuerzaDefensor) {
            daño = fuerzaAtacante - fuerzaDefensor;
            System.out.println("El atacante le inflige un daño de " + daño);
            } else {
                System.out.println("El defensor bloquea el ataque");
                }
    }
}