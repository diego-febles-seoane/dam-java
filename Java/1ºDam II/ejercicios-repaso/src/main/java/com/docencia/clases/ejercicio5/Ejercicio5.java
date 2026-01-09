package com.docencia.clases.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        Cliente a = new Cliente();
        Cliente b = new Cliente(1);
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
