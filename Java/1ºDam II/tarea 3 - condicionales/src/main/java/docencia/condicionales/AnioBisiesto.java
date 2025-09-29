package docencia.condicionales;

import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "No bisiesto";

        System.out.print("Ingresa la cuenta: ");
        int anio = sc.nextInt();

        

        System.out.println(mensaje);
        sc.close();
    }
}
