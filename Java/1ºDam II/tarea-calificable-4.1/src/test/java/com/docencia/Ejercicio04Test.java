package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio04Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 0L),
      Arguments.of(1, 1L),
      Arguments.of(2, 1L),
      Arguments.of(10, 55L),
      Arguments.of(20, 6765L)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, long esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio04.fibonacci(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio04.fibonacci(n));
  }
}
