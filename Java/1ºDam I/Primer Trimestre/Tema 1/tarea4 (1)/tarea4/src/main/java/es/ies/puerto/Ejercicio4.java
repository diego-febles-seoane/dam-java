package es.ies.puerto;

public class Ejercicio4 {
    /**
    * Un cazador de tesoros ha recolectado una lista de objetos en el orden en que los encontró. Escribe un programa que invierta el orden de los objetos en su inventario para mostrar el último objeto primero.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] inventario = {"Espada", "Escudo", "Poción", "Gema", "Mapa"};
        String[] invertido = new String[5];

        for(int i = 0; i < inventario.length; i++){
            invertido[inventario.length-1-i] = inventario[i];
        }
    }
}