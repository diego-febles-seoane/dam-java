package es.ies.puerto;

import java.util.ArrayList;

public class Ejercicio18 {
    /**
    * Un alquimista ha creado varias pociones y desea organizar su almacén. 
    * Las pociones curativas contienen la palabra "Curación". 
    * Escribe un programa que separe las pociones curativas de las otras.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] pociones = {
            "Poción de Curación", 
            "Poción de Veneno", 
            "Curación Mayor", 
            "Poción de Invisibilidad"
        };
        
        ArrayList<String> pocionesCurativas = new ArrayList<>();
        ArrayList<String> otrasPociones = new ArrayList<>();

        // Separar las pociones
        for (String pocion : pociones) {
            if (pocion.contains("Curación")) {
                pocionesCurativas.add(pocion);
            } else {
                otrasPociones.add(pocion);
            }
        }

        // Imprimir pociones curativas
        System.out.println("Pociones Curativas:");
        for (String curativa : pocionesCurativas) {
            System.out.println(curativa);
        }

        // Imprimir otras pociones
        System.out.println("\nOtras Pociones:");
        for (String otra : otrasPociones) {
            System.out.println(otra);
        }
    }
}
