package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CrudCrearUsuario1NoNullTest {

  @Test
  void crearUsuario_para_primer_usuario_devuelve_no_null() {
    Object repo = H3Factory.newRepo();
    Object userService = H3Factory.newUserService(repo);

    Object u1 = H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    assertNotNull(u1, "crearUsuario debe devolver un Usuario no null");
  }
}
