package com.docencia.colecciones.ejercicio5;

import java.util.Objects;

public final class MensajeEmail extends Mensaje {
  private final String email;

  public MensajeEmail(String email) {
    super("email");
    this.email = Objects.requireNonNull(email);
  }

  @Override
  public String destino() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
