package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio09Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 0),
      Arguments.of(10, 1),
      Arguments.of(1200, 21),
      Arguments.of(-123, -321),
      Arguments.of(9070, 709)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio09.invertirNumero(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio09.invertirNumero(n));
  }
}
