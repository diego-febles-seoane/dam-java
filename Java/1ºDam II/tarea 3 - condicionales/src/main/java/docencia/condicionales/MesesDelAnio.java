package docencia.condicionales;

import java.util.Scanner;

public class MesesDelAnio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "No existe";

        System.out.print("Selecciona un numero mes: ");
        int mesNumero = sc.nextInt();

        switch (mesNumero) {
            case 1:
                mensaje = "Enero";
                break;
            case 2:
                mensaje = "Febrero";
                break;
            case 3:
                mensaje = "Marzo";
                break;
            case 4:
                mensaje = "Abril";
                break;
            case 5:
                mensaje = "Mayo";
                break;
            case 6:
                mensaje = "Junio";
                break;
            case 7:
                mensaje = "Julio";
                break;
            case 8:
                mensaje = "Agosto";
                break;
            case 9:
                mensaje = "Septiembre";
                break;
            case 10:
                mensaje = "Octubre";
                break;
            case 11:
                mensaje = "Noviembre";
                break;
            case 12:
                mensaje = "Diciembre";
                break;
            default:
        }

        System.out.println(mensaje);

        sc.close();
    }
}
