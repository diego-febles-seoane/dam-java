package com.docencia.colecciones.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class NominaTest {

  // ---- calcularPagoTotal (5 tests) ----
  @Test
  void calcularPagoTotalDebeSumarPagos() {
    Nomina n = new Nomina();
    double t = n.calcularPagoTotal(List.of(new EmpleadoFijo("a",1000), new EmpleadoPorHoras("b",10,10)));
    assertEquals(1100.0, t, 1e-9, "Error: debe sumar 1000 + 100");
  }

  @Test
  void calcularPagoTotalDebeDevolverCeroSiListaVacia() {
    Nomina n = new Nomina();
    assertEquals(0.0, n.calcularPagoTotal(List.of()), 1e-9, "Error: lista vacia debe devolver 0");
  }

  @Test
  void calcularPagoTotalDebeSoportarListaNula() {
    Nomina n = new Nomina();
    assertEquals(0.0, n.calcularPagoTotal(null), 1e-9, "Error: lista nula debe devolver 0");
  }

  @Test
  void calcularPagoTotalDebeSoportarCeros() {
    Nomina n = new Nomina();
    assertEquals(0.0, n.calcularPagoTotal(List.of(new EmpleadoPorHoras("a",0,10))), 1e-9,
        "Error: tarifa 0 debe dar total 0");
  }

  @Test
  void calcularPagoTotalDebeManejarDecimales() {
    Nomina n = new Nomina();
    assertEquals(1050.5, n.calcularPagoTotal(List.of(new EmpleadoFijo("a",1000.25), new EmpleadoFijo("b",50.25))),
        1e-9, "Error: debe sumar decimales correctamente");
  }

  // ---- agruparPorTipo (5 tests) ----
  @Test
  void agruparPorTipoDebeCrearDosGrupos() {
    Nomina n = new Nomina();
    Map<String, List<Empleado>> g = n.agruparPorTipo(List.of(new EmpleadoFijo("a",1), new EmpleadoPorHoras("b",1,1)));
    assertEquals(2, g.size(), "Error: debe crear 2 grupos (Fijo y Horas)");
  }

  @Test
  void agruparPorTipoDebeContenerClaveFijo() {
    Nomina n = new Nomina();
    Map<String, List<Empleado>> g = n.agruparPorTipo(List.of(new EmpleadoFijo("a",1)));
    assertTrue(g.containsKey("Fijo"), "Error: debe contener clave 'Fijo'");
  }

  @Test
  void agruparPorTipoDebeContenerClaveHoras() {
    Nomina n = new Nomina();
    Map<String, List<Empleado>> g = n.agruparPorTipo(List.of(new EmpleadoPorHoras("b",1,1)));
    assertTrue(g.containsKey("Horas"), "Error: debe contener clave 'Horas'");
  }

  @Test
  void agruparPorTipoDebeAgruparMultiples() {
    Nomina n = new Nomina();
    Map<String, List<Empleado>> g = n.agruparPorTipo(List.of(new EmpleadoFijo("a",1), new EmpleadoFijo("b",2)));
    assertEquals(2, g.get("Fijo").size(), "Error: debe haber 2 empleados en grupo Fijo");
  }

  @Test
  void agruparPorTipoDebeSoportarListaNula() {
    Nomina n = new Nomina();
    assertEquals(0, n.agruparPorTipo(null).size(), "Error: lista nula debe devolver mapa vacio");
  }
}
