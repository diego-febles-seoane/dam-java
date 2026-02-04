package com.docencia.expresiones.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio9Test {

  // ✅ VÁLIDOS

  @Test
  void shouldAcceptValidIsoWithZTest() {
    // Verifica que acepta con Z
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59Z"));
  }

  @Test
  void shouldAcceptValidIsoWithMillisAndOffsetTest() {
    // Verifica que acepta milisegundos y offset
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-01-02T03:04:05.123+02:00"));
  }

  @Test
  void shouldAcceptValidIsoWith1DigitMillisAndNegativeOffsetTest() {
    // Verifica milisegundos 1 dígito y offset negativo
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59.9-03:30"));
  }

  @Test
  void shouldAcceptValidIsoWithoutMillisWithPositiveOffsetTest() {
    // Verifica sin milisegundos con offset positivo
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-06-10T00:00:00+00:00"));
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-06-10T12:30:45+05:30"));
  }

  @Test
  void shouldAcceptBoundaryTimesAndOffsetsTest() {
    // Verifica límites: hora 00 y 23, offset 00 y 23
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-01-01T00:00:00Z"));
    assertTrue(Ejercicio09.isValidIsoDateTimeWithZone("2025-01-01T23:59:59+23:59"));
  }

  // ❌ INVÁLIDOS (sin 'T' / separador incorrecto)

  @Test
  void shouldRejectSpaceInsteadOfTTest() {
    // Verifica que rechaza "YYYY-MM-DD HH:MM:SSZ" (espacio)
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31 23:59:59Z"));
  }

  // ❌ INVÁLIDOS (zona obligatoria)

  @Test
  void shouldRejectMissingZoneTest() {
    // Verifica que rechaza sin zona
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59"));
  }

  // ❌ INVÁLIDOS (offset mal formado)

  @Test
  void shouldRejectOffsetWithoutLeadingZeroTest() {
    // Verifica que rechaza "+2:00" (debe ser +02:00)
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59+2:00"));
  }

  @Test
  void shouldRejectOffsetOutOfRangeTest() {
    // Verifica offset fuera de rango
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59+24:00"));
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59+23:60"));
  }

  // ❌ INVÁLIDOS (hora/min/seg fuera de rango)

  @Test
  void shouldRejectTimeOutOfRangeTest() {
    // Verifica hora 24 inválida
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T24:00:00Z"));
    // Verifica minuto 60 inválido
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:60:00Z"));
    // Verifica segundo 60 inválido
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:60Z"));
  }

  // ❌ INVÁLIDOS (milisegundos)

  @Test
  void shouldRejectTooManyMillisDigitsTest() {
    // Verifica que rechaza más de 3 dígitos
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59.1234Z"));
  }

  @Test
  void shouldRejectDotWithoutMillisDigitsTest() {
    // Verifica que rechaza punto sin dígitos
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59.Z"));
  }

  // ❌ INVÁLIDOS (fecha rango básico)

  @Test
  void shouldRejectMonthOrDayOutOfRangeTest() {
    // Verifica mes 13 inválido
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-13-01T00:00:00Z"));
    // Verifica día 00 inválido
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-01-00T00:00:00Z"));
  }

  // null / vacío

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza vacío
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone(""));
  }

  @Test
  void shouldRejectLeadingOrTrailingSpacesTest() {
    // Verifica que rechaza espacios al inicio/fin
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone(" 2025-12-31T23:59:59Z"));
    assertFalse(Ejercicio09.isValidIsoDateTimeWithZone("2025-12-31T23:59:59Z "));
  }
}

