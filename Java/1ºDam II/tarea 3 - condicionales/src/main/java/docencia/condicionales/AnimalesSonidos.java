package docencia.condicionales;

import java.util.Scanner;

public class AnimalesSonidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Desconocido";

        System.out.print("Selecciona un animal: ");
        String animal = sc.nextLine().toLowerCase();

        switch (animal) {
            case "perro":
                mensaje = "Guau";
                break;
            case "gato":
                mensaje = "Miau";
                break;
            case "vaca":
                mensaje = "Muu";
                break;
            case "oveja":
                mensaje = "Bee";
                break;
            case "pato":
                mensaje = "Cuac";
                break;
            default:
        }

        System.out.println(mensaje);

        sc.close();
    }
}
