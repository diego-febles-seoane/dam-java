package com.ejemplo.support;

import com.ejemplo.model.Clase;
import com.ejemplo.model.Socio;

public final class TestDataFactory {

    private TestDataFactory() {
    }

    public static Socio validSocio() {
        return new Socio(null, "77777777G", "Mario Luna", "mario@gym.com", "600444444", "basic", 1);
    }

    public static Socio invalidSocioWithEmptyName() {
        return new Socio(null, "88888888H", "   ", "vacio@gym.com", "600555555", "basic", 1);
    }

    public static Socio updateSocio(Integer id) {
        return new Socio(id, "44444444D", "Ana Ruiz Premium", "ana@gym.com", "600111111", "vip", 1);
    }

    public static Clase validClase() {
        return new Clase(null, "Box Funcional", "box", "2026-05-05 20:00:00", 10, 4, 1, 2);
    }

    public static Clase invalidClaseWithEmptyName() {
        return new Clase(null, "   ", "box", "2026-05-05 20:00:00", 10, 4, 1, 2);
    }

    public static Clase updateClase(Integer id) {
        return new Clase(id, "Yoga Manana Plus", "yoga", "2026-05-01 09:30:00", 20, 6, 1, 1);
    }
}
