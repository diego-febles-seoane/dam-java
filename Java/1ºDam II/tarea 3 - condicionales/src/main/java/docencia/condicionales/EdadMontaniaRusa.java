package docencia.condicionales;

import java.util.Scanner;

public class EdadMontaniaRusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "No puedes subir a la montaña rusa."; 

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu altura: ");
        double altura = sc.nextDouble();

        if (edad >= 12 && altura >= 1.40) {
            mensaje = "Puedes subir a la montaña rusa.";
        }
        
        System.out.println(mensaje);
        sc.close();
    }
}
