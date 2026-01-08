package com.docencia.mixto.ejercicio6;

import java.util.Objects;

public class Ticket {
    private String id;
    private String prioridad;
    private boolean cerrado;

    public Ticket() {
        // TODO: constructor vacío
    }

    public Ticket(String id, String prioridad, boolean cerrado) {
        // TODO: constructor con identificador y datos

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: equals basado SOLO en el identificador único
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: hashCode consistente con equals
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: toString legible
        return super.toString();
    }
}
