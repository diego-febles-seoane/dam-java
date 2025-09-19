package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Pablo");
        nombres.add("Lolito");
        nombres.add("Eduardo");
        nombres.add("Edu");
        nombres.add("Adriana");
        nombres.add("Nayra");
        System.out.println(validarNombres(nombres));
    }
    
    /**
     * Metodo para comprobar si un nombre tiene mas de 5 caracteres
     * @param nombres
     * @return lista de nombres validada
     */
    public static List<String> validarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            if (nombre.length() > 5) {
                nombre = "GENÉRICO";
            }
        }
        return nombres;
    }
}