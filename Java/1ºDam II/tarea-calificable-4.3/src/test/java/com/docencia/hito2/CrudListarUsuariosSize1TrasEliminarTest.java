package com.docencia.hito2;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class CrudListarUsuariosSize1TrasEliminarTest {

  @Test
  void tras_eliminar_un_usuario_listarUsuarios_debe_tener_size_1() {
    Object repo = H3Factory.newRepo();
    Object userService = H3Factory.newUserService(repo);

    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{1, "Nombre1", "ana@email.com", "secreto1"});
    H3Reflect.call(userService, "crearUsuario",
        new Class<?>[]{int.class, String.class, String.class, String.class},
        new Object[]{2, "Nombre2", "luis@email.com", "secreto2"});

    H3Reflect.call(userService, "eliminarPorEmail",
        new Class<?>[]{String.class},
        new Object[]{"ana@email.com"});

    Object all2 = H3Reflect.call(userService, "listarUsuarios", new Class<?>[]{}, new Object[]{});

    assertEquals(1, ((Collection<?>) all2).size(), "tras eliminar debe quedar 1 usuario");
  }
}
