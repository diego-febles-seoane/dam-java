package com.docencia.colecciones.ejercicio3;

import java.util.Objects;

public abstract class Producto {
  private final String sku;

  protected Producto(String sku) {
    this.sku = Objects.requireNonNull(sku);
  }

  public String getSku() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public abstract String categoria();
}
