package com.docencia.clases.ejercicio2;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class ReservaHotel {

    private final String codigoReserva;
    private final String dni;
    private final LocalDate checkIn;
    private final LocalDate checkOut;

    public ReservaHotel(String codigoReserva, String dni, LocalDate checkIn, LocalDate checkOut) {
        this.codigoReserva = codigoReserva;
        this.dni = dni;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void validate() {
        String patronDni = "^[0-9]{8}[a-zA-Z]$";
        String patronCodigoReserva = "^[a-zA-Z]{3}-[0-9]{4}-[a-zA-Z]{3}$";

        boolean invaliDni = Pattern.matches(patronDni, this.dni);
        if (invaliDni == false){
            throw new IllegalArgumentException();
        }
        boolean invaliCodigoReserva = Pattern.matches(patronCodigoReserva, this.codigoReserva);
        if (invaliCodigoReserva == false){
            throw new IllegalArgumentException();
        }
    }

    public long noches() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean puedeCancelar(LocalDate hoy) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
}
