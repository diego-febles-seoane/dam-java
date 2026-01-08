package com.docencia.clases.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona a = new Persona();
        Persona b = new Persona("DNI-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
