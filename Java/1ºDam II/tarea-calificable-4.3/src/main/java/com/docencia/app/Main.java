package com.docencia.app;

import com.docencia.repository.IUserRepository;
import com.docencia.repository.impl.UserRepositoryImpl;
import com.docencia.service.IAuthService;
import com.docencia.service.IUserService;
import com.docencia.service.impl.AuthServiceImpl;
import com.docencia.service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {

  private static final Scanner SC = new Scanner(System.in);

  public static void main(String[] args) {
    IUserService userService = new UserServiceImpl();
    IAuthService authService = new AuthServiceImpl();

    boolean running = true;
    while (running) {
      mostrarMenu();
      int op = leerOpcion();
      try {
        switch (op) {
          case 1 -> registrar(authService);
          case 2 -> login(authService);
          case 3 -> listar(userService);
          case 4 -> buscar(userService);
          case 5 -> eliminar(userService);
          case 0 -> running = false;
          default -> System.out.println("Opción no válida");
        }
      } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
      }
      System.out.println();
    }
    System.out.println("Hasta pronto.");
  }

  private static void mostrarMenu() {
    System.out.println("===== SISTEMA DE AUTENTICACIÓN =====");
    System.out.println("1) Registrar usuario");
    System.out.println("2) Iniciar sesión");
    System.out.println("3) Listar usuarios");
    System.out.println("4) Buscar por email");
    System.out.println("5) Eliminar usuario");
    System.out.println("0) Salir");
  }

  private static int leerOpcion() {
    System.out.print("Elige una opción: ");
    try {
      return Integer.parseInt(SC.nextLine().trim());
    } catch (Exception e) {
      return -1;
    }
  }

  private static void registrar(IAuthService auth) {
    System.out.print("ID: ");
    int id = Integer.parseInt(SC.nextLine().trim());
    System.out.print("Nombre: ");
    String nombre = SC.nextLine();
    System.out.print("Email: ");
    String email = SC.nextLine();
    System.out.print("Password: ");
    String pass = SC.nextLine();

    auth.register(id, nombre, email, pass);
    System.out.println("Usuario registrado correctamente.");
  }

  private static void login(IAuthService auth) {
    System.out.print("Email: ");
    String email = SC.nextLine();
    System.out.print("Password: ");
    String pass = SC.nextLine();

    boolean ok = auth.login(email, pass);
    System.out.println(ok ? "✅ Login correcto" : "❌ Login incorrecto");
  }

  private static void listar(IUserService users) {
    users.listarUsuarios().forEach(System.out::println);
  }

  private static void buscar(IUserService users) {
    System.out.print("Email a buscar: ");
    String email = SC.nextLine();
    var u = users.buscarPorEmail(email);
    System.out.println(u.map(Object::toString).orElse("No encontrado"));
  }

  private static void eliminar(IUserService users) {
    System.out.print("Email a eliminar: ");
    String email = SC.nextLine();
    boolean ok = users.eliminarPorEmail(email);
    System.out.println(ok ? "Eliminado." : "No existía.");
  }
}
