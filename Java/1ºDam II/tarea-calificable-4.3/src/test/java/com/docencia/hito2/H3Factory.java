package com.docencia.hito2;

public final class H3Factory {

  private H3Factory() {}

  /** Crea repo, userService y authService usando reflection. */
  public static Object newRepo() {
    return H3Reflect.newInstance(
        "com.docencia.repository.impl.UserRepositoryImpl",
        new Class<?>[]{},
        new Object[]{}
    );
  }

  public static Object newUserService(Object repo) {
    return H3Reflect.newInstance(
        "com.docencia.service.impl.UserServiceImpl",
        new Class<?>[]{H3Reflect.mustLoad("com.docencia.repository.IUserRepository")},
        new Object[]{repo}
    );
  }

  public static Object newAuthServiceWithRepo(Object repo) {
    return H3Reflect.newInstance(
        "com.docencia.service.impl.AuthServiceImpl",
        new Class<?>[]{H3Reflect.mustLoad("com.docencia.repository.IUserRepository")},
        new Object[]{repo}
    );
  }
}
