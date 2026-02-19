package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio03Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 0L),
      Arguments.of(1, 1L),
      Arguments.of(5, 15L),
      Arguments.of(10, 55L),
      Arguments.of(100, 5050L)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, long esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio03.sumaHastaN(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio03.sumaHastaN(n));
  }
}
