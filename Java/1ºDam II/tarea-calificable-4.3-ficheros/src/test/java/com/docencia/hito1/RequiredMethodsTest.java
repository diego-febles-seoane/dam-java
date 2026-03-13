package com.docencia.hito1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Optional;

import static com.docencia.hito1.ReflectUtils.*;

public class RequiredMethodsTest {

  @Test
  void debeExistirTodasLasClasesConSuPaquete() {
    mustLoad("com.docencia.app.Main");
    mustLoad("com.docencia.model.Persona");
    mustLoad("com.docencia.model.Usuario");
    mustLoad("com.docencia.util.Validaciones");
    mustLoad("com.docencia.repository.IUserRepository");
    mustLoad("com.docencia.repository.impl.UserRepositoryImpl");
    mustLoad("com.docencia.service.IAuthService");
    mustLoad("com.docencia.service.IUserService");
    mustLoad("com.docencia.service.impl.AuthServiceImpl");
    mustLoad("com.docencia.service.impl.UserServiceImpl");
  }

  @Test
  void personaDebeSerAbstractaYConConstructoresYMetodosBasicos() {
    Class<?> persona = mustLoad("com.docencia.model.Persona");
    mustBeAbstract(persona);

    // Nuevos constructores solicitados
    Constructor<?> ctor0 = mustHaveConstructor(persona);
    mustBeProtected(ctor0);

    Constructor<?> ctorId = mustHaveConstructor(persona, int.class);
    mustBeProtected(ctorId);

    // Se mantiene el constructor original (id, nombre)
    Constructor<?> ctor = mustHaveConstructor(persona, int.class, String.class);
    mustBeProtected(ctor);

    mustBePublic(mustHaveMethod(persona, "getId", int.class));
    mustBePublic(mustHaveMethod(persona, "getNombre", String.class));
    mustBePublic(mustHaveMethod(persona, "setNombre", void.class, String.class));

    Method toString = mustHaveDeclaredMethod(persona, "toString", String.class);
    mustBePublic(toString);
  }

  @Test
  void usuarioDebeExtenderPersonaYTenerConstructoresYMetodos() {
    Class<?> usuario = mustLoad("com.docencia.model.Usuario");
    Class<?> persona = mustLoad("com.docencia.model.Persona");

    org.junit.jupiter.api.Assertions.assertTrue(persona.isAssignableFrom(usuario),
        "Usuario debe extender Persona");

    // constructor completo (se mantiene)
    Constructor<?> ctorFull = mustHaveConstructor(usuario, int.class, String.class, String.class, String.class);
    mustBePublic(ctorFull);

    // Nuevo constructor por email solicitado
    Constructor<?> ctorEmail = mustHaveConstructor(usuario, String.class);
    mustBePublic(ctorEmail);

    mustBePublic(mustHaveMethod(usuario, "getEmail", String.class));
    mustBePublic(mustHaveMethod(usuario, "getPassword", String.class));
    mustBePublic(mustHaveMethod(usuario, "setPassword", void.class, String.class));

    mustBePublic(mustHaveMethod(usuario, "getIntentosFallidos", int.class));
    mustBePublic(mustHaveMethod(usuario, "isBloqueado", boolean.class));

    mustBePublic(mustHaveMethod(usuario, "incrementarIntentosFallidos", void.class));
    mustBePublic(mustHaveMethod(usuario, "resetearIntentosFallidos", void.class));
    mustBePublic(mustHaveMethod(usuario, "bloquear", void.class));

    mustBePublic(mustHaveDeclaredMethod(usuario, "equals", boolean.class, Object.class));
    mustBePublic(mustHaveDeclaredMethod(usuario, "hashCode", int.class));
    mustBePublic(mustHaveDeclaredMethod(usuario, "toString", String.class));
  }

  @Test
  void validacionesDebeSerClaseEstaticaConMetodos() {
    Class<?> v = mustLoad("com.docencia.util.Validaciones");

    Method norm = mustHaveMethod(v, "normalizarEmail", String.class, String.class);
    mustBePublic(norm); mustBeStatic(norm);

    Method emailVal = mustHaveMethod(v, "emailValido", boolean.class, String.class);
    mustBePublic(emailVal); mustBeStatic(emailVal);

    Method passVal = mustHaveMethod(v, "passwordValida", boolean.class, String.class);
    mustBePublic(passVal); mustBeStatic(passVal);

    Method validarNombre = mustHaveMethod(v, "validarNombre", void.class, String.class);
    mustBePublic(validarNombre); mustBeStatic(validarNombre);

    Method validarEmail = mustHaveMethod(v, "validarEmail", void.class, String.class);
    mustBePublic(validarEmail); mustBeStatic(validarEmail);

    Method validarPassword = mustHaveMethod(v, "validarPassword", void.class, String.class);
    mustBePublic(validarPassword); mustBeStatic(validarPassword);
  }

  @Test
  void iUserRepositoryDebeSerInterfazConCRUD() {
    Class<?> repo = mustLoad("com.docencia.repository.IUserRepository");
    mustBeInterface(repo);

    Class<?> usuario = mustLoad("com.docencia.model.Usuario");

    mustHaveMethod(repo, "save", void.class, usuario);
    mustHaveMethod(repo, "findByEmail", Optional.class, String.class);
    mustHaveMethod(repo, "existsByEmail", boolean.class, String.class);

    Method findAll = mustHaveMethodAnyReturn(repo, "findAll");
    mustReturnSetOrList(findAll);

    mustHaveMethod(repo, "deleteByEmail", boolean.class, String.class);
  }

  @Test
  void userRepositoryImplDebeImplementarInterfaz() {
    Class<?> impl = mustLoad("com.docencia.repository.impl.UserRepositoryImpl");
    Class<?> repo = mustLoad("com.docencia.repository.IUserRepository");
    org.junit.jupiter.api.Assertions.assertTrue(repo.isAssignableFrom(impl),
        "UserRepositoryImpl debe implementar IUserRepository");
  }

  @Test
  void iUserServiceDebeSerInterfazConMetodosCRUD() {
    Class<?> svc = mustLoad("com.docencia.service.IUserService");
    mustBeInterface(svc);

    Class<?> usuario = mustLoad("com.docencia.model.Usuario");

    mustHaveMethod(svc, "crearUsuario", usuario, int.class, String.class, String.class, String.class);

    Method listar = mustHaveMethodAnyReturn(svc, "listarUsuarios");
    mustReturnSetOrList(listar);

    mustHaveMethod(svc, "buscarPorEmail", Optional.class, String.class);
    mustHaveMethod(svc, "eliminarPorEmail", boolean.class, String.class);

    optionalMethod(svc, "cambiarNombre", usuario, String.class, String.class);
    optionalMethod(svc, "cambiarPassword", usuario, String.class, String.class);
  }

  @Test
  void userServiceImplDebeImplementarInterfazYTenerConstructorConRepo() {
    Class<?> impl = mustLoad("com.docencia.service.impl.UserServiceImpl");
    Class<?> svc = mustLoad("com.docencia.service.IUserService");
    Class<?> repo = mustLoad("com.docencia.repository.IUserRepository");

    org.junit.jupiter.api.Assertions.assertTrue(svc.isAssignableFrom(impl),
        "UserServiceImpl debe implementar IUserService");

    Constructor<?> ctor = mustHaveConstructor(impl, repo);
    mustBePublic(ctor);
  }

  @Test
  void iAuthServiceDebeSerInterfazConRegisterYLogin() {
    Class<?> auth = mustLoad("com.docencia.service.IAuthService");
    mustBeInterface(auth);

    Class<?> usuario = mustLoad("com.docencia.model.Usuario");

    mustHaveMethod(auth, "register", usuario, int.class, String.class, String.class, String.class);
    mustHaveMethod(auth, "login", boolean.class, String.class, String.class);

    optionalMethod(auth, "isBloqueado", boolean.class, String.class);
    optionalMethod(auth, "desbloquear", void.class, String.class);
  }

  @Test
  void authServiceImplDebeImplementarInterfazYTenerConstructorValido() {
    Class<?> impl = mustLoad("com.docencia.service.impl.AuthServiceImpl");
    Class<?> auth = mustLoad("com.docencia.service.IAuthService");
    Class<?> repo = mustLoad("com.docencia.repository.IUserRepository");
    Class<?> userSvc = mustLoad("com.docencia.service.IUserService");

    org.junit.jupiter.api.Assertions.assertTrue(auth.isAssignableFrom(impl),
        "AuthServiceImpl debe implementar IAuthService");

    boolean ok = false;

    try {
      Constructor<?> c1 = impl.getDeclaredConstructor(repo);
      mustBePublic(c1);
      ok = true;
    } catch (NoSuchMethodException ignored) {}

    if (!ok) {
      try {
        Constructor<?> c2 = impl.getDeclaredConstructor(userSvc);
        mustBePublic(c2);
        ok = true;
      } catch (NoSuchMethodException ignored) {}
    }

    org.junit.jupiter.api.Assertions.assertTrue(ok,
        "AuthServiceImpl debe tener constructor public con (IUserRepository) o (IUserService)");
  }

  @Test
  void mainDebeTenerMainYMetodosPrivadosEstaticosRecomendados() throws Exception {
    Class<?> main = mustLoad("com.docencia.app.Main");

    Method entry = main.getMethod("main", String[].class);
    mustBePublic(entry);
    mustBeStatic(entry);

    Method mostrarMenu = mustHaveDeclaredMethod(main, "mostrarMenu", void.class);
    mustBePrivate(mostrarMenu); mustBeStatic(mostrarMenu);

    Method leerOpcion = mustHaveDeclaredMethod(main, "leerOpcion", int.class);
    mustBePrivate(leerOpcion); mustBeStatic(leerOpcion);

    Class<?> iAuth = mustLoad("com.docencia.service.IAuthService");
    Class<?> iUser = mustLoad("com.docencia.service.IUserService");

    Method registrar = mustHaveDeclaredMethod(main, "registrar", void.class, iAuth);
    mustBePrivate(registrar); mustBeStatic(registrar);

    Method login = mustHaveDeclaredMethod(main, "login", void.class, iAuth);
    mustBePrivate(login); mustBeStatic(login);

    Method listar = mustHaveDeclaredMethod(main, "listar", void.class, iUser);
    mustBePrivate(listar); mustBeStatic(listar);

    Method buscar = mustHaveDeclaredMethod(main, "buscar", void.class, iUser);
    mustBePrivate(buscar); mustBeStatic(buscar);

    Method eliminar = mustHaveDeclaredMethod(main, "eliminar", void.class, iUser);
    mustBePrivate(eliminar); mustBeStatic(eliminar);
  }
}