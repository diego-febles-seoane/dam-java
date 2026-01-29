package com.docencia.enumerados.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void debeTenerCuatroOperaciones() {
    assertEquals(4, Operacion.values().length, "Error: Operacion debe tener 4 valores");
  }

  @Test
  void simboloDivisionDebeSerBarra() {
    Calculadora c = new Calculadora();
    assertEquals("/", c.simbolo(Operacion.Division), "Error: el simbolo de Division debe ser /");
  }

  @Test
  void calcularSumaDebeDarCinco() {
    Calculadora c = new Calculadora();
    assertEquals(5.0, c.calcular(Operacion.Suma, 2, 3), 1e-9, "Error: 2 + 3 debe ser 5");
  }

  @Test
  void esConmutativaDebeSerTrueParaMultiplicacion() {
    Calculadora c = new Calculadora();
    assertTrue(c.esConmutativa(Operacion.Multiplicacion), "Error: Multiplicacion debe ser conmutativa");
  }

  @Test
  void divisionEntreCeroDebeLanzarExcepcion() {
    Calculadora c = new Calculadora();
    assertThrows(IllegalArgumentException.class, () -> c.calcular(Operacion.Division, 1, 0),
        "Error: dividir entre cero debe lanzar IllegalArgumentException");
  }
}
