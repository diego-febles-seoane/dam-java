package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> lista = generarLista(20);
        System.out.println(lista);
        System.out.println("Tamanio lista " + lista.size());
        lista.removeIf(numero -> numero % 3 == 0);
        System.out.println(lista);
    }

    static List<Integer> generarLista(int cantidad) {
        List<Integer> miLista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            miLista.add(i + 1);
        }
        return miLista;
    }
}