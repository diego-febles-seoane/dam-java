package docencia.condicionales;

import java.util.Scanner;

public class ConversorDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Dia no existente";

        System.out.print("Selecciona dia: ");
        int diaDeLaSemana = sc.nextInt();

        switch (diaDeLaSemana) {
            case 1:
                mensaje = "Lunes";
                break;
            case 2:
                mensaje = "Martes";
                break;
            case 3:
                mensaje = "Miercoles";
                break;
            case 4:
                mensaje = "Jueves";
                break;
            case 5:
                mensaje = "Viernes";
                break;
            case 6:
                mensaje = "Sabado";
                break;
            case 7:
                mensaje = "Domingo";
                break;
            default:
                
        }

        System.out.println(mensaje);

        sc.close();
    }
}
