package com.ejemplo.model;

public class ClaseMonitor {
    private final Integer claseId;
    private final String claseNombre;
    private final String tipo;
    private final String monitorNombre;
    private final String especialidad;

    public ClaseMonitor(Integer claseId, String claseNombre, String tipo, String monitorNombre, String especialidad) {
        this.claseId = claseId;
        this.claseNombre = claseNombre;
        this.tipo = tipo;
        this.monitorNombre = monitorNombre;
        this.especialidad = especialidad;
    }

    public Integer getClaseId() {
        return claseId;
    }

    public String getClaseNombre() {
        return claseNombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMonitorNombre() {
        return monitorNombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
