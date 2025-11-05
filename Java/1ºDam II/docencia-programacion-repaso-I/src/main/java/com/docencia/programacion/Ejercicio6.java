package com.docencia.programacion;

public class Ejercicio6 {
    public static double calculateFinalPrice(double basePrice, double taxRate) {
        double tasas = basePrice*taxRate;
        double precioTasas = basePrice+tasas;
        return precioTasas;
    }
}
