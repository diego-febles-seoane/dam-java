package com.docencia.expresiones.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio01Test {

@Test
  void shouldAcceptValidTime0000Test() {
    // Verifica que acepta "00:00"
    assertTrue(Ejercicio01.isValidHora24h("00:00"));
  }

  @Test
  void shouldAcceptValidTime0705Test() {
    // Verifica que acepta "07:05"
    assertTrue(Ejercicio01.isValidHora24h("07:05"));
  }

  @Test
  void shouldAcceptValidTime1959Test() {
    // Verifica que acepta "19:59"
    assertTrue(Ejercicio01.isValidHora24h("19:59"));
  }

  @Test
  void shouldAcceptValidTime2000Test() {
    // Verifica que acepta "20:00"
    assertTrue(Ejercicio01.isValidHora24h("20:00"));
  }

  @Test
  void shouldAcceptValidTime2359Test() {
    // Verifica que acepta "23:59"
    assertTrue(Ejercicio01.isValidHora24h("23:59"));
  }

  // INVALIDOS (rango hora)

  @Test
  void shouldRejectHourOutOfRange2400Test() {
    // Verifica que rechaza hora fuera de rango: "24:00"
    assertFalse(Ejercicio01.isValidHora24h("24:00"));
  }

  @Test
  void shouldRejectHourOutOfRange9999Test() {
    // Verifica que rechaza hora fuera de rango: "99:99"
    assertFalse(Ejercicio01.isValidHora24h("99:99"));
  }

  // INVÁLIDOS (rango minutos)

  @Test
  void shouldRejectMinutesOutOfRange1260Test() {
    // Verifica que rechaza minutos fuera de rango: "12:60"
    assertFalse(Ejercicio01.isValidHora24h("12:60"));
  }

  @Test
  void shouldRejectMinutesOutOfRange1299Test() {
    // Verifica que rechaza minutos fuera de rango: "12:99"
    assertFalse(Ejercicio01.isValidHora24h("12:99"));
  }


  @Test
  void shouldRejectInvalidFormatSingleDigitHour705Test() {
    // Verifica que rechaza formato con hora de 1 dígito: "7:05"
    assertFalse(Ejercicio01.isValidHora24h("7:05"));
  }

  @Test
  void shouldRejectInvalidFormatSingleDigitMinute075Test() {
    // Verifica que rechaza formato con minuto de 1 digito: "07:5"
    assertFalse(Ejercicio01.isValidHora24h("07:5"));
  }

  @Test
  void shouldRejectInvalidSeparator07_5WithDashTest() {
    // Verifica que rechaza separador incorrecto: "07-05"
    assertFalse(Ejercicio01.isValidHora24h("07-05"));
  }

  @Test
  void shouldRejectNonNumericTimeAaBbTest() {
    // Verifica que rechaza letras: "aa:bb"
    assertFalse(Ejercicio01.isValidHora24h("aa:bb"));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza string vacío
    assertFalse(Ejercicio01.isValidHora24h(""));
  }


  @Test
  void shouldRejectLeadingSpaceTest() {
    // Verifica que rechaza espacio al inicio: " 07:05"
    assertFalse(Ejercicio01.isValidHora24h(" 07:05"));
  }

  @Test
  void shouldRejectTrailingSpaceTest() {
    // Verifica que rechaza espacio al final: "07:05 "
    assertFalse(Ejercicio01.isValidHora24h("07:05 "));
  }

  @Test
  void shouldRejectSpaceInsideTest() {
    // Verifica que rechaza espacio dentro: "07 :05"
    assertFalse(Ejercicio01.isValidHora24h("07 :05"));
  }


  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio01.isValidHora24h(null));
  }
}

