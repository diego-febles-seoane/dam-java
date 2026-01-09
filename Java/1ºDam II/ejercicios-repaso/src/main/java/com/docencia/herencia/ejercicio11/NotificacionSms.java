package com.docencia.herencia.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class NotificacionSms extends Notificacion {
    private final String telefono;

    public NotificacionSms(String telefono, String mensaje) {
        super(mensaje);
        this.telefono = telefono;
    }

    @Override
    public String formatear() {
        // TODO: implementar formato según tests.
        return "";
    }

    public static List<String> formatearTodas(List<Notificacion> notificaciones) {
        // TODO: devolver lista de mensajes formateados para notificaciones no nulas.
        return new ArrayList<>();
    }
}
