package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio10Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of("", ""),
      Arguments.of("a", "a"),
      Arguments.of("hola", "aloh"),
      Arguments.of("Java", "avaJ"),
      Arguments.of("12345", "54321")
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(String texto, String esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio10.invertirCadena(texto));
    assertEquals(esperado, com.docencia.logica.Ejercicio10.invertirCadena(texto));
  }
}
