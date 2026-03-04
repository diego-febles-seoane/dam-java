package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Login_Correcto_DevuelveTrue_Test {

  @Test
  void login_con_credenciales_correctas_debe_devolver_true() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    H3Reflect.call(auth, "register",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    Object ok = H3Reflect.call(auth, "login",
        new Class<?>[]{String.class, String.class},
        new Object[]{"ana@email.com", "secreto1"});

    assertEquals(true, ok, "login correcto debe devolver true");
  }
}
