package com.docencia.interfaces.ejercicio6;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Autenticable.
 */
public class Usuario implements Autenticable {

    private UUID id;
    private String nombre;
    private String hash;

    public Usuario(UUID id, String nombre, String hash) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.hash = hash;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public boolean autenticar(String clave) {
        return clave != null && clave.equals(hash);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
