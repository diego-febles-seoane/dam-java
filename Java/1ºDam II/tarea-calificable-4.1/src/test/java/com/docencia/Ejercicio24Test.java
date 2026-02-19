package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio24Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{1}, 1),
      Arguments.of(new int[]{1,3,5,4,2}, 5),
      Arguments.of(new int[]{0,2,4,6,5,3,1}, 6),
      Arguments.of(new int[]{3,5,7,6,4}, 7),
      Arguments.of(new int[]{10,20,30,25,5}, 30)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio24.encontrarPico(a));
    assertEquals(esperado, com.docencia.logica.Ejercicio24.encontrarPico(a));
  }
}
