package es.ies.puerto;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio24 {
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
        nombres2.add("Nico");
        nombres2.add("Pedro Jesus");
        nombres2.add("Julian");
        nombres2.add("Antonio");

        System.out.println("Lista de nombre: " + nombres2);
        nombres.retainAll(nombres2);
        System.out.println("Lista de nombre: " + nombres);
    }
}