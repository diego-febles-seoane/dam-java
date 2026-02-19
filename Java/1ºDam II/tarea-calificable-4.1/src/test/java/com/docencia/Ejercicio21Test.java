package com.docencia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio21Test {
  static Stream<Arguments> casos() {
    return Stream.of(
      Arguments.of(new int[]{}, new int[]{}),
      Arguments.of(new int[]{1}, new int[]{1}),
      Arguments.of(new int[]{3,2,1}, new int[]{1,2,3}),
      Arguments.of(new int[]{5,1,4,2,8}, new int[]{1,2,4,5,8}),
      Arguments.of(new int[]{0,-1,5,-3}, new int[]{-3,-1,0,5})
    );
  }

  @ParameterizedTest @MethodSource("casos")
  void prueba(int[] a, int[] esperado) {
    assertArrayEquals(esperado, com.docencia.recursividad.Ejercicio21.quickSort(a));
    assertArrayEquals(esperado, com.docencia.logica.Ejercicio21.quickSort(a));
  }
}
