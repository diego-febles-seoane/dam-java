package com.docencia.colecciones.ejercicio3;

public final class ProductoDigital extends Producto {
  private final int megas;

  public ProductoDigital(String sku, int megas) {
    super(sku);
    this.megas = megas;
  }

  public int getMegas() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public String categoria() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
