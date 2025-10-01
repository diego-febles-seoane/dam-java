package docencia.condicionales;

import java.util.Scanner;

public class SelectorSuperpoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Desconocido";

        System.out.print("Selecciona un numero: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                mensaje = "Fuerza";
                break;
            case 2:
                mensaje = "Velocidad";
                break;
            case 3:
                mensaje = "Invisibilidad";
                break;
            case 4:
                mensaje = "Teletransportacion";
                break;
            case 5:
                mensaje = "Vuelo";
                break;
            case 6:
                mensaje = "Super aliento";
                break;
            case 7:
                mensaje = "Telequinesis";
                break;
            case 8:
                mensaje = "Control del tiempo";
                break;
        }

        System.out.println(mensaje);

        sc.close();
    }
}
