package com.docencia.enumerados.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidadorAccesoTest {

  @Test
  void debeTenerTresNiveles() {
    assertEquals(3, NivelAcceso.values().length, "Error: NivelAcceso debe tener 3 valores");
  }

  @Test
  void debeContenerAdmin() {
    assertEquals(NivelAcceso.Admin, NivelAcceso.valueOf("Admin"), "Error: falta Admin en NivelAcceso");
  }

  @Test
  void puedeEscribirDebeSerFalseParaInvitado() {
    ValidadorAcceso v = new ValidadorAcceso();
    assertFalse(v.puedeEscribir(NivelAcceso.Invitado), "Error: Invitado no debe poder escribir");
  }

  @Test
  void puedeEscribirDebeSerTrueParaUsuario() {
    ValidadorAcceso v = new ValidadorAcceso();
    assertTrue(v.puedeEscribir(NivelAcceso.Usuario), "Error: Usuario debe poder escribir");
  }

  @Test
  void puedeBorrarDebeSerTrueSoloParaAdmin() {
    ValidadorAcceso v = new ValidadorAcceso();
    assertTrue(v.puedeBorrar(NivelAcceso.Admin), "Error: Admin debe poder borrar");
    assertFalse(v.puedeBorrar(NivelAcceso.Usuario), "Error: Usuario no debe poder borrar");
  }
}
