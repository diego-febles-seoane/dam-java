package docencia.condicionales;

import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "No bisiesto";

        System.out.print("Ingresa la cuenta: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0)&&(anio % 100 !=0)){
           mensaje = "Es Bisiesto";
        } else if (anio % 400 == 0){
           mensane = "Es Bisiesto";
        }

        System.out.println(mensaje);
        sc.close();
    }
}
