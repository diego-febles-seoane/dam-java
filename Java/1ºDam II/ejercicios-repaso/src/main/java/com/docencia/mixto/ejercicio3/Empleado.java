package com.docencia.mixto.ejercicio3;

import java.util.Objects;

public class Empleado {
    private String nif;
    private String tipo;
    private int horas;
    private double salarioBase;
    private int antiguedad;

    public Empleado() {
        // TODO: constructor vacío
    }

    public Empleado(String nif, String tipo, int horas, double salarioBase, int antiguedad) {
        // TODO: constructor con identificador y datos

    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
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
