package es.ies.puerto;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio23 {
public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        int hasdcode = nombres.hashCode();
        System.out.println(""+ hasdcode);

            }
}