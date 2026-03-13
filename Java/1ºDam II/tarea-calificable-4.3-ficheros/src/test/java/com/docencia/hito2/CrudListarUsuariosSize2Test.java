package com.docencia.hito2;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class CrudListarUsuariosSize2Test {

  @Test
  void tras_crear_dos_usuarios_listarUsuarios_debe_tener_size_2() {
    Object repo = H3Factory.newRepo();
    Object userService = H3Factory.newUserService(repo);

    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});
    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{2, "Nombre2", "luis@email.com", "secreto2"});

    Object all = H3Reflect.call(userService, "listarUsuarios", new Class<?>[]{}, new Object[]{});

    assertEquals(2, ((Collection<?>) all).size(), "listarUsuarios debe devolver 2 elementos");
  }
}
