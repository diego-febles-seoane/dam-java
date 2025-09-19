package es.ies.puerto;

public class Ejercicio16 {
    /**
    * El equipo de científicos del Área 51 ha registrado una lista de criaturas hostiles, y tu misión es eliminar una criatura específica del registro. Escribe un programa que elimine la criatura que ya ha sido contenida.
    * @author diego-febles-seone
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] criaturas = {"Alien", "Monstruo del Pantano", "Demonio", "Serpiente Gigante"};
        String criaturaAEliminar = "Demonio";

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
