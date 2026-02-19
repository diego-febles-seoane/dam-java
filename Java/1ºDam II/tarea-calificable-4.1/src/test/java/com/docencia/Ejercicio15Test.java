package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio15Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of("", 'a', 0),
      Arguments.of("banana", 'a', 3),
      Arguments.of("banana", 'b', 1),
      Arguments.of("aaaa", 'a', 4),
      Arguments.of("Mississippi", 's', 4)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(String texto, char c, int esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio15.contarCaracter(texto,c));
    assertEquals(esperado, com.docencia.logica.Ejercicio15.contarCaracter(texto,c));
  }
}
