package com.docencia.colecciones.ejercicio4;

public final class EmpleadoFijo extends Empleado {
  private final double sueldoMensual;

  public EmpleadoFijo(String nombre, double sueldoMensual) {
    super(nombre);
    this.sueldoMensual = sueldoMensual;
  }

  @Override
  public String tipo() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public double pago() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
