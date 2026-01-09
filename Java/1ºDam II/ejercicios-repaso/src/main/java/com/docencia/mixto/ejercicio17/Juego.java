package com.docencia.mixto.ejercicio17;

import java.util.Objects;

public class Juego {
    private String codigo;
    private String plataforma;
    private double precio;

    public Juego() {
        // TODO: constructor vacío
    }

    public Juego(String codigo, String plataforma, double precio) {
        // TODO: constructor con identificador y datos
        this.codigo = codigo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
