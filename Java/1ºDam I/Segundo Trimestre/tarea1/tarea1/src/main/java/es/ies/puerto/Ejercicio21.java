package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio21 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println(nombres);
        nombres.clear();
        System.out.println("Esta vacio "+ nombres.isEmpty());
        System.out.println(nombres);
            }
}