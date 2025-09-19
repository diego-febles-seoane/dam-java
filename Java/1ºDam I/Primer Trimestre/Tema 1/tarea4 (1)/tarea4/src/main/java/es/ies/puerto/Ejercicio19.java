package es.ies.puerto;

import java.util.HashMap;

public class Ejercicio19 {
    /**
    * Thanos ha recolectado gemas del infinito, pero quiere saber cuántas tiene de cada tipo. 
    * Escribe un programa que cuente cuántas gemas de "Poder", "Tiempo" y "Espacio" ha recolectado.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] gemas = {"Poder", "Tiempo", "Espacio", "Tiempo", "Poder", "Poder"};
        
        // Crear un HashMap para contar las gemas
        HashMap<String, Integer> contadorGemas = new HashMap<>();

        // Contar las gemas
        for (String gema : gemas) {
            contadorGemas.put(gema, contadorGemas.getOrDefault(gema, 0) + 1);
        }

        // Imprimir el conteo de gemas
        System.out.println("Conteo de gemas:");
        for (String tipo : contadorGemas.keySet()) {
            System.out.println(tipo + ": " + contadorGemas.get(tipo));
        }
    }
}
