package com.docencia.expresiones.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

  // ✅ VÁLIDOS

  @Test
  void shouldAcceptValidCp01001Test() {
    // Verifica que acepta "01001"
    assertTrue(Ejercicio04.isValidCodigoPostalES("01001"));
  }

  @Test
  void shouldAcceptValidCp28013Test() {
    // Verifica que acepta "28013"
    assertTrue(Ejercicio04.isValidCodigoPostalES("28013"));
  }

  @Test
  void shouldAcceptValidCp52001Test() {
    // Verifica que acepta "52001"
    assertTrue(Ejercicio04.isValidCodigoPostalES("52001"));
  }

  @Test
  void shouldAcceptLowerProvinceBound01Test() {
    // Verifica límite inferior de provincia: 01
    assertTrue(Ejercicio04.isValidCodigoPostalES("01000"));
  }

  @Test
  void shouldAcceptUpperProvinceBound52Test() {
    // Verifica límite superior de provincia: 52
    assertTrue(Ejercicio04.isValidCodigoPostalES("52999"));
  }

  // ❌ INVÁLIDOS (provincia fuera de rango)

  @Test
  void shouldRejectProvince00Test() {
    // Verifica que rechaza provincia 00
    assertFalse(Ejercicio04.isValidCodigoPostalES("00000"));
  }

  @Test
  void shouldRejectProvince53Test() {
    // Verifica que rechaza provincia 53
    assertFalse(Ejercicio04.isValidCodigoPostalES("53000"));
  }

  // ❌ INVÁLIDOS (longitud / formato)

  @Test
  void shouldRejectTooShort1234Test() {
    // Verifica que rechaza longitud 4: "1234"
    assertFalse(Ejercicio04.isValidCodigoPostalES("1234"));
  }

  @Test
  void shouldRejectNonNumericABCDETest() {
    // Verifica que rechaza letras: "ABCDE"
    assertFalse(Ejercicio04.isValidCodigoPostalES("ABCDE"));
  }

  @Test
  void shouldRejectContainsLettersTest() {
    // Verifica que rechaza mezcla de números y letras
    assertFalse(Ejercicio04.isValidCodigoPostalES("28A13"));
  }

  @Test
  void shouldRejectWithSeparatorTest() {
    // Verifica que rechaza separadores
    assertFalse(Ejercicio04.isValidCodigoPostalES("28-013"));
  }

  // ❌ INVÁLIDOS (espacios)

  @Test
  void shouldRejectLeadingOrTrailingSpacesTest() {
    // Verifica que rechaza espacios al inicio/fin
    assertFalse(Ejercicio04.isValidCodigoPostalES(" 28013"));
    assertFalse(Ejercicio04.isValidCodigoPostalES("28013 "));
  }

  // ❌ INVÁLIDOS (null / vacío)

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio04.isValidCodigoPostalES(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza vacío
    assertFalse(Ejercicio04.isValidCodigoPostalES(""));
  }
}

