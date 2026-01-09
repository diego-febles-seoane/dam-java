package com.docencia.clases.ejercicio5;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private boolean vip;

    public Cliente() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public Cliente(int id) {
        // TODO: constructor con identificador único
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: implementar equals comparando SOLO el identificador único (id)
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: implementar hashCode consistente con equals (usar SOLO el identificador único)
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: implementar toString legible incluyendo al menos el identificador único
        return super.toString();
    }
}
