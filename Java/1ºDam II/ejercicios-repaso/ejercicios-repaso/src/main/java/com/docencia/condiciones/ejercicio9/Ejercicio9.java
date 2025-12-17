package com.docencia.condiciones.ejercicio9;

public class Ejercicio9 {
    /**
     * Con if/else: <18.5 "BAJO", <25 "NORMAL", <30 "SOBREPESO", resto "OBESIDAD".
     */
    public static String categoriaIMC(double imc) {
        if (imc < 18.5) {
            return "BAJO";
        } else if (imc < 25) {
            return "NORMAL";
        } else if (imc < 30) {
            return "SOBREPESO";
        } else {
            return "OBESIDAD";
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio9 listo para implementar.");
    }
}
