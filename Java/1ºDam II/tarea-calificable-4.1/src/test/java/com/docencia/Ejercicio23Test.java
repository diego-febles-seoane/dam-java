package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio23Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{}, 0L),
      Arguments.of(new int[]{1}, 0L),
      Arguments.of(new int[]{1,2,3}, 0L),
      Arguments.of(new int[]{3,2,1}, 3L),
      Arguments.of(new int[]{5,4,3,2,1}, 10L)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, long esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio23.contarInversiones(a));
    assertEquals(esperado, com.docencia.logica.Ejercicio23.contarInversiones(a));
  }
}
