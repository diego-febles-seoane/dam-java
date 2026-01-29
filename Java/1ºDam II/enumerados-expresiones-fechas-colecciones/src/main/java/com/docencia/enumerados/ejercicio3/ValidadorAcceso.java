package com.docencia.enumerados.ejercicio3;

public final class ValidadorAcceso {

  public boolean puedeLeer(NivelAcceso nivel) {
    return true;
  }

  public boolean puedeEscribir(NivelAcceso nivel) {
    return nivel == NivelAcceso.Usuario || nivel == NivelAcceso.Admin;
  }

  public boolean puedeBorrar(NivelAcceso nivel) {
    return nivel == NivelAcceso.Admin;
  }
}
