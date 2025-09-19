package es.ies.puerto;

public class Ejercicio5 {
    /**
    * En un campo de batalla galáctico, se están midiendo las fuerzas de los Jedi (números pares) y los Sith (números impares). Escribe un programa que cuente cuántos Jedi y cuántos Sith hay en un array de fuerzas.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        int[] fuerzas = {100, 45, 78, 13, 56, 91};
        int jedi = 0;
        int sith = 0;
        int tañanoArray = fuerzas.length;

        for (int i = 0; i < tañanoArray; i++){
            if (fuerzas[i] % 2 == 0){
                jedi ++;
            }else{
                sith ++;
            }
        }
        System.out.println("La cantidad de Jedis es de: " +jedi);
        System.out.println("La cantidad de Sith es de: " +sith);
    }
}