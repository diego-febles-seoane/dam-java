package es.ies.puerto;

public class Ejercicio10 {
/**
 * Dada una lista de personajes en una batalla (separados por comas), imprime cuántos personajes hay en la batalla usando split().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String personajes = "Deku, Bakugo, Todoroki, Ochako";
        String[] personajesArray = personajes.split(",");
        System.out.println("Hay " + personajesArray.length + " personajes en la batalla.");
    }
}