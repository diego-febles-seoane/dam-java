package com.docencia.expresionesregulares.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class RegexHashtagsTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexHashtags.patron(), "Error: el patron no debe ser nulo");
  }

  @Test
  void debeExtraerDosHashtags() {
    List<String> tags = RegexHashtags.extraer("Hoy #java y #JUnit_5");
    assertEquals(2, tags.size(), "Error: deben extraerse 2 hashtags");
  }

  @Test
  void debeExtraerSinAlmohadilla() {
    List<String> tags = RegexHashtags.extraer("Prueba #java");
    assertEquals("java", tags.get(0), "Error: debe devolver 'java' sin #");
  }

  @Test
  void contieneDebeSerTrueParaTag() {
    assertTrue(RegexHashtags.contiene("Hola #Java", "java"), "Error: debe detectar tag java sin importar mayusculas");
  }

  @Test
  void contieneDebeSerFalseSiNoExiste() {
    assertFalse(RegexHashtags.contiene("Hola #Java", "spring"), "Error: no debe detectar tag inexistente");
  }
}
