package com.docencia.clases.ejercicio2;

import java.time.LocalDate;

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
        throw new UnsupportedOperationException("TODO");
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
