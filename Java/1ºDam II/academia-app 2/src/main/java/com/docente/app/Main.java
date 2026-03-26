package com.docente.app;

import com.docente.modelo.Alumno;
import com.docente.servicio.AlumnoService;
import com.docente.servicio.IAlumnoService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        IAlumnoService servicio = new AlumnoService();

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero(scanner, "Seleccione una opción: ");
            scanner.nextLine();

            switch (opcion) {
                case 1 -> crearAlumno(scanner, servicio);
                case 2 -> listarAlumnos(servicio);
                case 3 -> buscarAlumno(scanner, servicio);
                case 4 -> modificarAlumno(scanner, servicio);
                case 5 -> eliminarAlumno(scanner, servicio);
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ CRUD ALUMNADO ---");
        System.out.println("1. Crear alumno");
        System.out.println("2. Listar alumnos");
        System.out.println("3. Buscar alumno por identificador");
        System.out.println("4. Modificar alumno");
        System.out.println("5. Eliminar alumno");
        System.out.println("0. Salir");
    }

    private static void crearAlumno(Scanner scanner, IAlumnoService servicio) {
        System.out.print("Identificador (ej. ALU001): ");
        String identificador = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        int edad = leerEntero(scanner, "Edad: ");
        scanner.nextLine();
        System.out.print("Curso (ej. 1DAM, 2ESO, 1BACH): ");
        String curso = scanner.nextLine();

        boolean resultado = servicio.crearAlumno(identificador, nombre, edad, curso);
        if (resultado) {
            System.out.print("El alumno se ha creado correctamente");
        } else {
            System.out.print("Se ha producido un error creando el alumno");
        }
    }

    private static void listarAlumnos(IAlumnoService servicio) {
        List<String> alumnos = servicio.read();
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        alumnos.forEach(System.out::println);
    }

    private static void buscarAlumno(Scanner scanner, IAlumnoService servicio) {
        System.out.print("Introduzca el identificador: ");
        String identificador = scanner.nextLine();
        Alumno alumno = servicio.buscarAlumno(identificador);
        if (alumno == null) {
            System.out.print("El alumno no existe o no se ha podido recuperar");
        } else {
            System.out.print(alumno);
        }
    }

    private static void modificarAlumno(Scanner scanner, IAlumnoService  servicio) {
        System.out.print("Identificador del alumno a modificar: ");
        String identificador = scanner.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = scanner.nextLine();
        int edad = leerEntero(scanner, "Nueva edad: ");
        scanner.nextLine();
        System.out.print("Nuevo curso: ");
        String curso = scanner.nextLine();

        boolean resultado = servicio.actualizarAlumno(identificador, nombre, edad, curso);
        if (resultado) {
            System.out.print("El alumno se ha creado correctamente");
        } else {
            System.out.print("El alumno no existe o no ha sido posiblem modificarlo");
        }
    }

    private static void eliminarAlumno(Scanner scanner, IAlumnoService servicio) {
        System.out.print("Identificador del alumno a eliminar: ");
        String identificador = scanner.nextLine();
        boolean resultado = servicio.deleteAlumno(identificador);
        if (resultado) {
            System.out.print("El alumno se ha eliminado correctamente");
        } else {
            System.out.print("Se ha producido un error eliminando el alumno");
        }
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Debe introducir un número entero.");
            scanner.nextLine();
        }
    }
}

