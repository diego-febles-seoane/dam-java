package docencia.condicionales;

import java.util.Scanner;

public class ClasificacionPlanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "No existe planeta";

        System.out.print("Selecciona un numero: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                mensaje = "Mercurio";
                break;
            case 2:
                mensaje = "Venus";
                break;
            case 3:
                mensaje = "Tierra";
                break;
            case 4:
                mensaje = "Marte";
                break;
            case 5:
                mensaje = "Jupiter";
                break;
            case 6:
                mensaje = "Saturno";
                break;
            case 7:
                mensaje = "Urano";
                break;
            case 8:
                mensaje = "Neptuno";
                break;
            default:
        }

        System.out.println(mensaje);

        sc.close();
    }
}
