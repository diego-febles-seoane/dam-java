package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio05Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(48, 18, 6),
      Arguments.of(0, 5, 5),
      Arguments.of(-24, 18, 6),
      Arguments.of(100, 10, 10),
      Arguments.of(270, 192, 6)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int a, int b, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio05.mcd(a,b));
    assertEquals(esperado, com.docencia.logica.Ejercicio05.mcd(a,b));
  }
}
