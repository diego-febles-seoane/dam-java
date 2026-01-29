package com.docencia.enumerados.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AplicadorDescuentoTest {

  @Test
  void debeTenerCuatroTipos() {
    assertEquals(4, TipoDescuento.values().length, "Error: TipoDescuento debe tener 4 valores");
  }

  @Test
  void porcentajeMitadDebeSerCincuenta() {
    AplicadorDescuento a = new AplicadorDescuento();
    assertEquals(50, a.porcentaje(TipoDescuento.Mitad), "Error: Mitad debe ser 50 porciento");
  }

  @Test
  void esDescuentoDebeSerFalseParaNinguno() {
    AplicadorDescuento a = new AplicadorDescuento();
    assertFalse(a.esDescuento(TipoDescuento.Ninguno), "Error: Ninguno no debe ser descuento");
  }

  @Test
  void aplicarDiezPorcientoASienDebeSerNoventa() {
    AplicadorDescuento a = new AplicadorDescuento();
    assertEquals(90, a.aplicar(TipoDescuento.DiezPorciento, 100), "Error: 10 porciento de 100 debe ser 90");
  }

  @Test
  void debeContenerVeintePorciento() {
    assertEquals(TipoDescuento.VeintePorciento, TipoDescuento.valueOf("VeintePorciento"),
        "Error: falta VeintePorciento en TipoDescuento");
  }
}
