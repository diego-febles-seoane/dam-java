package com.docencia.notifica;

public abstract class Notificacion {

    private final String destino;

    public Notificacion(String destino) {
        this.destino = destino;
    }

    public String getDestino(){
        return destino;
    }
}
