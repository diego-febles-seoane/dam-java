package es.ies.puerto.tres;

public class Ejercicio3 {

    /**
    * Escribe un programa que imprima los números del 1 al 100. Para múltiplos de 3, imprime Fizz, para múltiplos de 5, imprime Buzz y para múltiplos de ambos imprime FizzBuzz. En caso de que no se cumpla ninguna condición no imprime nada para ese número.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String mensaje = "";
                if (i % 3 == 0) {
                System.out.println("Fizz");
                } 
                if (i % 5 == 0) {
                System.out.println("Buzz");
                } 
            
                if (mensaje.isEmpty()){
                System.out.println(i);
                }
        }
    }
}