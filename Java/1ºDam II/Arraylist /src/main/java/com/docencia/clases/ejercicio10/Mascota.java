package com.docencia.clases.ejercicio10;

import java.util.Objects;
/**
 * Ejercicio de clases
 * @author santiago
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
     * Constructor con la propiedad chip
     * @param chip chip de la mascota
     */
    public Mascota(String chip) {

        this.chip = chip;
    }

    /**
     * Getter del chip
     * @return chip de la mascota
     */
    public String getChip() {
        return chip;
    }

    /**
     * Setter del chip
     * @param chip de la mascota
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * Getter del nombre
     * @return nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre 
     * @param nombre de la mascota
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del tipo 
     * @return tipo de la mascota
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter del tipo
     * @param tipo de la mascota
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mascota)) {
            return false;
        }
        Mascota mascota = (Mascota) o;
        return Objects.equals(chip, mascota.chip) && Objects.equals(nombre, mascota.nombre) && Objects.equals(tipo, mascota.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chip,nombre,tipo);
    }
   


    @Override
    public String toString() {
        return "{" +
            " chip='" + getChip() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
    
}
