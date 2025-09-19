package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        String sustituir = nombres.set(1, "Luis Mario");
        System.out.println("Nombre sustituido: " + sustituir);
        System.out.println("Lista con el nombre sustituido" + nombres);
    }
}