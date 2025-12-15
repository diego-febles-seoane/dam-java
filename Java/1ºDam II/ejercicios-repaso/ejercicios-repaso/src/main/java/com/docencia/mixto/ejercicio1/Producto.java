package com.docencia.mixto.ejercicio1;

import java.util.Objects;

public class Producto {
    private String codigo;
    private String categoria;
    private double precio;

    public Producto() {
        // TODO: constructor vacío
    }

    public Producto(String codigo, String categoria, double precio) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{codigo='" + codigo + "', categoria='" + categoria + "', precio=" + precio + "}";
    }
}
