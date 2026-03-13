package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueoSegundoFalloDevuelveFalseTest {

  @Test
  void segundo_login_incorrecto_debe_devolver_false() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    H3Reflect.call(auth, "register",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    H3Reflect.call(auth, "login",
        new Class<?>[]{String.class, String.class},
        new Object[]{"ana@email.com", "mal1"});

    Object r2 = H3Reflect.call(auth, "login",
        new Class<?>[]{String.class, String.class},
        new Object[]{"ana@email.com", "mal2"});

    assertEquals(false, r2, "segundo fallo de login debe devolver false");
  }
}
