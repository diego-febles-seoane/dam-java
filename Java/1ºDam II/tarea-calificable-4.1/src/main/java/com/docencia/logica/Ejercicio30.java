package com.docencia.logica;

import java.util.Arrays;

public class Ejercicio30 {
  /**
   * Subset sum (existe subconjunto)
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static boolean existeSubconjuntoSuma(int[] arreglo, int objetivo) {
    if (arreglo == null || arreglo.length == 0) {
      return false;
    }
    if (objetivo == 0) {
      return true;
    }
    int resultado = 0;
    for (int i = 0; i < arreglo.length; i++) {
      resultado += arreglo[i];
    }
    if (resultado == objetivo) {
      return true;
    }
    int posicion = 0;
    int valorInicial = arreglo[posicion];
    for (int i = posicion + 1; i < arreglo.length; i++) {
      int[] subConjunto = Arrays.copyOfRange(arreglo, posicion, arreglo.length);
      for (int j = 0; j < subConjunto.length; j++) {
        int valor = subConjunto[posicion];
        int valorEncontrado = valor + valorInicial;
        if (valorEncontrado == objetivo) {
          return true;
        }
      }
      posicion++;

    }
    return false;
  }
}
