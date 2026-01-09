package com.docencia.herencia.ejercicio11;

public class NotificacionEmail extends Notificacion {

    private final String destinatario;
    private final String asunto;

    public NotificacionEmail(String destinatario, String asunto, String mensaje) {
        super(mensaje);
        this.destinatario = destinatario;
        this.asunto = asunto;
    }

    @Override
    public String formatear() {
        // TODO: implementar formato según tests.
        return "";
    }
}