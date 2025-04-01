package es.ies.puerto;

public class Ejercicio13 {
/**
 * Crea un programa que convierta un poder de pelea (entero) en un string y viceversa usando los métodos Integer.parseInt() y Integer.toString().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int poderEntero = 4000;
        String poderCadena = "5000";
        String poderEnteroString = Integer.toString(poderEntero);
        System.out.println(poderEnteroString + " cadena desde entero");
        int poderCadenaInt = Integer.parseInt(poderCadena);
        System.out.println(poderCadenaInt + " entero desde cadena");
    }
}