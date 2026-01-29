package com.docencia.colecciones.ejercicio1;

import java.util.Objects;

public abstract class Registro {
  private final String id;

  protected Registro(String id) {
    this.id = Objects.requireNonNull(id);
  }

  public String getId() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public abstract String tipo();
}
