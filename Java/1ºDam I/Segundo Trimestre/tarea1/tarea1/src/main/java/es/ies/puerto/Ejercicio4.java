package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        String nombreEliminado = nombres.remove(3);
        System.out.println("Nombre Eliminado " + nombreEliminado);
        System.out.println("Lista de nombre: " + nombres);
    }
}