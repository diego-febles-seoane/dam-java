package es.ies.puerto;

import java.util.Random;

public class GeneradorAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int maxIteraciones = -1;
        for (int i = 0; i > maxIteraciones; i++) {
            for (int j = 0; j < 100; j++) {
                int numeroAleatorio = random.nextInt(2);
                System.out.print(numeroAleatorio + " ");
            }
            System.out.println();
        }
    }
}