package com.docencia.clases.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche a = new Coche();
        Coche b = new Coche("MATRICULA-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
