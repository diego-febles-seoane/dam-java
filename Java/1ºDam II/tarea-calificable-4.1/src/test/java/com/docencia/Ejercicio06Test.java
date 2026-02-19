package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio06Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, List.of(0)),
      Arguments.of(1, List.of(1, 0)),
      Arguments.of(3, List.of(3, 2, 1, 0)),
      Arguments.of(5, List.of(5, 4, 3, 2, 1, 0)),
      Arguments.of(10, List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, List<Integer> esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio06.cuentaRegresiva(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio06.cuentaRegresiva(n));
  }
}
