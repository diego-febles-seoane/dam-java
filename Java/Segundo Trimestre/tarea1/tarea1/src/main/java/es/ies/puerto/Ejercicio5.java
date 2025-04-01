package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        boolean nombreContenido = nombres.contains("Ana");
        System.out.println("¿El nombre aparece? " + nombreContenido);
    }
}