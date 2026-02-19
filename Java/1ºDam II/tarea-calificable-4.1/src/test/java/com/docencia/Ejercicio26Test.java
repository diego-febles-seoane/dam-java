package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio26Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{1,2,3}, 0, 1),
      Arguments.of(new int[]{1,2,3}, 1, 3),
      Arguments.of(new int[]{1,2,3}, 2, 3),
      Arguments.of(new int[]{1,2,3}, 3, 1),
      Arguments.of(new int[]{1,2,3,4}, 2, 6)
    );
  }

  private static Set<List<Integer>> comoConjunto(List<List<Integer>> ll) {
    return new HashSet<>(ll);
  }
  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int k, int tamanioEsperado) {
    var r1 = com.docencia.recursividad.Ejercicio26.generarCombinaciones(a,k);
    var r2 = com.docencia.logica.Ejercicio26.generarCombinaciones(a,k);
    assertEquals(tamanioEsperado, r1.size());
    assertEquals(tamanioEsperado, r2.size());
    assertEquals(comoConjunto(r1), comoConjunto(r2));
  }
}
