package com.docencia.hito2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Registro_ExistsByEmail_DevuelveTrue_Test {

  @Test
  void tras_register_existsByEmail_debe_ser_true_para_email_normalizado() {
    Object repo = H3Factory.newRepo();
    Object auth = H3Factory.newAuthServiceWithRepo(repo);

    H3Reflect.call(auth, "register",
        new Class<?>[] { int.class, String.class, String.class, String.class },
        new Object[] { 1, "Nombre1", "ana@email.com", "secreto1" });

    Object exists = H3Reflect.call(repo, "existsByEmail",
        new Class<?>[] { String.class },
        new Object[] { "ANA@EMAIL.COM  " });

    assertEquals(true, exists, "existsByEmail debe devolver true tras registrar (ignorando mayúsculas/espacios)");
  }
}
