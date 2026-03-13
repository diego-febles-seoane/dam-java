package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueoPrimerFalloDevuelveFalseTest {

  @Test
  void primer_login_incorrecto_debe_devolver_false() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    H3Reflect.call(auth, "register",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    Object r1 = H3Reflect.call(auth, "login",
        new Class<?>[]{String.class, String.class},
        new Object[]{"ana@email.com", "mal1"});

    assertEquals(false, r1, "primer fallo de login debe devolver false");
  }
}
