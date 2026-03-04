package com.docencia.hito2;

import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class H3Reflect {

  private H3Reflect() {}

  public static Class<?> mustLoad(String fqcn) {
    try {
      return Class.forName(fqcn);
    } catch (ClassNotFoundException e) {
      Assertions.fail("Falta la clase: " + fqcn);
      return null;
    }
  }

  public static Object newInstance(String fqcn, Class<?>[] paramTypes, Object[] args) {
    Class<?> c = mustLoad(fqcn);
    try {
      Constructor<?> ctor = c.getConstructor(paramTypes);
      return ctor.newInstance(args);
    } catch (NoSuchMethodException e) {
      Assertions.fail("Falta el constructor público: " + fqcn + signature(paramTypes));
      return null;
    } catch (Exception e) {
      Assertions.fail("No se pudo instanciar " + fqcn + ": " + e.getMessage());
      return null;
    }
  }

  public static Object call(Object target, String name, Class<?>[] paramTypes, Object[] args) {
  try {
    Method m = target.getClass().getMethod(name, paramTypes);
    return m.invoke(target, args);
  } catch (InvocationTargetException ite) {
    // IMPORTANTÍSIMO: re-lanzar la excepción real del método
    Throwable cause = ite.getCause();
    if (cause instanceof RuntimeException re) throw re;
    if (cause instanceof Error err) throw err;
    throw new RuntimeException(cause);
  } catch (NoSuchMethodException e) {
    org.junit.jupiter.api.Assertions.fail("Falta método: " + target.getClass().getName() + "#" + name);
    return null; // unreachable
  } catch (Exception e) {
    throw new RuntimeException(e);
  }
}

  public static Object callStatic(String fqcn, String method, Class<?>[] paramTypes, Object[] args) {
    Class<?> c = mustLoad(fqcn);
    try {
      Method m = c.getMethod(method, paramTypes);
      return m.invoke(null, args);
    } catch (NoSuchMethodException e) {
      Assertions.fail("Falta el método static: " + fqcn + "#" + method + signature(paramTypes));
      return null;
    } catch (Exception e) {
      Assertions.fail("Error invocando static " + fqcn + "#" + method + ": " + unwrap(e));
      return null;
    }
  }

  private static String signature(Class<?>[] params) {
    StringBuilder sb = new StringBuilder("(");
    for (int i = 0; i < params.length; i++) {
      sb.append(params[i].getSimpleName());
      if (i < params.length - 1) sb.append(", ");
    }
    sb.append(")");
    return sb.toString();
  }

  private static String unwrap(Exception e) {
    Throwable t = e;
    if (e.getCause() != null) t = e.getCause();
    return t.getClass().getSimpleName() + ": " + t.getMessage();
  }
}
