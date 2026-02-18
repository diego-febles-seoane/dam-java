package com.docencia.recursividad;

public class Ejercicio02 {
  /**
   * Calcula base^exponente (exponente >= 0)
   * TODO: Implementar usando recursividad.
   */
  public static long potencia(long base, int exponente) {
    if (exponente < 0){
      throw new IllegalArgumentException();
    }
    if (exponente == 0){
      return 1;
    }


    return potencia(base, exponente-1);
  }
}
