package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Registro_CreaUsuario_NoNull_Test {

  @Test
  void register_devuelve_un_usuario_no_null() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    Object u1 = H3Reflect.call(auth, "register",
        new Class<?>[] { int.class, String.class, String.class, String.class },
        new Object[] { 1, "Nombre1", "ana@email.com", "secreto1" });

    assertNotNull(u1, "register debe devolver un Usuario no null");
  }
}
