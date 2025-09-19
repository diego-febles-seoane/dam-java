package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio15 {

    /**
     * Funcion que clona de una lista a otra
     * @param nombres
     * @return Lista clonada o vacia
     */
    static public List<String> clonar(ArrayList<String> nombres){
        if(nombres == null || nombres.isEmpty()){
            return new ArrayList<String>();
        }
        return (ArrayList)nombres.clone();
    }
public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Antonio");

        System.out.println("Lista de nombre: " + nombres);
        List nombresClonado = clonar(nombres);
        System.out.println("Clon de la lista: " + nombresClonado);
    }
}