package com.docencia.composicion.ejercicio20;

import java.util.Objects;

public class Mascota {
    private String nombre;
    private String especie;

    public Mascota() {
    }

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mascota)) {
            return false;
        }
        Mascota mascota = (Mascota) o;
        return Objects.equals(nombre, mascota.nombre) && Objects.equals(especie, mascota.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie);
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", especie='" + getEspecie() + "'" +
                "}";
    }

}
