package es.ies.puerto;

public class Ejercicio14 {
    /**
    * Se han registrado los puntajes de las casas de Hogwarts en el Torneo de Magia. Cada casa recibe una medalla (Oro, Plata o Bronce) según su puntuación. Escribe un programa que cuente cuántas medallas de cada tipo ha ganado una casa.
    * @author diego-febles-seone
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] medallas = {"Oro", "Plata", "Bronce", "Oro", "Oro", "Plata"};
        int oro = 0;
        int plata = 0;
        int bronce = 0;

        for (int  i = 0; i < medallas.length; i++) {
            if (medallas[i].equals("Oro")) {
                oro++;
            } else if (medallas[i].equals("Plata")) {
                plata++;
            } else if(medallas[i].equals("Bronce")) {
                bronce++;
            }else{
                System.out.println("No se reconoce la medalla");
            }
        }
        System.out.println("Oro: " + oro);
        System.out.println("Plata: " + plata);
        System.out.println("Bronce: " + bronce);
    }
}