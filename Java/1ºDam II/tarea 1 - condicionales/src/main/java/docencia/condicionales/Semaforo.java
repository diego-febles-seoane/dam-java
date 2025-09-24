package docencia.condicionales;

import java.util.Scanner;
/**
 * El usuario ingresa un color de semáforo y el programa indica la acción.
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class Semaforo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "Ese color no existe en un semáforo… ¿arcoíris?";

        System.out.print("Ingresa el color del semáforo: ");
        String color = sc.nextLine().toLowerCase().trim();

        if (color.equals("rojo")){
            mensaje = "¡Alto! Ni se te ocurra moverte.";
        } else if (color.equals("amarillo")){
            mensaje = "Prepárate… ¡pero no corras!";
        } else if (color.equals("verde")){
            mensaje = "¡Avanza como un rayo!";
        }

        System.out.println(mensaje);

        sc.close();
    }
}
