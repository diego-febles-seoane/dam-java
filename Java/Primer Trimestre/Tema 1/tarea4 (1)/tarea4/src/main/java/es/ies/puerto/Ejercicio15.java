package es.ies.puerto;

public class Ejercicio15 {
    /**
    * En la Tierra Media, varios objetos mágicos han sido encontrados, pero los héroes están buscando específicamente el "Anillo Único". Escribe un programa que determine si el Anillo Único está en el inventario.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] objetosMagicos = {"Palantir", "Anillo Único", "Espada de Elendil", "Capa Élfica"};
        String objetoBuscado = "Anillo Único";

        for  (int i = 0; i < objetosMagicos.length; i++) {
                if (objetosMagicos[i].contains("Anillo Único")){
                    System.out.println("El Anillo Unico esta entre los objetos");
                    break;
                    }else{
                }
            }
        }
    }
