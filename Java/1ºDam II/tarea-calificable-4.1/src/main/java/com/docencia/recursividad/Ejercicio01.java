package com.docencia.recursividad;

public class Ejercicio01 {
  /**
   * Calcula n!
   * TODO: Implementar usando recursividad.
   */
  public static long factorial(int n) {
    if (n < 0){
      throw new IllegalArgumentException();
    }
    if (n==1){
      return 1;
    }
    return n * factorial(n-1);
  }
}
