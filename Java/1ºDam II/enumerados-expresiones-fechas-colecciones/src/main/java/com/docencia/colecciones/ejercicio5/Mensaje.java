package com.docencia.colecciones.ejercicio5;

import java.util.Objects;

public abstract class Mensaje {
  private final String canal;

  protected Mensaje(String canal) {
    this.canal = Objects.requireNonNull(canal);
  }

  public String getCanal() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public abstract String destino();
}
