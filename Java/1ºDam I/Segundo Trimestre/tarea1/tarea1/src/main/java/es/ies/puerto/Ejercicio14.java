package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio14 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);

    List<String> nombres2 = new ArrayList<>();

        nombres2.add("Fransua");
        nombres2.add("Aday");
        nombres2.add("Paco");
        nombres2.add("Adrain");
        nombres2.add("Daniel");

        System.out.println("Lista de nombre: " + nombres2);

    nombres.addAll(nombres2);

    System.out.println("Lista de nombre: " + nombres);


    

    }
}