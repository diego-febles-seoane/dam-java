package es.ies.puerto;

import java.util.ArrayList;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio22 {
public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        ArrayList<String> nombres2 = new ArrayList<>();

        nombres2.add("Juan");
        nombres2.add("Maria");
        nombres2.add("Pedro");
        nombres2.add("Ana");
        nombres2.add("Antonio");

        System.out.println("Lista de nombre: " + nombres2);

        System.out.println("Son las listas iguales: " + nombres.equals(nombres2));

    }
}