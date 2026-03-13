package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Registro_Duplicado_LanzaIllegalArgumentException_Test {

  @Test
  void register_con_email_duplicado_debe_lanzar_IllegalArgumentException() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    H3Reflect.call(auth, "register",
        new Class<?>[] { int.class, String.class, String.class, String.class },
        new Object[] { 1, "Nombre1", "ana@email.com", "secreto1" });

    assertThrows(IllegalArgumentException.class, () ->
        H3Reflect.call(auth, "register",
            new Class<?>[] { int.class, String.class, String.class, String.class },
            new Object[] { 2, "Nombre2", "ANA@email.com", "secreto2" }),
        "Email duplicado debe provocar IllegalArgumentException");
  }
}
