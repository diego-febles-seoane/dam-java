package com.docencia.clases.ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        Curso a = new Curso();
        Curso b = new Curso("CODIGO-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
