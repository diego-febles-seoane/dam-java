package com.docencia.colecciones.ejercicio5;

import java.util.Objects;

public final class MensajeSms extends Mensaje {
  private final String numero;

  public MensajeSms(String numero) {
    super("sms");
    this.numero = Objects.requireNonNull(numero);
  }

  @Override
  public String destino() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
