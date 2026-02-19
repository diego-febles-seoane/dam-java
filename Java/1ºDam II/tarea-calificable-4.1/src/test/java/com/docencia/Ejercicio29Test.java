package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio29Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[][]{{0,0},{1,0}}, 0, 0, 1, 1, true),
      Arguments.of(new int[][]{{0,1},{0,0}}, 0, 0, 1, 1, true),
      Arguments.of(new int[][]{{0,1},{1,0}}, 0, 0, 1, 1, false),
      Arguments.of(new int[][]{{0,0,0},{1,1,0},{0,0,0}}, 0, 0, 2, 2, true),
      Arguments.of(new int[][]{{0}}, 0, 0, 0, 0, true)
    );
  }

  @ParameterizedTest
  @MethodSource("casos")
  void prueba(int[][] m, int fi, int ci, int ff, int cf, boolean esperado) {
    assertEquals(esperado, com.docencia.recursividad.Ejercicio29.existeCaminoLaberinto(m,fi,ci,ff,cf));
    assertEquals(esperado, com.docencia.logica.Ejercicio29.existeCaminoLaberinto(m,fi,ci,ff,cf));
  }
}

