package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio19Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{1,2,3,4,5}, 1, 0),
      Arguments.of(new int[]{1,2,3,4,5}, 5, 4),
      Arguments.of(new int[]{1,2,3,4,5}, 6, -1),
      Arguments.of(new int[]{}, 1, -1),
      Arguments.of(new int[]{1,3,5,7,9}, 7, 3)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int x, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio19.busquedaBinaria(a,x));
    assertEquals(esperado, com.docencia.logica.Ejercicio19.busquedaBinaria(a,x));
  }
}
