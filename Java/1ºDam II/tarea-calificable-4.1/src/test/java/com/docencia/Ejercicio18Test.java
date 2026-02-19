package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio18Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{1,3,5}, new int[]{2,4,6}, new int[]{1,2,3,4,5,6}),
      Arguments.of(new int[]{}, new int[]{}, new int[]{}),
      Arguments.of(new int[]{1,2}, new int[]{}, new int[]{1,2}),
      Arguments.of(new int[]{}, new int[]{0,1}, new int[]{0,1}),
      Arguments.of(new int[]{-3,0}, new int[]{-2,4}, new int[]{-3,-2,0,4})
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int[] b, int[] esperado) {
    assertArrayEquals(esperado, com.docencia.recursividad.Ejercicio18.fusionarOrdenados(a,b));
    assertArrayEquals(esperado, com.docencia.logica.Ejercicio18.fusionarOrdenados(a,b));
  }
}
