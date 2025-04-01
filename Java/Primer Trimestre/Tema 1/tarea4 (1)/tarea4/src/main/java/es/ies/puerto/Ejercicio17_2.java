package es.ies.puerto;

import java.util.Arrays;

public class Ejercicio17_2 {
    /**
    * En una carrera de Starfighters, los pilotos han registrado sus tiempos en segundos. 
    * Escribe un programa que ordene los tiempos de menor a mayor para mostrar quién ha sido el más rápido.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        int[] tiempos = {350, 280, 420, 310};

        // Ordenar los tiempos
        Arrays.sort(tiempos);

        // Imprimir los tiempos ordenados
        System.out.println("Tiempos ordenados:");
        for (int tiempo : tiempos) {
            System.out.println(tiempo + " segundos");
        }

        // Mostrar el tiempo más rápido
        System.out.println("El tiempo más rápido es: " + tiempos[0] + " segundos");
    }
}
