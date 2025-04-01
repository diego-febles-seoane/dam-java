package es.ies.puerto;

/**
 * Declara una variable int que contenga tu año de nacimiento. Calcula y muestra tu edad actual utilizando otra variable para el año actual.
 * @author diego-febles-seo
 * @version 1.0.0
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        int anioNacimiento = 2006;
        int anioActual = 2024;
        int edad = anioActual - anioNacimiento;
        System.out.println("Mi edad es " +edad);
    }
}