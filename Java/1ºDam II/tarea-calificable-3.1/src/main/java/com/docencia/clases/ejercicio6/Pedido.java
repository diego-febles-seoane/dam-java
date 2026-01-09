package com.docencia.clases.ejercicio6;

import java.util.Objects;

public class Pedido {
    private String codigo;
    private double importe;
    private String estado;

    public Pedido() {
        // dejar valores por defecto (codigo, importe, estado)
    }

    public Pedido(String codigo) {
        this.codigo = codigo;
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(codigo, pedido.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", importe=" + importe +
                ", estado='" + estado + '\'' +
                '}';
    }
}
