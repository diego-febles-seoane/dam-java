package com.docencia.colecciones.ejercicio4;

public final class EmpleadoPorHoras extends Empleado {
  private final double tarifa;
  private final int horas;

  public EmpleadoPorHoras(String nombre, double tarifa, int horas) {
    super(nombre);
    this.tarifa = tarifa;
    this.horas = horas;
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
