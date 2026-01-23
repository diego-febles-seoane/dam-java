package com.docencia.interfaces.ejercicio8;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Notificable.
 */
public class SmsNotifier implements Notificable {

    private UUID id;
    private String numero;
    private String proveedor;

    public SmsNotifier(UUID id, String numero, String proveedor) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.numero = numero;
        this.proveedor = proveedor;
    }

    public UUID getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getProveedor() {
        return proveedor;
    }

    @Override
    public boolean notificar(String mensaje) {
        return mensaje != null && !mensaje.isBlank() && numero != null && numero.length() >= 6;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmsNotifier that = (SmsNotifier) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SmsNotifier{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }
}
