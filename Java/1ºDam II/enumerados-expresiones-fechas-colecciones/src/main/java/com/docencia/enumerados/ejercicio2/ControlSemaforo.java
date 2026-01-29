package com.docencia.enumerados.ejercicio2;

public final class ControlSemaforo {

  public boolean puedeAvanzar(ColorSemaforo color) {
    return color == ColorSemaforo.Verde;
  }

  public ColorSemaforo siguienteColor(ColorSemaforo color) {
    return switch (color) {
      case Rojo -> ColorSemaforo.Verde;
      case Verde -> ColorSemaforo.Ambar;
      case Ambar -> ColorSemaforo.Rojo;
    };
  }

  public int segundosHastaCambio(ColorSemaforo color) {
    return switch (color) {
      case Rojo -> 45;
      case Verde -> 40;
      case Ambar -> 5;
    };
  }
}
