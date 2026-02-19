package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio28Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(0, 1),
      Arguments.of(1, 1),
      Arguments.of(4, 2),
      Arguments.of(5, 10),
      Arguments.of(6, 4)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int n, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio28.contarSolucionesNReinas(n));
    assertEquals(esperado, com.docencia.logica.Ejercicio28.contarSolucionesNReinas(n));
  }
}
