package es.ies.puerto;

/**
 * Declara dos variables de tipo double para almacenar el precio de dos productos. Calcula la suma y muestra el resultado.
 * @author diego-febles-seo
 * @version 1.0.1
 */
public class Ejercicio2 {   
    public static void main(String[] args) {
        double precio1 = 2.95d;
        double precio2 = 1.50d;
        double suma = precio1 + precio2;
        System.out.println("el precio1 es: " +precio1+ ", el precio2 es: " +precio2);
        System.out.println("La suma de los precios es " +suma);
    }
}