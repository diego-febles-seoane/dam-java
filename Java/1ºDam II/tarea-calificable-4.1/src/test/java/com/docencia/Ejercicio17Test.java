package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio17Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{}, true),
      Arguments.of(new int[]{1}, true),
      Arguments.of(new int[]{1,2,3}, true),
      Arguments.of(new int[]{3,2,1}, false),
      Arguments.of(new int[]{1,2,2,1}, false)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, boolean esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio17.estaOrdenadoAsc(a));
    assertEquals(esperado, com.docencia.logica.Ejercicio17.estaOrdenadoAsc(a));
  }
}
