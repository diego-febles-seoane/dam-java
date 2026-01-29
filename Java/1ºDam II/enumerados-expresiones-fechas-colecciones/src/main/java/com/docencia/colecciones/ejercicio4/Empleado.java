package com.docencia.colecciones.ejercicio4;

import java.util.Objects;

public abstract class Empleado {
  private final String nombre;

  protected Empleado(String nombre) {
    this.nombre = Objects.requireNonNull(nombre);
  }

  public String getNombre() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public abstract String tipo();

  public abstract double pago();
}
