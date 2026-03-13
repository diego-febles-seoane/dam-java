package com.docencia.hito1;

import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class ReflectUtils {

  private ReflectUtils() {}

  public static Class<?> mustLoad(String fqcn) {
    try {
      return Class.forName(fqcn);
    } catch (ClassNotFoundException e) {
      Assertions.fail("Falta la clase (o paquete incorrecto): " + fqcn);
      return null;
    }
  }

  public static Method mustHaveMethod(Class<?> clazz, String name, Class<?> returnType, Class<?>... params) {
    try {
      Method m = clazz.getMethod(name, params);
      Assertions.assertEquals(returnType, m.getReturnType(),
          "Tipo de retorno incorrecto en " + clazz.getName() + "#" + name);
      return m;
    } catch (NoSuchMethodException e) {
      Assertions.fail("Falta el método público: " + signature(clazz, name, returnType, params));
      return null;
    }
  }

  public static Method mustHaveDeclaredMethod(Class<?> clazz, String name, Class<?> returnType, Class<?>... params) {
    try {
      Method m = clazz.getDeclaredMethod(name, params);
      Assertions.assertEquals(returnType, m.getReturnType(),
          "Tipo de retorno incorrecto en " + clazz.getName() + "#" + name);
      return m;
    } catch (NoSuchMethodException e) {
      Assertions.fail("Falta el método: " + signature(clazz, name, returnType, params));
      return null;
    }
  }

  /** Busca método por nombre y parámetros, sin exigir retorno. */
  public static Method mustHaveMethodAnyReturn(Class<?> clazz, String name, Class<?>... params) {
    try {
      return clazz.getMethod(name, params);
    } catch (NoSuchMethodException e) {
      Assertions.fail("Falta el método público: " + clazz.getName() + "#" + name + "(" + Arrays.toString(params) + ")");
      return null;
    }
  }

  public static Constructor<?> mustHaveConstructor(Class<?> clazz, Class<?>... params) {
    try {
      return clazz.getDeclaredConstructor(params);
    } catch (NoSuchMethodException e) {
      Assertions.fail("Falta el constructor: " + clazz.getName() + Arrays.toString(params));
      return null;
    }
  }

  public static void mustBePublic(Method m) { Assertions.assertTrue(Modifier.isPublic(m.getModifiers()), "Debe ser public: " + m); }
  public static void mustBePrivate(Method m) { Assertions.assertTrue(Modifier.isPrivate(m.getModifiers()), "Debe ser private: " + m); }
  public static void mustBeProtected(Method m) { Assertions.assertTrue(Modifier.isProtected(m.getModifiers()), "Debe ser protected: " + m); }
  public static void mustBeStatic(Method m) { Assertions.assertTrue(Modifier.isStatic(m.getModifiers()), "Debe ser static: " + m); }

  public static void mustBeProtected(Constructor<?> c) {
    Assertions.assertTrue(Modifier.isProtected(c.getModifiers()), "Constructor debe ser protected: " + c);
  }
  public static void mustBePublic(Constructor<?> c) {
    Assertions.assertTrue(Modifier.isPublic(c.getModifiers()), "Constructor debe ser public: " + c);
  }

  public static void mustBeAbstract(Class<?> clazz) {
    Assertions.assertTrue(Modifier.isAbstract(clazz.getModifiers()), "Debe ser abstract: " + clazz.getName());
  }
  public static void mustBeInterface(Class<?> clazz) {
    Assertions.assertTrue(clazz.isInterface(), "Debe ser interface: " + clazz.getName());
  }

  public static void mustReturnSetOrList(Method m) {
    Class<?> rt = m.getReturnType();
    boolean ok = Set.class.isAssignableFrom(rt) || List.class.isAssignableFrom(rt);
    Assertions.assertTrue(ok, "Debe devolver Set o List: " + m + " (devuelve " + rt.getName() + ")");
  }

  public static void optionalMethod(Class<?> clazz, String name, Class<?> returnType, Class<?>... params) {
    try {
      Method m = clazz.getMethod(name, params);
      Assertions.assertEquals(returnType, m.getReturnType(),
          "Tipo de retorno incorrecto en opcional " + clazz.getName() + "#" + name);
    } catch (NoSuchMethodException ignored) {
      // opcional
    }
  }

  private static String signature(Class<?> clazz, String name, Class<?> returnType, Class<?>... params) {
    return clazz.getName() + "#" + name + "(" + Arrays.toString(params) + "): " + returnType.getName();
  }
}