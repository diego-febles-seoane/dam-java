package docencia.condicionales;

import java.util.Scanner;

public class CalificacionLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu calificacion en letra: ");
        String calificacion = sc.next().toUpperCase();

        switch (calificacion) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Notable");
                break;
            case "C":
                System.out.println("Aprobado");
                break;
            case "D":
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificaion desconocida");

        }

        sc.close();
    }
}
