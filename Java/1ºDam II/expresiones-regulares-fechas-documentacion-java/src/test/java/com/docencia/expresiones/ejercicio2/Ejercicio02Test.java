package com.docencia.expresiones.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio02Test {

  // VALIDOS

  @Test
  void shouldAcceptValidDate2025_01_09Test() {
    // Verifica que acepta "2025-01-09"
    assertTrue(Ejercicio02.isValidDateFormat("2025-01-09"));
  }

  @Test
  void shouldAcceptValidDate1999_12_31Test() {
    // Verifica que acepta "1999-12-31"
    assertTrue(Ejercicio02.isValidDateFormat("1999-12-31"));
  }

  @Test
  void shouldAcceptValidLowerBoundsTest() {
    // Verifica límites inferiores: mes=01, día=01
    assertTrue(Ejercicio02.isValidDateFormat("0000-01-01"));
  }

  @Test
  void shouldAcceptValidUpperBoundsTest() {
    // Verifica límites superiores: mes=12, día=31
    assertTrue(Ejercicio02.isValidDateFormat("9999-12-31"));
  }


  @Test
  void shouldRejectInvalidFormatSingleDigitMonthTest() {
    // Verifica que rechaza mes con 1 dígito: "2025-1-09"
    assertFalse(Ejercicio02.isValidDateFormat("2025-1-09"));
  }

  @Test
  void shouldRejectInvalidFormatSingleDigitDayTest() {
    // Verifica que rechaza día con 1 dígito: "2025-01-9"
    assertFalse(Ejercicio02.isValidDateFormat("2025-01-9"));
  }

  @Test
  void shouldRejectInvalidSeparatorTest() {
    // Verifica que rechaza separador incorrecto
    assertFalse(Ejercicio02.isValidDateFormat("2025/01/09"));
  }

  @Test
  void shouldRejectNonNumericTest() {
    // Verifica que rechaza no numérico
    assertFalse(Ejercicio02.isValidDateFormat("abcd-ef-gh"));
  }

  @Test
  void shouldRejectMissingPartsTest() {
    // Verifica que rechaza partes faltantes
    assertFalse(Ejercicio02.isValidDateFormat("2025-01"));
    assertFalse(Ejercicio02.isValidDateFormat("2025-01-09-00"));
  }


  @Test
  void shouldRejectMonthOutOfRange13Test() {
    // Verifica que rechaza mes 13
    assertFalse(Ejercicio02.isValidDateFormat("2025-13-01"));
  }

  @Test
  void shouldRejectMonthOutOfRange00Test() {
    // Verifica que rechaza mes 00
    assertFalse(Ejercicio02.isValidDateFormat("2025-00-10"));
  }


  @Test
  void shouldRejectDayOutOfRange00Test() {
    // Verifica que rechaza día 00
    assertFalse(Ejercicio02.isValidDateFormat("2025-01-00"));
  }

  @Test
  void shouldRejectDayOutOfRange32Test() {
    // Verifica que rechaza día 32 (aunque no validemos calendario real, sí el rango 01-31)
    assertFalse(Ejercicio02.isValidDateFormat("2025-01-32"));
  }


  @Test
  void shouldRejectLeadingOrTrailingSpacesTest() {
    // Verifica que rechaza espacios
    assertFalse(Ejercicio02.isValidDateFormat(" 2025-01-09"));
    assertFalse(Ejercicio02.isValidDateFormat("2025-01-09 "));
    assertFalse(Ejercicio02.isValidDateFormat("2025-01 -09"));
  }


  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio02.isValidDateFormat(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza vacío
    assertFalse(Ejercicio02.isValidDateFormat(""));
  }
}

