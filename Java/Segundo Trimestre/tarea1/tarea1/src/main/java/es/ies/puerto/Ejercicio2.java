package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.Ejercicio1;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        String tercero = nombres.get(2);
        System.out.println("El que esta en la tercera pocicion es: " + tercero);
    }
}