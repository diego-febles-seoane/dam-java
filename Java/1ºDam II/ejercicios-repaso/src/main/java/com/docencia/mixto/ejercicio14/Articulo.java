package com.docencia.mixto.ejercicio14;

import java.util.Objects;

public class Articulo {
    private String sku;
    private String tipo;
    private int stock;

    public Articulo() {
        // TODO: constructor vacío
    }

    public Articulo(String sku, String tipo, int stock) {
        // TODO: constructor con identificador y datos
        this.sku = sku;
        this.tipo = tipo;
        this.stock = stock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: equals basado SOLO en el identificador único
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: hashCode consistente con equals
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: toString legible
        return super.toString();
    }
}
