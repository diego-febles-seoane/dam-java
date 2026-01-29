package com.docencia.colecciones.ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

public final class ProductoPerecedero extends Producto {
  private final LocalDate caducidad;

  public ProductoPerecedero(String sku, LocalDate caducidad) {
    super(sku);
    this.caducidad = Objects.requireNonNull(caducidad);
  }

  public LocalDate getCaducidad() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public String categoria() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
