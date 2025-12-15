package com.docencia.clases.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Libro a = new Libro();
        Libro b = new Libro("ISBN-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
