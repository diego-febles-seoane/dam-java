package com.docencia.mixto.ejercicio1;

public class Ejercicio1 {
    /**
     * Recorre el array con for. Filtra por categoria. Aplica descuento por mes con
     * switch: 1-3 5%, 4-6 10%, 7-9 15%, 10-12 0%. Devuelve total final.
     */
    public static double totalConDescuentoPorCategoria(Producto[] productos, String categoria, int mes) {
        double total = 0.0;
        for (Producto p : productos) {
            if (p != null && categoria.equals(p.getCategoria())) {
                double descuento = switch (mes) {
                    case 1, 2, 3 -> 0.05;
                    case 4, 5, 6 -> 0.10;
                    case 7, 8, 9 -> 0.15;
                    default -> 0.0;
                };
                total += p.getPrecio() * (1 - descuento);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio1 listo para implementar.");
    }
}
