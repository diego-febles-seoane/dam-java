package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio08Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 1),
      Arguments.of(7, 1),
      Arguments.of(10, 2),
      Arguments.of(999, 3),
      Arguments.of(-12345, 5)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio08.contarDigitos(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio08.contarDigitos(n));
  }
}
