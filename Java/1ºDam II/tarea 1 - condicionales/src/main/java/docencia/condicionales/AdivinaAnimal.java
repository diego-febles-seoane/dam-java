package docencia.condicionales;

import java.util.Scanner;
/**
 * El usuario responde preguntas y el programa adivina un animal.
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class AdivinaAnimal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "Mmm... tal vez un perro travieso.";

        System.out.print("¿Tiene alas? (sí/no): ");
        String alas = sc.nextLine();

        System.out.print("¿Vive en el agua? (sí/no): ");
        String agua = sc.nextLine();

        if (alas.equals("sí") && agua.equals("no")){
            mensaje = "Podría ser un pájaro… ¡o un dragón!";
        } else if (agua.equals("sí") && alas.equals("no")){
            mensaje = "Seguro que eres un pez, o una sirena secreta.";
        } else if (alas.equals("sí") && agua.equals("sí")){
            mensaje = "No vale inventarse cosas";
        }

        System.out.println(mensaje);
        sc.close();
    }
}
