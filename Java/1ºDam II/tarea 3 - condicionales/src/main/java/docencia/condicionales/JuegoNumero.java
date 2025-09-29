package docencia.condicionales;

import java.util.Scanner;

public class JuegoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecretoAleatorio = (int) (Math.random() * 100) + 1;

        System.out.print("Ingresa un numero (1 - 100): ");
        int numero = sc.nextInt();

        if (numero == numeroSecretoAleatorio) {
            System.out.println("¡Has acertado!");
        } else if (numero < numeroSecretoAleatorio) {
            System.out.println("El número es mayor.");
        } else {
            System.out.println("El número es menor.");
        }

        sc.close();
    }
}
