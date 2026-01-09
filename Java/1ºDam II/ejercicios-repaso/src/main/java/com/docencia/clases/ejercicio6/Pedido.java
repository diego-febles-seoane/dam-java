package com.docencia.clases.ejercicio6;

import java.util.Objects;

public class Pedido {
    private String codigo;
    private double importe;
    private String estado;

    public Pedido() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public Pedido(String codigo) {
        // TODO: constructor con identificador único
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: implementar equals comparando SOLO el identificador único (codigo)
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
