package com.docencia.interfaces.ejercicio3;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Conectable.
 */
public class Bluetooth implements Conectable {

    private UUID id;
    private String mac;
    private int canal;

    public Bluetooth(UUID id, String mac, int canal) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.mac = mac;
        this.canal = canal;
    }

    public UUID getId() {
        return id;
    }

    public String getMac() {
        return mac;
    }

    public int getCanal() {
        return canal;
    }

    @Override
    public boolean conectar(String destino) {
        return destino != null && destino.contains(":");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bluetooth bluetooth = (Bluetooth) o;
        return Objects.equals(id, bluetooth.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Bluetooth{" +
                "id=" + id +
                ", mac='" + mac + '\'' +
                ", canal=" + canal +
                '}';
    }
}
