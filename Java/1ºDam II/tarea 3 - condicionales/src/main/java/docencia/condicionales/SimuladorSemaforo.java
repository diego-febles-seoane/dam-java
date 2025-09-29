package docencia.condicionales;

import java.util.Scanner;

public class SimuladorSemaforo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Color no valido";

        System.out.print("Color semaforo: ");
        String semaforoColor = sc.nextLine().toLowerCase();

        switch (semaforoColor) {
            case "rojo":
                mensaje = "Detener";
                break;
            case "amarillo":
                mensaje = "Precaucion";
                break;
            case "verde":
                mensaje = "Avanzar";
                break;
            default:
                
        }

        System.out.println(mensaje);

        sc.close();
    }
}
