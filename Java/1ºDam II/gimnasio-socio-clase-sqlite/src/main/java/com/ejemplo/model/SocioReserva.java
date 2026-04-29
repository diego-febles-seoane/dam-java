package com.ejemplo.model;

public class SocioReserva {
    private final Integer socioId;
    private final String socioNombre;
    private final Integer reservaId;
    private final String estadoReserva;
    private final Integer claseId;

    public SocioReserva(Integer socioId, String socioNombre, Integer reservaId, String estadoReserva, Integer claseId) {
        this.socioId = socioId;
        this.socioNombre = socioNombre;
        this.reservaId = reservaId;
        this.estadoReserva = estadoReserva;
        this.claseId = claseId;
    }

    public Integer getSocioId() {
        return socioId;
    }

    public String getSocioNombre() {
        return socioNombre;
    }

    public Integer getReservaId() {
        return reservaId;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public Integer getClaseId() {
        return claseId;
    }
}
