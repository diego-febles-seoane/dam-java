package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(Arrays.asList("Inicio", "Martes", 
        "Miercoles", "Jueves", "Viernes", "Sabado", "Fin"));
        String inicio = "Inicio";
        String fin = "Fin";
        System.out.println(crearSubLista(palabras, inicio, fin));
    }

    /**
     * Metodo para crear una sublista 
     * @param lista
     * @param inicio
     * @param fin
     * @return sublista con el orden invertido
     */
    public static List<String> crearSubLista(List<String> lista, String inicio, String fin) {
        if (lista == null || lista.isEmpty()) {
            return lista;
        }
        int posicionInicio = lista.indexOf(inicio);
        int posicionFin = lista.indexOf(fin);
        lista.subList(posicionInicio, posicionFin);
        Collections.reverse(lista);
        return lista;
    }
}