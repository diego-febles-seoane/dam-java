package com.docencia.enumerados.ejercicio5;

public final class EnvioService {

  public int coste(TipoEnvio tipo) {
    return switch (tipo) {
      case Estandar -> 5;
      case Express -> 12;
      case Recogida -> 0;
    };
  }

  public int diasEntrega(TipoEnvio tipo) {
    return switch (tipo) {
      case Express -> 1;
      case Estandar -> 3;
      case Recogida -> 0;
    };
  }

  public boolean esRapido(TipoEnvio tipo) {
    return diasEntrega(tipo) <= 1;
  }
}
