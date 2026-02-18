package com.docencia.recursividad;

public class Ejercicio03 {
  /**
   * Suma 1..n
   * TODO: Implementar usando recursividad.
   */
  public static long sumaHastaN(int n) {
    if (n < 0){
      throw new IllegalArgumentException();
    }
    if (n == 1){
      return 1;
    }
    
    return n + sumaHastaN(n-1) ;
  }
}
