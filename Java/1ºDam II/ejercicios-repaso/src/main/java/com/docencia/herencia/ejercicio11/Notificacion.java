package com.docencia.herencia.ejercicio11;


import java.util.ArrayList;
import java.util.List;


public abstract class Notificacion {
    private final String mensaje;

    protected Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public abstract String formatear();
}
