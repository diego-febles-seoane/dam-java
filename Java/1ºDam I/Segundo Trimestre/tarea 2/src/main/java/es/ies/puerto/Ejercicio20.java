package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio20 {
    static List<String> lista = new ArrayList<>(Arrays.asList("Ana", "Juan", "Luis", "Maria", "Pedro"));

    public static void main(String[] args) {
        System.out.println("Lista original: " + lista);
        char letraEspecifica = 'A'; 
        String nuevoNombre = "Generico"; 
        actualizarNombres(lista, letraEspecifica, nuevoNombre);
        System.out.println("Lista después de la actualización: " + lista);
    }
    static void actualizarNombres(List<String> lista, char letraEspecifica, String nuevoNombre) {
        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i);
            if (nombre.charAt(0) == letraEspecifica) {
                lista.set(i, nuevoNombre);
            }
        }
    }
}