package com.docencia.clases.ejercicio10;

import java.util.Objects;

/**
 * Ejercicio sobre clases
 * @author diegofebleseoane
 * @version 1.0.0
 */
public class Mascota {
    private String chip;
    private String nombre;
    private String tipo;

    /**
     * Constructor vacio
     */
    public Mascota() {
    }    

    /**
     * Constructor por defecto
     * @param chip de mascota
     * @param nombre de mascota
     * @param tipo de mascota
     */
    public Mascota(String chip, String nombre, String tipo) {
        this.chip = chip;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Constructor de chip
     * @param chip de mascota
     */
    public Mascota(String chip) {
        this.chip = chip;
    }
    
    /**
     * Getters y Setters
     * @return chip, nombre, tipo
     */
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mascota)) {
            return false;
        }
        Mascota mascota = (Mascota) o;
        return Objects.equals(chip, mascota.chip);
    }

    /**
     * Metodo hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(chip, nombre, tipo);
    }    
    

    /**
     * Metodo toString
     */
    @Override
    public String toString() {
        return "{" +
            " chip='" + getChip() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
    
}
