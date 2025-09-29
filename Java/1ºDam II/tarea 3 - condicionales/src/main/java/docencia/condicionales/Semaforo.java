package docencia.condicionales;

import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el color del semáforo: ");
        String color = sc.nextLine().toLowerCase().trim();

        

        sc.close();
    }
}
