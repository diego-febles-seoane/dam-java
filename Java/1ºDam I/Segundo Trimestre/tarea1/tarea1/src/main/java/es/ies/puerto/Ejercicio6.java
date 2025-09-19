package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        int tamanioArray = nombres.size();
        System.out.println("El tamaño del ArrayList es: " + tamanioArray);
    }
}