package com.docencia.expresiones.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio06Test {

  // ✅ VÁLIDOS

  @Test
  void shouldDetectRepeatedWordHolaHolaTest() {
    // Verifica que detecta "hola hola"
    assertTrue(Ejercicio06.hasConsecutiveRepeatedWord("hola hola"));
  }

  @Test
  void shouldDetectRepeatedWordQueQueTest() {
    // Verifica que detecta "qué qué" (acentos)
    assertTrue(Ejercicio06.hasConsecutiveRepeatedWord("qué qué"));
  }

  @Test
  void shouldDetectRepeatedWordTestTest() {
    // Verifica que detecta "test test"
    assertTrue(Ejercicio06.hasConsecutiveRepeatedWord("test test"));
  }

  @Test
  void shouldDetectRepeatedWordInsideSentenceTest() {
    // Verifica que detecta repetición dentro de una frase
    assertTrue(Ejercicio06.hasConsecutiveRepeatedWord("esto es muy muy importante"));
  }

  @Test
  void shouldDetectWithMultipleSpacesBetweenWordsTest() {
    // Verifica que detecta con múltiples espacios
    assertTrue(Ejercicio06.hasConsecutiveRepeatedWord("hola     hola"));
  }

  // ❌ INVÁLIDOS

  @Test
  void shouldRejectNonConsecutiveRepetitionHolaAdiosHolaTest() {
    // Verifica que NO detecta si no es consecutiva: "hola adiós hola"
    assertFalse(Ejercicio06.hasConsecutiveRepeatedWord("hola adiós hola"));
  }

  @Test
  void shouldRejectConcatenatedHolaholaTest() {
    // Verifica que NO detecta si está pegado: "holahola"
    assertFalse(Ejercicio06.hasConsecutiveRepeatedWord("holahola"));
  }

  @Test
  void shouldRejectNoRepetitionHolaAdiosTest() {
    // Verifica que NO detecta si no hay repetición
    assertFalse(Ejercicio06.hasConsecutiveRepeatedWord("hola  adiós"));
  }

  // (Extra) Sensibilidad a mayúsculas:
  // Con (?iu) lo hacemos case-insensitive y unicode-aware.
  @Test
  void shouldDetectRepeatedWordIgnoringCaseTest() {
    // Verifica que detecta ignorando mayúsculas/minúsculas
    assertTrue(Ejercicio06.hasConsecutiveRepeatedWord("Hola hola"));
  }

  // null / vacío

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio06.hasConsecutiveRepeatedWord(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que no detecta en vacío
    assertFalse(Ejercicio06.hasConsecutiveRepeatedWord(""));
  }
}

