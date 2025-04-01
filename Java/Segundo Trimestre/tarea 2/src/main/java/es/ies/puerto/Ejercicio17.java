package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio17 {
    static List<Integer> lista1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    static List<Integer> lista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    public static void main(String[] args) {
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        List<Integer> numerosComunes = obtenerNumerosComunes(lista1, lista2);
        System.out.println("Números comunes: " + numerosComunes);
        List<Integer> numerosUnicos = obtenerNumerosUnicos(lista1, lista2);
        System.out.println("Números únicos: " + numerosUnicos);
    }


    public static List<Integer> obtenerNumerosComunes(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> comunes = new ArrayList<>(lista1);
        comunes.retainAll(lista2);
        return comunes;
    }

    public static List<Integer> obtenerNumerosUnicos(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> unicos = new ArrayList<>(lista1);
        unicos.addAll(lista2); 
        List<Integer> comunes = obtenerNumerosComunes(lista1, lista2); 
        unicos.removeAll(comunes);
        return unicos;
    }
}