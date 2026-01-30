package com.docencia;

import java.time.LocalDate;

public class UtilidatesFecha {
    
    /**
     * Funcion que verifica si un anio es bisiesto
     * @param fecha Fecha que se comprueba
     * @return true/false
     */
    static boolean isBisiesto(int anio, int mes, int dia){
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            return fecha.isLeapYear();
        } catch (Exception e) {
            return false;
        }
        
    }

    static int calcularEdad(LocalDate fechaNacimiento){
        int edad;
        LocalDate fechaActual = LocalDate.now();
        edad = fechaActual.compareTo(fechaNacimiento);
        return edad;
    }

    public static void main(String[] args) {
        System.out.println("Es bisiesto: "+isBisiesto(2026,2,29));
        LocalDate fechaNacimiento = LocalDate.of(2006, 03, 06);
        System.out.println("Que edad tiene: "+calcularEdad(fechaNacimiento));
    }
}
