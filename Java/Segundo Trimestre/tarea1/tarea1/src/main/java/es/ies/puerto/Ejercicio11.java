package es.ies.puerto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio11 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        Collections.reverse(nombres);
        System.out.println("Lista de nombre al revés: " + nombres);
    }
}