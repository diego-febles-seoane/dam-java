package com.docencia.enumerados.ejercicio10;

public final class ValorPieza {

  public int obtenerValor(PiezaAjedrez pieza) {
    return switch (pieza) {
      case Rey -> 0;
      case Reina -> 9;
      case Torre -> 5;
      case Alfil -> 3;
      case Caballo -> 3;
      case Peon -> 1;
    };
  }

  public boolean esPiezaMayor(PiezaAjedrez pieza) {
    return pieza == PiezaAjedrez.Reina || pieza == PiezaAjedrez.Torre;
  }

  public int materialTotal(PiezaAjedrez[] piezas) {
    int suma = 0;
    for (PiezaAjedrez p : piezas) suma += obtenerValor(p);
    return suma;
  }
}
