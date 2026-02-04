package com.docencia.expresiones.ejercicio3;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio03Test {

  // ✅ VÁLIDOS

  @Test
  void shouldAcceptValidEmailAAtBDotComTest() {
    // Verifica que acepta "a@b.com"
    assertTrue(Ejercicio03.isValidEmail("a@b.com"));
  }

  @Test
  void shouldAcceptValidEmailWithDotsAndPlusTest() {
    // Verifica que acepta "user.name+tag@sub.domain.es"
    assertTrue(Ejercicio03.isValidEmail("user.name+tag@sub.domain.es"));
  }

  //  INVÁLIDOS (doble @)

  @Test
  void shouldRejectDoubleAtTest() {
    // Verifica que rechaza "a@@b.com"
    assertFalse(Ejercicio03.isValidEmail("a@@b.com"));
  }

  // ❌ INVÁLIDOS (sin punto en dominio)

  @Test
  void shouldRejectDomainWithoutDotTest() {
    // Verifica que rechaza "a@b"
    assertFalse(Ejercicio03.isValidEmail("a@b"));
  }

  // ❌ INVÁLIDOS (con espacios)

  @Test
  void shouldRejectEmailWithSpacesTest() {
    // Verifica que rechaza "a b@c.com"
    assertFalse(Ejercicio03.isValidEmail("a b@c.com"));
  }

  // ❌ INVÁLIDOS (local vacío)

  @Test
  void shouldRejectEmptyLocalPartTest() {
    // Verifica que rechaza "@b.com"
    assertFalse(Ejercicio03.isValidEmail("@b.com"));
  }

  // ❌ INVÁLIDOS (dominio empieza con punto)

  @Test
  void shouldRejectDomainStartingWithDotTest() {
    // Verifica que rechaza "a@.com"
    assertFalse(Ejercicio03.isValidEmail("a@.com"));
  }

  // ❌ INVÁLIDOS (doble punto)

  @Test
  void shouldRejectDoubleDotTest() {
    // Verifica que rechaza "a@b..com"
    assertFalse(Ejercicio03.isValidEmail("a@b..com"));
  }

  // ❌ INVÁLIDOS (espacios al inicio/fin)

  @Test
  void shouldRejectLeadingOrTrailingSpacesTest() {
    // Verifica que rechaza espacios al inicio/fin
    assertFalse(Ejercicio03.isValidEmail(" a@b.com"));
    assertFalse(Ejercicio03.isValidEmail("a@b.com "));
  }

  // ❌ INVÁLIDOS (null / vacío)

  @Test
  void shouldRejectNullTest() {
    // Verifica que rechaza null
    assertFalse(Ejercicio03.isValidEmail(null));
  }

  @Test
  void shouldRejectEmptyStringTest() {
    // Verifica que rechaza string vacío
    assertFalse(Ejercicio03.isValidEmail(""));
  }
}

