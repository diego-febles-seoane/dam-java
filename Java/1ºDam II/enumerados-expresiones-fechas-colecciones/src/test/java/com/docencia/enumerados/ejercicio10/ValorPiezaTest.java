package com.docencia.enumerados.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValorPiezaTest {

  @Test
  void debeTenerSeisPiezas() {
    assertEquals(6, PiezaAjedrez.values().length, "Error: PiezaAjedrez debe tener 6 valores");
  }

  @Test
  void esPiezaMayorDebeSerTrueParaReina() {
    ValorPieza v = new ValorPieza();
    assertTrue(v.esPiezaMayor(PiezaAjedrez.Reina), "Error: Reina debe ser pieza mayor");
  }

  @Test
  void obtenerValorTorreDebeSerCinco() {
    ValorPieza v = new ValorPieza();
    assertEquals(5, v.obtenerValor(PiezaAjedrez.Torre), "Error: Torre debe valer 5");
  }

  @Test
  void materialTotalDebeSumarValores() {
    ValorPieza v = new ValorPieza();
    PiezaAjedrez[] piezas = new PiezaAjedrez[] { PiezaAjedrez.Reina, PiezaAjedrez.Torre, PiezaAjedrez.Peon };
    assertEquals(15, v.materialTotal(piezas), "Error: 9 + 5 + 1 debe sumar 15");
  }

  @Test
  void debeContenerCaballo() {
    assertEquals(PiezaAjedrez.Caballo, PiezaAjedrez.valueOf("Caballo"), "Error: falta Caballo en PiezaAjedrez");
  }
}
