package docencia.condicionales;

import java.util.Scanner;
/**
 * El usuario ingresa el clima y el programa responde con una ocurrencia.
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class ClimaLoco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el clima: ");
        String clima = sc.nextLine().toLowerCase().trim();

        if (clima.equals("soleado")) {
            System.out.println("¡Ponte gafas de sol y a disfrutar!");
        } else if (clima.equals("lluvioso")) {
            System.out.println("¡Saca tu paraguas, hoy cantamos bajo la lluvia!");
        } else if (clima.equals("nevando")) {
            System.out.println("¡Hora de hacer un muñeco de nieve!");
        } else {
            System.out.println("Clima misterioso... ¿acaso viene una tormenta intergaláctica?");
        }

        sc.close();
    }
}
