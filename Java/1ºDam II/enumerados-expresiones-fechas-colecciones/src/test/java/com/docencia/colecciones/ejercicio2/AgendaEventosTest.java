package com.docencia.colecciones.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class AgendaEventosTest {

  // ---- agregarSiNoExiste (5 tests) ----
  @Test
  void agregarSiNoExisteDebeAgregarNuevo() {
    AgendaEventos a = new AgendaEventos();
    Set<Evento> s = new HashSet<>();
    assertTrue(a.agregarSiNoExiste(s, new EventoPublico("Charla")), "Error: debe agregar evento nuevo");
  }

  @Test
  void agregarSiNoExisteDebeRechazarDuplicadoMismoTipo() {
    AgendaEventos a = new AgendaEventos();
    Set<Evento> s = new HashSet<>();
    s.add(new EventoPublico("Charla"));
    assertFalse(a.agregarSiNoExiste(s, new EventoPublico("charla")), "Error: no debe agregar duplicado (case-insensitive)");
  }

  @Test
  void agregarSiNoExisteDebePermitirMismoNombreDistintoTipo() {
    AgendaEventos a = new AgendaEventos();
    Set<Evento> s = new HashSet<>();
    s.add(new EventoPublico("Reunion"));
    assertTrue(a.agregarSiNoExiste(s, new EventoPrivado("reunion")),
        "Error: debe permitir mismo nombre si el tipo de clase es distinto");
  }

  @Test
  void agregarSiNoExisteDebeSerFalseConSetNulo() {
    AgendaEventos a = new AgendaEventos();
    assertFalse(a.agregarSiNoExiste(null, new EventoPublico("X")), "Error: set nulo debe devolver false");
  }

  @Test
  void agregarSiNoExisteDebeSerFalseConEventoNulo() {
    AgendaEventos a = new AgendaEventos();
    assertFalse(a.agregarSiNoExiste(new HashSet<>(), null), "Error: evento nulo debe devolver false");
  }

  // ---- nombresUnicos (5 tests) ----
  @Test
  void nombresUnicosDebeDevolverConjuntoEnMinusculas() {
    AgendaEventos a = new AgendaEventos();
    Set<Evento> s = Set.of(new EventoPublico("Java"), new EventoPrivado("JUnit"));
    Set<String> n = a.nombresUnicos(s);
    assertTrue(n.contains("java") && n.contains("junit"), "Error: nombresUnicos debe devolver nombres en minusculas");
  }

  @Test
  void nombresUnicosDebeEliminarDuplicadosPorNombre() {
    AgendaEventos a = new AgendaEventos();
    Set<Evento> s = new HashSet<>();
    s.add(new EventoPublico("Charla"));
    s.add(new EventoPublico("CHARLA"));
    Set<String> n = a.nombresUnicos(s);
    assertEquals(1, n.size(), "Error: debe haber 1 nombre unico si son el mismo nombre");
  }

  @Test
  void nombresUnicosDebeSoportarSetVacio() {
    AgendaEventos a = new AgendaEventos();
    assertEquals(0, a.nombresUnicos(Set.of()).size(), "Error: set vacio debe devolver set vacio");
  }

  @Test
  void nombresUnicosDebeSoportarSetNulo() {
    AgendaEventos a = new AgendaEventos();
    assertEquals(0, a.nombresUnicos(null).size(), "Error: set nulo debe devolver set vacio");
  }

  @Test
  void nombresUnicosDebeContenerNombreDePrivado() {
    AgendaEventos a = new AgendaEventos();
    Set<String> n = a.nombresUnicos(Set.of(new EventoPrivado("Secreto")));
    assertTrue(n.contains("secreto"), "Error: debe contener 'secreto'");
  }
}
