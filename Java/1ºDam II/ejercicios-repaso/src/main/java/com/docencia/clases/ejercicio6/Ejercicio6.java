package com.docencia.clases.ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        Pedido a = new Pedido();
        Pedido b = new Pedido("CODIGO-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
