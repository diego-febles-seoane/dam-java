package com.docencia.logica;

public class Ejercicio02 {
  /**
   * Calcula base^exponente (exponente >= 0)
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static long potencia(long base, int exponente) {
    if (exponente < 0){
      throw new IllegalArgumentException();
    }
    return 1;
  }
}
