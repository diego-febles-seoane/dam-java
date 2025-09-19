package es.ies.puerto;

import java.nio.channels.Pipe.SourceChannel;

public class Ejercicio8 {
    /**
    * Dos equipos de héroes han recolectado botines durante una misión conjunta. Escribe un programa que combine ambos inventarios de botines en uno solo.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] botinEquipo1 = {"Espada mágica", "Escudo resistente"};
        String[] botinEquipo2 = {"Anillo de poder", "Armadura encantada"};
        String[] combinacionEquipos =  new String[botinEquipo1.length + botinEquipo2.length];

        for (int i = 0; i < botinEquipo1.length; i++){
            combinacionEquipos[i] = botinEquipo1[i];
        }
        for (int i = 0; i < botinEquipo2.length; i++){
            int j = i + botinEquipo1.length;
            combinacionEquipos[j] = botinEquipo2[i];
        }
        System.out.println("La lista combinada seria:");
        for (int i = 0; i < combinacionEquipos.length; i++){
            System.out.println(combinacionEquipos[i]);
        }
    }
}