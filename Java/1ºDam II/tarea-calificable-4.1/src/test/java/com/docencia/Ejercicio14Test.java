package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio14Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of("", true),
      Arguments.of("a", true),
      Arguments.of("aba", true),
      Arguments.of("abca", false),
      Arguments.of("radar", true)
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(String texto, boolean esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio14.esPalindromo(texto));
    assertEquals(esperado, com.docencia.logica.Ejercicio14.esPalindromo(texto));
  }
}
