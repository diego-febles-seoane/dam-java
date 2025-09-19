package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio3 {
    static List<Integer> lista = new ArrayList<>();

    public static void main(String[] args) {

        lista = generarLista(50);
        System.out.println(lista);
        lista.removeIf(numero -> numero > 50);
        System.out.println(lista);
        System.out.println(existenPares(lista));
    }

    static List<Integer> generarLista(int cantidad) {
        List<Integer> miLista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int numero = (int) Math.floor((Math.random() * 101));
            miLista.add(numero);
        }
        return miLista;
    }

    static boolean existenPares(List<Integer> lista){
        boolean existe = false;
        if(lista == null || lista.isEmpty()){
            return existe;
    }
        for (Integer numero : lista) {
            if(numero%2==0){
            existe = true;
            break;
        }
    }
        return existe;
    }
}