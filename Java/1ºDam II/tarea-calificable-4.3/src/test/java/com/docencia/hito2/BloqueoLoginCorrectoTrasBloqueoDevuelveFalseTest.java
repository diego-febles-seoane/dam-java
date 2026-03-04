package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueoLoginCorrectoTrasBloqueoDevuelveFalseTest {

  @Test
  void tras_bloqueo_login_correcto_debe_devolver_false() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    H3Reflect.call(auth, "register",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    H3Reflect.call(auth, "login", new Class<?>[]{String.class, String.class}, new Object[]{"ana@email.com", "mal1"});
    H3Reflect.call(auth, "login", new Class<?>[]{String.class, String.class}, new Object[]{"ana@email.com", "mal2"});
    H3Reflect.call(auth, "login", new Class<?>[]{String.class, String.class}, new Object[]{"ana@email.com", "mal3"});

    Object okAfterBlock = H3Reflect.call(auth, "login",
        new Class<?>[]{String.class, String.class},
        new Object[]{"ana@email.com", "secreto1"});

    assertEquals(false, okAfterBlock, "después del bloqueo no debe permitir login aunque la password sea correcta");
  }
}
