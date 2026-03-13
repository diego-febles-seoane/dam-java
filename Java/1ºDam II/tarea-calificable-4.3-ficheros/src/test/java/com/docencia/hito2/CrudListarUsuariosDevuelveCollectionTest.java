package com.docencia.hito2;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class CrudListarUsuariosDevuelveCollectionTest {

  @Test
  void listarUsuarios_debe_devolver_una_Collection() {
    Object repo = H3Factory.newRepo();
    Object userService = H3Factory.newUserService(repo);

    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    Object all = H3Reflect.call(userService, "listarUsuarios", new Class<?>[]{}, new Object[]{});

    assertTrue(all instanceof Collection, "listarUsuarios debe devolver Collection (Set o List)");
  }
}
