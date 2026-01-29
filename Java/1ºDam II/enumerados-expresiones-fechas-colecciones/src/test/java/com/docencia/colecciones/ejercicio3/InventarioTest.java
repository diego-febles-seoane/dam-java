package com.docencia.colecciones.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class InventarioTest {

  // ---- indexarPorSku (5 tests) ----
  @Test
  void indexarPorSkuDebeCrearMapa() {
    Inventario i = new Inventario();
    Map<String, Producto> m = i.indexarPorSku(List.of(new ProductoDigital("A",10)));
    assertEquals(1, m.size(), "Error: debe crear mapa con 1 entrada");
  }

  @Test
  void indexarPorSkuDebeAccederPorClave() {
    Inventario i = new Inventario();
    Producto p = new ProductoDigital("SKU1",10);
    Map<String, Producto> m = i.indexarPorSku(List.of(p));
    assertSame(p, m.get("SKU1"), "Error: debe devolver el mismo objeto por su sku");
  }

  @Test
  void indexarPorSkuDebeSobrescribirSiDuplicado() {
    Inventario i = new Inventario();
    Producto p1 = new ProductoDigital("X",10);
    Producto p2 = new ProductoDigital("X",20);
    Map<String, Producto> m = i.indexarPorSku(List.of(p1,p2));
    assertSame(p2, m.get("X"), "Error: el ultimo con el mismo sku debe sobrescribir");
  }

  @Test
  void indexarPorSkuDebeDevolverVacioSiListaVacia() {
    Inventario i = new Inventario();
    assertEquals(0, i.indexarPorSku(List.of()).size(), "Error: lista vacia debe devolver mapa vacio");
  }

  @Test
  void indexarPorSkuDebeSoportarListaNula() {
    Inventario i = new Inventario();
    assertEquals(0, i.indexarPorSku(null).size(), "Error: lista nula debe devolver mapa vacio");
  }

  // ---- skusDuplicados (5 tests) ----
  @Test
  void skusDuplicadosDebeDetectarUno() {
    Inventario i = new Inventario();
    Set<String> d = i.skusDuplicados(List.of(new ProductoDigital("A",1), new ProductoDigital("A",2)));
    assertEquals(Set.of("A"), d, "Error: debe detectar sku duplicado A");
  }

  @Test
  void skusDuplicadosDebeDevolverVacioSiNoHay() {
    Inventario i = new Inventario();
    assertEquals(0, i.skusDuplicados(List.of(new ProductoDigital("A",1), new ProductoDigital("B",2))).size(),
        "Error: sin duplicados debe devolver set vacio");
  }

  @Test
  void skusDuplicadosDebeDetectarVarios() {
    Inventario i = new Inventario();
    Set<String> d = i.skusDuplicados(List.of(
        new ProductoDigital("A",1), new ProductoDigital("A",2),
        new ProductoPerecedero("B", LocalDate.of(2026,1,1)), new ProductoPerecedero("B", LocalDate.of(2026,2,1))
    ));
    assertTrue(d.contains("A") && d.contains("B"), "Error: debe detectar duplicados A y B");
  }

  @Test
  void skusDuplicadosDebeSoportarListaVacia() {
    Inventario i = new Inventario();
    assertEquals(0, i.skusDuplicados(List.of()).size(), "Error: lista vacia debe devolver set vacio");
  }

  @Test
  void skusDuplicadosDebeSoportarListaNula() {
    Inventario i = new Inventario();
    assertEquals(0, i.skusDuplicados(null).size(), "Error: lista nula debe devolver set vacio");
  }
}
