package es.ies.puerto;

public class Ejercicio6 {
    /**
    * Un droide está buscando un cristal Kyber en una lista de recursos recolectados por el equipo rebelde. Escribe un programa que busque un valor específico en el array y verifique si el cristal Kyber está presente.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        String[] recursos = {"Bláster", "Cristal Kyber", "Sable de luz", "Pistola"};
        String recursoBuscado = "Cristal Kyber";
        boolean encontrado = false;
        
        for(int i = 0; i < recursos.length; i++){
            if (recursos[i] == recursoBuscado){
                encontrado = true;
                break;
            }
        }
        if (encontrado == true){
            System.out.println("El cristal Kyber se encuentra en la lista de recursos.");
        }else{
            System.out.println("El cristal Kyber no se encuentra en la lista de recursos.");
        }
    }
}