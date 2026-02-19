package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio01Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 1),
      Arguments.of(1, 1),
      Arguments.of(5, 120),
      Arguments.of(7, 5040),
      Arguments.of(10, 3628800)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio01.factorial(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio01.factorial(n));
  }
}
