package com.docencia.enumerados.ejercicio6;

public final class GestorIncidencias {

  public int tiempoRespuestaMinutos(Prioridad p) {
    return switch (p) {
      case Alta -> 30;
      case Media -> 120;
      case Baja -> 480;
    };
  }

  public boolean esCritica(Prioridad p) {
    return p == Prioridad.Alta;
  }

  public int comparar(Prioridad a, Prioridad b) {
    // Alta > Media > Baja (ordinal mas alto = mas prioridad)
    return Integer.compare(a.ordinal(), b.ordinal());
  }
}
