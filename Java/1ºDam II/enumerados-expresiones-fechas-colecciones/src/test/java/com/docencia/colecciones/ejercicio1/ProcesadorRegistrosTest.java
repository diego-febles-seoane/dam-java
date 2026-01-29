package com.docencia.colecciones.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class ProcesadorRegistrosTest {

  // ---- filtrarPorTipo (5 tests) ----
  @Test
  void filtrarPorTipoDebeDevolverSoloTexto() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    List<Registro> in = List.of(new RegistroTexto("a","x"), new RegistroNumero("b",1), new RegistroTexto("c","y"));
    List<Registro> out = p.filtrarPorTipo(in, "Texto");
    assertEquals(2, out.size(), "Error: debe devolver 2 registros de tipo Texto");
  }

  @Test
  void filtrarPorTipoDebeIgnorarMayusculas() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    List<Registro> in = List.of(new RegistroTexto("a","x"));
    assertEquals(1, p.filtrarPorTipo(in, "tExTo").size(), "Error: debe comparar tipo sin importar mayusculas");
  }

  @Test
  void filtrarPorTipoDebeDevolverVacioSiNoHayCoincidencias() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    List<Registro> in = List.of(new RegistroNumero("b",1));
    assertEquals(0, p.filtrarPorTipo(in, "Texto").size(), "Error: debe devolver lista vacia si no hay coincidencias");
  }

  @Test
  void filtrarPorTipoDebeSoportarListaNula() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    assertEquals(0, p.filtrarPorTipo(null, "Texto").size(), "Error: lista nula debe devolver lista vacia");
  }

  @Test
  void filtrarPorTipoDebeSoportarTipoNulo() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    assertEquals(0, p.filtrarPorTipo(List.of(new RegistroTexto("a","x")), null).size(),
        "Error: tipo nulo debe devolver lista vacia");
  }

  // ---- sumarNumeros (5 tests) ----
  @Test
  void sumarNumerosDebeSumarSoloNumeros() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    List<Registro> in = List.of(new RegistroNumero("a",2), new RegistroTexto("b","x"), new RegistroNumero("c",3));
    assertEquals(5, p.sumarNumeros(in), "Error: debe sumar 2 + 3 = 5");
  }

  @Test
  void sumarNumerosDebeDevolverCeroSiNoHayNumeros() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    assertEquals(0, p.sumarNumeros(List.of(new RegistroTexto("a","x"))), "Error: sin numeros debe devolver 0");
  }

  @Test
  void sumarNumerosDebeAceptarNegativos() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    assertEquals(-1, p.sumarNumeros(List.of(new RegistroNumero("a",-2), new RegistroNumero("b",1))),
        "Error: -2 + 1 = -1");
  }

  @Test
  void sumarNumerosDebeDevolverCeroSiListaVacia() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    assertEquals(0, p.sumarNumeros(List.of()), "Error: lista vacia debe devolver 0");
  }

  @Test
  void sumarNumerosDebeSoportarListaNula() {
    ProcesadorRegistros p = new ProcesadorRegistros();
    assertEquals(0, p.sumarNumeros(null), "Error: lista nula debe devolver 0");
  }
}
