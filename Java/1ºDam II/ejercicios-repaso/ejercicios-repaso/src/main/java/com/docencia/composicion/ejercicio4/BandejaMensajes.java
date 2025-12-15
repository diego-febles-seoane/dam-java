package com.docencia.composicion.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BandejaMensajes {
    private final List<Mensaje> mensajes = new ArrayList<>();

    public void enviarMensaje(String remitente, String destinatario, String texto) {
        // TODO: validar remitente, destinatario y texto según enunciado.
        if (remitente != null && destinatario != null && texto != null) {
            mensajes.add(new Mensaje(remitente, destinatario, texto));
        }
    }

    public List<Mensaje> mensajesPara(String destinatario) {
        List<Mensaje> result = new ArrayList<>();
        for (Mensaje m : mensajes) {
            if (m.getDestinatario().equalsIgnoreCase(destinatario)) {
                result.add(m);
            }
        }
        return result;
    }

    public List<Mensaje> getMensajes() {
        return new ArrayList<>(mensajes);
    }
}
