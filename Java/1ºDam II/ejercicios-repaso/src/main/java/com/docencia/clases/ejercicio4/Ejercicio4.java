package com.docencia.clases.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria a = new CuentaBancaria();
        CuentaBancaria b = new CuentaBancaria("IBAN-001");
        System.out.println("Objeto (vacío): " + a);
        System.out.println("Objeto (con id): " + b);
        System.out.println("¿Son iguales? " + a.equals(b));
    }
}
