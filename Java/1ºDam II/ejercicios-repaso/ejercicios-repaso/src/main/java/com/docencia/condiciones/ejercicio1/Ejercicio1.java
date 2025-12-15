package com.docencia.condiciones.ejercicio1;

public class Ejercicio1 {
    /**
     * Devuelve "SUSPENSO", "APROBADO", "NOTABLE" o "SOBRESALIENTE" según la nota
     * (0-10).
     */
    public static String clasificarNota(int nota) {
        if (nota < 5) {
            return "SUSPENSO";
        } else if (nota < 7) {
            return "APROBADO";
        } else if (nota < 9) {
            return "NOTABLE";
        } else {
            return "SOBRESALIENTE";
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio1 listo para implementar.");
    }
}
