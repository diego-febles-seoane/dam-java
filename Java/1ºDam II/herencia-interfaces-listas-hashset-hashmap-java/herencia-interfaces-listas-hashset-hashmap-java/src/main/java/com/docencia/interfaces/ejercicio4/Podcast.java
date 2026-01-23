package com.docencia.interfaces.ejercicio4;

import java.util.Objects;
import java.util.UUID;
/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Reproducible.
 */
public class Podcast implements Reproducible {

    private UUID id;
    private String nombre;
    private int episodio;

    public Podcast(UUID id, String nombre, int episodio) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.episodio = episodio;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpisodio() {
        return episodio;
    }

    @Override
    public String reproducir() {
        return "Reproduciendo podcast: " + nombre + " #" + episodio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Podcast podcast = (Podcast) o;
        return Objects.equals(id, podcast.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", episodio=" + episodio +
                '}';
    }
}
