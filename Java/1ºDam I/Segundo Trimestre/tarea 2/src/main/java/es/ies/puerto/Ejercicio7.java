package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("hola");
        palabras.add("java");
        palabras.add("mundo");
        palabras.add("codigo");
        System.out.println("Lista original: " + palabras);
        List<String> listaSinDuplicados = eliminarDuplicados(palabras);

        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }

    /**
     * Metodo para eliminar elementos duplicados de una lista manteniendo el orden.
     * @param lista 
     * @return Nueva lista sin duplicados
     */
    public static List<String> eliminarDuplicados(List<String> lista) {
        List<String> listaTemporal = new ArrayList<>();
        for (String elemento : lista) {
            if (!listaTemporal.contains(elemento)) {
                listaTemporal.add(elemento);
            }
        }
        return listaTemporal;
    }
}