package com.docencia.recursividad;

import java.util.Arrays;

public class Ejercicio11 {
  /**
   * Suma de elementos
   * TODO: Implementar usando recursividad.
   */
  public static long sumaArreglo(int[] arreglo) {
    if (arreglo == null){
      throw new IllegalArgumentException();
    }
    if (arreglo.length < 1){
      return 0;
    }
    int numero = arreglo[0];
    if (arreglo.length == 1){
      return numero;
    }
    int[] arrayNuevo = Arrays.copyOfRange(arreglo, 2, arreglo.length);
    return numero + sumaArreglo(arrayNuevo);
  }
}
