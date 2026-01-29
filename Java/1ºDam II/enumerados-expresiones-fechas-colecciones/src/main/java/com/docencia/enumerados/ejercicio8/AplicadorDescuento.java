package com.docencia.enumerados.ejercicio8;

public final class AplicadorDescuento {

  public int porcentaje(TipoDescuento tipo) {
    return switch (tipo) {
      case Ninguno -> 0;
      case DiezPorciento -> 10;
      case VeintePorciento -> 20;
      case Mitad -> 50;
    };
  }

  public boolean esDescuento(TipoDescuento tipo) {
    return porcentaje(tipo) > 0;
  }

  public int aplicar(TipoDescuento tipo, int precio) {
    int p = porcentaje(tipo);
    return (int) Math.round(precio * (100 - p) / 100.0);
  }
}
