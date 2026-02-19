package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio30Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{1,2,3}, 0, true),
      Arguments.of(new int[]{1,2,3}, 6, true),
      Arguments.of(new int[]{1,2,3}, 7, false),
      Arguments.of(new int[]{5,10,12}, 15, true),
      Arguments.of(new int[]{3,34,4,12,5,2}, 9, true)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int objetivo, boolean esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio30.existeSubconjuntoSuma(a,objetivo));
    assertEquals(esperado, com.docencia.logica.Ejercicio30.existeSubconjuntoSuma(a,objetivo));
  }
}
