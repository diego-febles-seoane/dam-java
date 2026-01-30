package com.docencia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Fechas {
    public static void main(String[] args) {
        Date fecha = new Date();
        LocalDate fechaActual = LocalDate.now(); // xxxxx dateFormat
        System.out.println(fecha);
        System.out.println("------");
        System.out.println(fechaActual);
        fecha.setDate(3);
            System.out.println(fecha);
        DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // ^[0-9]{4}-[0-9]{2}-[0-9]{2} 
        System.out.println(fechaActual.format(DateFormat));
        System.out.println(fechaActual.plusYears(40).format(DateFormat));
        LocalDate fechaFutura = LocalDate.now();
        if (fechaActual.isBefore(fechaFutura.plusYears(40))){
            System.out.println("Actual es anterior");
        }
        if (fechaActual.isAfter(fechaFutura.plusYears(40))){
            System.out.println("Actual no es posterior");
        }
    }
}
