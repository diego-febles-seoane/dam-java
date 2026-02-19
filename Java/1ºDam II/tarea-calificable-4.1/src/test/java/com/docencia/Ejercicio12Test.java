package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio12Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{1}, 1),
      Arguments.of(new int[]{1,2,3}, 3),
      Arguments.of(new int[]{-5,-2,-9}, -2),
      Arguments.of(new int[]{10,0,10}, 10),
      Arguments.of(new int[]{100,-1,50}, 100)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio12.maximoArreglo(a));
    assertEquals(esperado, com.docencia.logica.Ejercicio12.maximoArreglo(a));
  }
}
