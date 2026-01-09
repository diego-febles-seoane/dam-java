package com.docencia.clases.ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) {
        Mascota a = new Mascota();
        Mascota b = new Mascota("CHIP-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
