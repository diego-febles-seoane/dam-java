package com.ejemplo.model;

public class ClaseReservaSocio {
    private final Integer reservaId;
    private final Integer claseId;
    private final String claseNombre;
    private final Integer socioId;
    private final String socioNombre;
    private final String estadoReserva;

    public ClaseReservaSocio(Integer reservaId, Integer claseId, String claseNombre, Integer socioId,
            String socioNombre,
            String estadoReserva) {
        this.reservaId = reservaId;
        this.claseId = claseId;
        this.claseNombre = claseNombre;
        this.socioId = socioId;
        this.socioNombre = socioNombre;
        this.estadoReserva = estadoReserva;
    }

    public Integer getReservaId() {
        return reservaId;
    }

    public Integer getClaseId() {
        return claseId;
    }

    public String getClaseNombre() {
        return claseNombre;
    }

    public Integer getSocioId() {
        return socioId;
    }

    public String getSocioNombre() {
        return socioNombre;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }
}
