package docencia.condicionales;

import java.util.Scanner;

public class AdivinaAnimal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Tiene alas? (sí/no): ");
        String alas = sc.nextLine();

        System.out.print("¿Vive en el agua? (sí/no): ");
        String agua = sc.nextLine();

        
        sc.close();
    }
}
