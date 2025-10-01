package docencia.condicionales;

import java.util.Scanner;

public class CalificacionPeliculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Calificacion desconocida";

        System.out.print("Selecciona calificacion de la pelicula: ");
        String calificacion = sc.nextLine().toLowerCase();

        switch (calificacion) {
            case "g":
                mensaje = "Apta para todos los publicos";
                break;
            case "pg":
                mensaje = "Guia paternak sugerida";
                break;
            case "r":
                mensaje = "restringida";
                break;
        }

        System.out.println(mensaje);

        sc.close();
    }
}
