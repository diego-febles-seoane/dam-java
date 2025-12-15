package com.docencia.mixto.ejercicio2;

public class Ejercicio2 {
    /**
     * Con for, cuenta aprobados (>=5) y suspensos. Con switch, asigna mención para
     * la nota (0-4 SUSPENSO, 5-6 APROBADO, 7-8 NOTABLE, 9-10 SOBRESALIENTE) y
     * cuenta cuántos SOBRESALIENTE hay. Devuelve
     * "APROBADOS=x;SUSPENSOS=y;SOBRESALIENTES=z".
     */
    public static String resumenAprobados(Alumno[] alumnos) {
        int aprobados = 0, suspensos = 0, sobresalientes = 0;
        for (Alumno a : alumnos) {
            if (a != null) {
                if (a.getNota() >= 5) {
                    aprobados++;
                } else {
                    suspensos++;
                }
                String mencion = switch (a.getNota()) {
                    case 0, 1, 2, 3, 4 -> "SUSPENSO";
                    case 5, 6 -> "APROBADO";
                    case 7, 8 -> "NOTABLE";
                    case 9, 10 -> "SOBRESALIENTE";
                    default -> "INVALIDO";
                };
                if ("SOBRESALIENTE".equals(mencion)) {
                    sobresalientes++;
                }
            }
        }
        return "APROBADOS=" + aprobados + ";SUSPENSOS=" + suspensos + ";SOBRESALIENTES=" + sobresalientes;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio2 listo para implementar.");
    }
}
