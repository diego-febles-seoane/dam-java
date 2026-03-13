package com.docencia.hito2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrudEliminarPorEmailDevuelveTrueTest {

  @Test
  void eliminarPorEmail_debe_devolver_true_cuando_elimina() {
    Object repo = H3Factory.newRepo();
    Object userService = H3Factory.newUserService(repo);

    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});

    Object deleted = H3Reflect.call(userService, "eliminarPorEmail",
        new Class<?>[]{String.class},
        new Object[]{"ana@email.com"});

    assertEquals(true, deleted, "eliminarPorEmail debe devolver true si existía y se eliminó");
  }
}
