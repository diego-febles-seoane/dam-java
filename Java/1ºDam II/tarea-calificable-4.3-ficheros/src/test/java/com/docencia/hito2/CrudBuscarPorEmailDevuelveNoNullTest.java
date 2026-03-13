package com.docencia.hito2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrudBuscarPorEmailDevuelveNoNullTest {

  @Test
  void buscarPorEmail_debe_devolver_algo_no_null() {
    Object repo = H3Factory.newRepo();
    Object userService = H3Factory.newUserService(repo);

    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    Object opt = H3Reflect.call(userService, "buscarPorEmail",
        new Class<?>[]{String.class},
        new Object[]{"ANA@EMAIL.COM"});

    assertNotNull(opt, "buscarPorEmail debe devolver Optional (no null)");
  }
}
