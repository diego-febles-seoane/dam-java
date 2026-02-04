package com.docencia.expresiones.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

  // ✅ VÁLIDOS

  @Test
  void shouldAcceptValidPlate1234BCDTest() {
    // Verifica que acepta "1234BCD"
    assertTrue(Ejercicio05.isValidMatriculaES("1234BCD"));
  }

  @Test
  void shouldAcceptValidPlate0001XYZTest() {
    // Verifica que acepta "0001XYZ"
    assertTrue(Ejercicio05.isValidMatriculaES("0001XYZ"));
  }

  @Test
  void shouldAcceptValidPlateWithAllowedLettersTest() {
    // Verifica que acepta letras permitidas (sin vocales)
    assertTrue(Ejercicio05.isValidMatriculaES("9999TRS"));
    assertTrue(Ejercicio05.isValidMatriculaES("0123BCF"));
  }

  // ❌ INVÁLIDOS (longitud / estructura)

  @Test
  void shouldRejectTooShort123ABCTest() {
    // Verifica que rechaza "123ABC" (3 dígitos + 3 letras)
    assertFalse(Ejercicio05.isValidMatriculaES("123ABC"));
  }

  @Test
  void shouldRejectWrongPattern12A4BCDTest() {
    // Verifica que rechaza "12A4BCD" (letra en la parte numérica)
    assertFalse(Ejercicio05.isValidMatriculaES("12A4BCD"));
  }

  @Test
  void shouldRejectTooLongTest() {
    // Verifica que rechaza longitud mayor
    assertFalse(Ejercicio05.isValidMatriculaES("12345BCD"));
    assertFalse(Ejercicio05.isValidMatriculaES("1234BCDE"));
  }

  // ❌ INVÁLIDOS (vocales)

  @Test
  void shouldRejectVowels1234AEITest() {
    // Verifica que rechaza "1234AEI" (contiene vocales)
    assertFalse(Ejercicio05.isValidMatriculaES("1234AEI"));
  }

  @Test
  void shouldRejectAnyVowelInLettersTest() {
    // Verifica que rechaza cualquier vocal en la parte de letras
    assertFalse(Ejercicio05.isValidMatriculaES("1234AAB"));
    assertFalse(Ejercicio05.isValidMatriculaES("1234BOU"));
    assertFalse(Ejercicio05.isValidMatriculaES("1234CIE"));
  }

  // ❌ INVÁLIDOS (minúsculas / caracteres no permitidos)

  @Test
  void shouldRejectLowercaseLettersTest() {
    // Verifica que rechaza minúsculas
    assertFalse(Ejercicio05.isValidMatriculaES("1234bcd"));
    assertFalse(Ejercicio05.isValidMatriculaES("0001XyZ"));
  }

  @Test
  void shouldRejectNonAlphanumericTest() {
    // Verifica que rechaza guiones/espacios
    assertFalse(Ejercicio05.isValidMatriculaES("1234-BCD"));
    assertFalse(Ejercicio05.isValidMatriculaES("1234 BCD"));
  }

  // ❌ INVÁLIDOS (null / vacío)

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio05.isValidMatriculaES(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza vacío
    assertFalse(Ejercicio05.isValidMatriculaES(""));
  }
}

