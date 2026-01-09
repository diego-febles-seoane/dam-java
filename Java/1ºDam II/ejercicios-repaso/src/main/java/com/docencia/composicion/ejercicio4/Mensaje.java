package com.docencia.composicion.ejercicio4;


import java.util.ArrayList;
import java.util.List;


public class Mensaje {
    private final String remitente;
    private final String destinatario;
    private final String texto;

    public Mensaje(String remitente, String destinatario, String texto) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.texto = texto;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getTexto() {
        return texto;
    }
}
