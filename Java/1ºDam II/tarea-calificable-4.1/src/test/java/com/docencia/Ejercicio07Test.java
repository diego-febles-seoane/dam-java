package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio07Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 0),
      Arguments.of(5, 5),
      Arguments.of(10, 1),
      Arguments.of(123, 6),
      Arguments.of(-999, 27)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio07.sumaDigitos(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio07.sumaDigitos(n));
  }
}
