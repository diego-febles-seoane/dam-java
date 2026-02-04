package com.docencia.clases.ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;

public class TarjetaEmbarque {

    private final String codigo;
    private final LocalDate fechaVuelo;
    private final LocalTime horaSalida;

    public TarjetaEmbarque(String codigo, LocalDate fechaVuelo, LocalTime horaSalida) {
        this.codigo = codigo;
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
    }

    public void validate(LocalDate hoy) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean puedeEmbarcar(LocalDate hoy, LocalTime ahora) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }
}
