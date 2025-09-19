package es.ies.puerto.Ejercicio20;

import es.ies.puerto.Ejercicio19.Circulo;

/**
 * Crea un objeto de la clase Circulo con radio -3. Asegúrate de que el radio
 * sea un valor positivo mayor a 0.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(-3);

        System.out.println(circulo.getRadio());
    }
}
