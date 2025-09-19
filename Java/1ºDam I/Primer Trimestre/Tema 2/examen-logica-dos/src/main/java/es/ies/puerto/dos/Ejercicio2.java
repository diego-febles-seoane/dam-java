package es.ies.puerto.dos;

public class Ejercicio2 {

    /**
    * Escribe un programa que reciba un array de números enteros y cuente cuántas veces aparece cada número. sin añadir numeros repetidos al array.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 3, 4, 5, 5};
        int[] contador = new int[numeros.length];
        int maximo = 0;
        int maximoPosicion = 0;

        for (int i = 0; i < numeros.length; i++) {
            contador[numeros[i] - 1]++;
            if (contador[numeros[i] - 1] > maximo) {
                maximo = contador[numeros[i] - 1];
                maximoPosicion = numeros[i] - 1;
            }else{
            }
    
            System.out.println("El número " + numeros[i] + " aparece " + numeros[i] + " veces.");
        }
    }
}