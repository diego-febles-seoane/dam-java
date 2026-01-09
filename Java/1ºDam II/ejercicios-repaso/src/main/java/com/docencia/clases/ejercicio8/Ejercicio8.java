package com.docencia.clases.ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario a = new Usuario();
        Usuario b = new Usuario("USERNAME-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
