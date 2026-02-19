package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio25Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{}, 1),
      Arguments.of(new int[]{1}, 1),
      Arguments.of(new int[]{1,2}, 2),
      Arguments.of(new int[]{1,2,3}, 6),
      Arguments.of(new int[]{1,2,2}, 6)
    );
  }

  private static Set<List<Integer>> comoConjunto(List<List<Integer>> ll) {
    return new HashSet<>(ll);
  }
  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int tamanioEsperado) {
    var r1 = com.docencia.recursividad.Ejercicio25.generarPermutaciones(a);
    var r2 = com.docencia.logica.Ejercicio25.generarPermutaciones(a);
    assertEquals(tamanioEsperado, r1.size());
    assertEquals(tamanioEsperado, r2.size());
    assertEquals(comoConjunto(r1), comoConjunto(r2));
  }
}
