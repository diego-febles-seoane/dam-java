package com.docencia.colecciones.ejercicio1;

import java.util.Objects;

public final class RegistroTexto extends Registro {
  private final String texto;

  public RegistroTexto(String id, String texto) {
    super(id);
    this.texto = Objects.requireNonNull(texto);
  }

  public String getTexto() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public String tipo() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
