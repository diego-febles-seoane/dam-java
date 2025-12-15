package com.docencia.clases.ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        Pelicula a = new Pelicula();
        Pelicula b = new Pelicula("CODIGO-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
