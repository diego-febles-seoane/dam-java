package es.ies.puerto;

public class Ejercicio7 {
    /**
    * Un equipo de aventureros ha derrotado a un dragón y ahora deben eliminarlo del registro de criaturas vivas. Escribe un programa que elimine a esta criatura específica del array.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] criaturas = {"Goblin", "Dragón", "Orco", "Troll"}; 
        String criaturaAEliminar = "Dragón";

        String[] criaturasFinal = new String[criaturas.length-1];
        int j = 0;
        for (int i = 0; i < criaturas.length; i++) {
            String valor = criaturas[i];
            if (!criaturaAEliminar.equals(criaturas[i])) {
                criaturasFinal[j] = valor;
                j++;
    }                
}

            for  (int i = 0; i < criaturasFinal.length; i++) {
                System.out.println(criaturasFinal[i]);
        }
    }
}