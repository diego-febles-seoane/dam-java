package es.ies.puerto;

public class Ejercicio25 {
/**
 * En un juego de Mario, calcula cuántas vidas extra tiene si ha recolectado 1270 monedas, sabiendo que cada 100 monedas obtiene 1 vida extra.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int monedas = 1270;
        int vidas = monedas / 100;
        System.out.println("Tiene " + vidas + " vidas extra.");
    }
}