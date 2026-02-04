package com.docencia.expresiones.ejercicio7;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio07Test {

  // ✅ VÁLIDOS

  @Test
  void shouldAcceptValidPasswordAbcdefg1Test() {
    // Verifica que acepta "Abcdefg1"
    assertTrue(Ejercicio07.isValidPasswordMin("Abcdefg1"));
  }

  @Test
  void shouldAcceptValidPasswordXyZ12345Test() {
    // Verifica que acepta "XyZ12345"
    assertTrue(Ejercicio07.isValidPasswordMin("XyZ12345"));
  }

  @Test
  void shouldAcceptValidPasswordPassWord9Test() {
    // Verifica que acepta "PassWord9"
    assertTrue(Ejercicio07.isValidPasswordMin("PassWord9"));
  }

  // ❌ INVÁLIDOS (requisitos)

  @Test
  void shouldRejectMissingUppercaseTest() {
    // Verifica que rechaza sin mayúscula: "abcdefg1"
    assertFalse(Ejercicio07.isValidPasswordMin("abcdefg1"));
  }

  @Test
  void shouldRejectMissingLowercaseTest() {
    // Verifica que rechaza sin minúscula: "ABCDEFG1"
    assertFalse(Ejercicio07.isValidPasswordMin("ABCDEFG1"));
  }

  @Test
  void shouldRejectMissingDigitTest() {
    // Verifica que rechaza sin dígito: "Abcdefgh"
    assertFalse(Ejercicio07.isValidPasswordMin("Abcdefgh"));
  }

  @Test
  void shouldRejectContainsSpaceTest() {
    // Verifica que rechaza con espacios: "Abc 1234"
    assertFalse(Ejercicio07.isValidPasswordMin("Abc 1234"));
  }

  @Test
  void shouldRejectTooShortTest() {
    // Verifica que rechaza por longitud mínima
    assertFalse(Ejercicio07.isValidPasswordMin("Ab1"));
  }

  @Test
  void shouldRejectTooLongTest() {
    // Verifica que rechaza por longitud máxima (>32)
    assertFalse(Ejercicio07.isValidPasswordMin("A" + "b".repeat(31) + "1")); // 33 chars
  }

  // null / vacío

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio07.isValidPasswordMin(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza vacío
    assertFalse(Ejercicio07.isValidPasswordMin(""));
  }
}

