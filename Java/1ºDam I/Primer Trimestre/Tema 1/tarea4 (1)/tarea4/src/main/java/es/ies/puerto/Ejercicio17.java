package es.ies.puerto;

public class Ejercicio17 {
    /**
     * En un RPG, los personajes pueden subir de nivel incrementando su experiencia. 
     * Escribe un programa que multiplique la experiencia de cada personaje por 1.5 
     * para simular su mejora tras una batalla.
     * @author diego-febles-seoane
     * @version 1.0.0
     */
    public static void main(String[] args) {
        int[] experiencia = {100, 200, 150, 120};
        double multiplicador = 1.5;

        // Crear un array para almacenar la nueva experiencia
        double[] nuevaExperiencia = new double[experiencia.length];

        // Multiplicar la experiencia por el multiplicador
        for (int i = 0; i < experiencia.length; i++) {
            nuevaExperiencia[i] = experiencia[i] * multiplicador;
        }

        // Imprimir la nueva experiencia
        System.out.println("Experiencia tras la batalla:");
        for (int i = 0; i < nuevaExperiencia.length; i++) {
            System.out.printf("Personaje %d: %.2f experiencia\n", i + 1, nuevaExperiencia[i]);
        }
    }
}
