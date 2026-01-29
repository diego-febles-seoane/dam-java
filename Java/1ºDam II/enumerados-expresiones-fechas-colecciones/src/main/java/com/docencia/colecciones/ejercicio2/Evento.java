package com.docencia.colecciones.ejercicio2;

import java.util.Objects;

public abstract class Evento {
  private final String nombre;

  protected Evento(String nombre) {
    this.nombre = Objects.requireNonNull(nombre);
  }

  public String getNombre() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public abstract String visibilidad();

  @Override
  public boolean equals(Object o) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public int hashCode() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
