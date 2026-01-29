package com.docencia.fechas.ejercicio18;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class FechasLaborables18Test {

  @Test
  void esLaborableDebeSerTrueEnLunes() {
    assertTrue(FechasLaborables18.esLaborable(LocalDate.of(2026,1,26)), "Error: lunes debe ser laborable");
  }

  @Test
  void esLaborableDebeSerFalseEnDomingo() {
    assertFalse(FechasLaborables18.esLaborable(LocalDate.of(2026,2,1)), "Error: domingo no es laborable");
  }

  @Test
  void sumarDiasLaborablesDebeSaltarFinDeSemana() {
    // viernes 30/01/2026 + 1 laborable => lunes 02/02/2026
    LocalDate d = LocalDate.of(2026,1,30);
    assertEquals(LocalDate.of(2026,2,2), FechasLaborables18.sumarDiasLaborables(d, 1),
        "Error: debe saltar sabado y domingo");
  }

  @Test
  void contarLaborablesDebeContarCorrecto() {
    // del lunes 26 al lunes 2 (excl) hay 5 laborables
    assertEquals(5, FechasLaborables18.contarLaborables(LocalDate.of(2026,1,26), LocalDate.of(2026,2,2)),
        "Error: debe contar 5 dias laborables en esa semana");
  }

  @Test
  void sumarDiasLaborablesCeroDebeDevolverMismaFecha() {
    assertEquals(LocalDate.of(2026,1,26), FechasLaborables18.sumarDiasLaborables(LocalDate.of(2026,1,26), 0),
        "Error: sumar 0 dias laborables debe devolver la misma fecha");
  }
}
