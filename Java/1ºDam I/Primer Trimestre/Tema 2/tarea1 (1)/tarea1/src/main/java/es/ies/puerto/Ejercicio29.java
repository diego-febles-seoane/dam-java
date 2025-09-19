package es.ies.puerto;

public class Ejercicio29 {
/**
 * Simula un combate Pokémon y genera un daño aleatorio entre 50 y 100 usando Math.random().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int daño = (int) (Math.random() * 50 + 50);
        System.out.println("El daño causado es: " + daño);
    }
}