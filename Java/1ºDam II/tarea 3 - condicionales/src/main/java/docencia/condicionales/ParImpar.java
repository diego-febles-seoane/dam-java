package docencia.condicionales;

import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "impar"; 

        System.out.print("Ingresa tu numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            mensaje = "Par";
        }
        
        System.out.println(mensaje);
        sc.close();
    }
}
