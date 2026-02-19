package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio16Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of("banana", 'a', "bnn"),
      Arguments.of("aaaa", 'a', ""),
      Arguments.of("Hola", 'o', "Hla"),
      Arguments.of("", 'x', ""),
      Arguments.of("123-45-6", '-', "123456")
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(String texto, char c, String esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio16.eliminarCaracter(texto,c));
    assertEquals(esperado, com.docencia.logica.Ejercicio16.eliminarCaracter(texto,c));
  }
}
