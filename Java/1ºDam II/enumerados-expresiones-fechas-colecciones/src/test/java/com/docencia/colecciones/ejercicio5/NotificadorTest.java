package com.docencia.colecciones.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class NotificadorTest {

  // ---- contarPorCanal (5 tests) ----
  @Test
  void contarPorCanalDebeContarEmailYSms() {
    Notificador n = new Notificador();
    Map<String,Integer> m = n.contarPorCanal(List.of(new MensajeEmail("a@a.com"), new MensajeSms("600")));
    assertEquals(1, m.get("email"), "Error: debe contar 1 email");
    assertEquals(1, m.get("sms"), "Error: debe contar 1 sms");
  }

  @Test
  void contarPorCanalDebeContarMultiples() {
    Notificador n = new Notificador();
    Map<String,Integer> m = n.contarPorCanal(List.of(new MensajeEmail("a@a.com"), new MensajeEmail("b@b.com")));
    assertEquals(2, m.get("email"), "Error: debe contar 2 emails");
  }

  @Test
  void contarPorCanalDebeDevolverVacioSiListaVacia() {
    Notificador n = new Notificador();
    assertEquals(0, n.contarPorCanal(List.of()).size(), "Error: lista vacia debe devolver mapa vacio");
  }

  @Test
  void contarPorCanalDebeSoportarListaNula() {
    Notificador n = new Notificador();
    assertEquals(0, n.contarPorCanal(null).size(), "Error: lista nula debe devolver mapa vacio");
  }

  @Test
  void contarPorCanalDebeIncluirClaveSmsSiHaySms() {
    Notificador n = new Notificador();
    Map<String,Integer> m = n.contarPorCanal(List.of(new MensajeSms("600")));
    assertTrue(m.containsKey("sms"), "Error: debe incluir clave sms");
  }

  // ---- destinosUnicos (5 tests) ----
  @Test
  void destinosUnicosDebeEliminarDuplicados() {
    Notificador n = new Notificador();
    Set<String> s = n.destinosUnicos(List.of(new MensajeSms("600"), new MensajeSms("600")));
    assertEquals(1, s.size(), "Error: destinosUnicos debe eliminar duplicados");
  }

  @Test
  void destinosUnicosDebeIncluirEmail() {
    Notificador n = new Notificador();
    Set<String> s = n.destinosUnicos(List.of(new MensajeEmail("a@a.com")));
    assertTrue(s.contains("a@a.com"), "Error: debe contener el email");
  }

  @Test
  void destinosUnicosDebeIncluirSms() {
    Notificador n = new Notificador();
    Set<String> s = n.destinosUnicos(List.of(new MensajeSms("600")));
    assertTrue(s.contains("600"), "Error: debe contener el numero sms");
  }

  @Test
  void destinosUnicosDebeSoportarListaVacia() {
    Notificador n = new Notificador();
    assertEquals(0, n.destinosUnicos(List.of()).size(), "Error: lista vacia debe devolver set vacio");
  }

  @Test
  void destinosUnicosDebeSoportarListaNula() {
    Notificador n = new Notificador();
    assertEquals(0, n.destinosUnicos(null).size(), "Error: lista nula debe devolver set vacio");
  }
}
