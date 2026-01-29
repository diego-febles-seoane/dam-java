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
public class Wifi implements Conectable {

    private UUID id;
    private String ssid;
    private String password;

    public Wifi(UUID id, String ssid, String password) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.ssid = ssid;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getSsid() {
        return ssid;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean conectar(String destino) {
        return destino != null && !destino.isBlank();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Wifi wifi = (Wifi) o;
        return Objects.equals(id, wifi.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Wifi{" +
                "id=" + id +
                ", ssid='" + ssid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
