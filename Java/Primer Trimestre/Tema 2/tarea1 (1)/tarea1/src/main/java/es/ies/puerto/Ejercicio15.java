package es.ies.puerto;

public class Ejercicio15 {
/**
 * En un juego de Mario, calcula cuántas vidas extra tiene el jugador si obtiene 250 monedas (usa Math.floor() para las divisiones entre 100).
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int monedas = 250;
        int vidasExtra = (int) Math.floor(monedas / 100);
        System.out.println("El jugador tiene " + vidasExtra + " vidas extra.");
    }
}