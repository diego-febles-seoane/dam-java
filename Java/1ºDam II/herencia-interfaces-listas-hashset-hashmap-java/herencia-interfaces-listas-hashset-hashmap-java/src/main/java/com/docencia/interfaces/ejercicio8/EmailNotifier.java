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
public class EmailNotifier implements Notificable {

    private UUID id;
    private String from;
    private String to;

    public EmailNotifier(UUID id, String from, String to) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.from = from;
        this.to = to;
    }

    public UUID getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean notificar(String mensaje) {
        return mensaje != null && !mensaje.isBlank() && to.contains("@");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmailNotifier that = (EmailNotifier) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EmailNotifier{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
