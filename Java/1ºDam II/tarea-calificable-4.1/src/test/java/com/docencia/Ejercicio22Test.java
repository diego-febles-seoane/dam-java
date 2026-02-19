package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio22Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(2L, 0, 1L),
      Arguments.of(2L, 10, 1024L),
      Arguments.of(5L, 3, 125L),
      Arguments.of(10L, 2, 100L),
      Arguments.of(3L, 7, 2187L)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(long base, int exp, long esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio22.potenciaRapida(base, exp));
    assertEquals(esperado, com.docencia.logica.Ejercicio22.potenciaRapida(base, exp));
  }
}
