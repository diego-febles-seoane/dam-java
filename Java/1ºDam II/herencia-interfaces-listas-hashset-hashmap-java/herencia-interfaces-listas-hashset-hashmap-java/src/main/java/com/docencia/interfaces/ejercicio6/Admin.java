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
public class Admin implements Autenticable {

    private UUID id;
    private String nombre;
    private String hash;

    public Admin(UUID id, String nombre, String hash) {
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }
}
