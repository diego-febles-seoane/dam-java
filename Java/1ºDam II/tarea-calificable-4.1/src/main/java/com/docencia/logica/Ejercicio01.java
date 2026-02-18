package com.docencia.logica;

public class Ejercicio01 {
  /**
   * Calcula n!
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static long factorial(int n) {
    if (n < 0){
      throw new IllegalArgumentException();
    }

    if (n < 2){
      return 1;
    }

    long resultado = 0;
    for (int i = 1; i <= n; i ++){
      resultado += i;
    }

    return resultado;
  }
}
