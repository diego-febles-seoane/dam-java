package com.docencia.expresiones.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio08Test {

  // ✅ VÁLIDOS

  @Test
  void shouldAcceptValidIp0_0_0_0Test() {
    // Verifica que acepta "0.0.0.0"
    assertTrue(Ejercicio08.isValidIPv4("0.0.0.0"));
  }

  @Test
  void shouldAcceptValidIp255_255_255_255Test() {
    // Verifica que acepta "255.255.255.255"
    assertTrue(Ejercicio08.isValidIPv4("255.255.255.255"));
  }

  @Test
  void shouldAcceptValidIp192_168_1_10Test() {
    // Verifica que acepta "192.168.1.10"
    assertTrue(Ejercicio08.isValidIPv4("192.168.1.10"));
  }

  @Test
  void shouldAcceptValidBoundaryValuesTest() {
    // Verifica límites de octetos
    assertTrue(Ejercicio08.isValidIPv4("1.2.3.4"));
    assertTrue(Ejercicio08.isValidIPv4("10.0.0.1"));
    assertTrue(Ejercicio08.isValidIPv4("249.250.251.252"));
  }

  // ❌ INVÁLIDOS (rango octeto)

  @Test
  void shouldRejectOctetOutOfRange256Test() {
    // Verifica que rechaza octeto 256
    assertFalse(Ejercicio08.isValidIPv4("256.0.0.1"));
  }

  @Test
  void shouldRejectOctetOutOfRange999Test() {
    // Verifica que rechaza octeto 999
    assertFalse(Ejercicio08.isValidIPv4("999.1.1.1"));
  }

  // ❌ INVÁLIDOS (número de partes)

  @Test
  void shouldRejectMissingOctetTest() {
    // Verifica que rechaza "192.168.1" (faltan partes)
    assertFalse(Ejercicio08.isValidIPv4("192.168.1"));
  }

  @Test
  void shouldRejectTooManyOctetsTest() {
    // Verifica que rechaza "1.2.3.4.5" (sobran partes)
    assertFalse(Ejercicio08.isValidIPv4("1.2.3.4.5"));
  }

  // ❌ INVÁLIDOS (ceros a la izquierda)

  @Test
  void shouldRejectLeadingZeroInOctetTest() {
    // Verifica que rechaza "192.168.01.1" (01 no permitido)
    assertFalse(Ejercicio08.isValidIPv4("192.168.01.1"));
  }

  @Test
  void shouldRejectMultipleLeadingZerosTest() {
    // Verifica que rechaza "001.2.3.4"
    assertFalse(Ejercicio08.isValidIPv4("001.2.3.4"));
  }

  // ❌ INVÁLIDOS (formato)

  @Test
  void shouldRejectNonNumericTest() {
    // Verifica que rechaza letras
    assertFalse(Ejercicio08.isValidIPv4("a.b.c.d"));
  }

  @Test
  void shouldRejectTrailingDotTest() {
    // Verifica que rechaza punto final
    assertFalse(Ejercicio08.isValidIPv4("1.2.3.4."));
  }

  @Test
  void shouldRejectSpacesTest() {
    // Verifica que rechaza espacios
    assertFalse(Ejercicio08.isValidIPv4(" 1.2.3.4"));
    assertFalse(Ejercicio08.isValidIPv4("1.2.3.4 "));
    assertFalse(Ejercicio08.isValidIPv4("1.2. 3.4"));
  }

  // null / vacío

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio08.isValidIPv4(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza vacío
    assertFalse(Ejercicio08.isValidIPv4(""));
  }
}

