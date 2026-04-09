package com.ejemplo.centro;

import com.ejemplo.centro.model.CentroData;
import com.ejemplo.centro.model.EstadoCentro;
import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import com.ejemplo.centro.repository.CentroXmlRepository;
import com.ejemplo.centro.repository.CentroXmlRepositoryImpl;
import com.ejemplo.centro.repository.EstadoJsonRepository;
import com.ejemplo.centro.repository.EstadoJsonRepositoryImpl;
import com.ejemplo.centro.service.CentroService;
import com.ejemplo.centro.service.CentroServiceImpl;
import com.ejemplo.centro.util.JsonManager;
import com.ejemplo.centro.util.XmlManager;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Path dataDir = Path.of("data");
            Files.createDirectories(dataDir);

            Path xmlPath = dataDir.resolve("centro.xml");
            Path jsonPath = dataDir.resolve("estado.json");

            inicializarDatos(xmlPath, jsonPath);

            CentroXmlRepository xmlRepository = new CentroXmlRepositoryImpl(xmlPath);
            EstadoJsonRepository jsonRepository = new EstadoJsonRepositoryImpl(jsonPath);
            CentroService service = new CentroServiceImpl(xmlRepository, jsonRepository);

            ejecutarMenu(service, xmlPath, jsonPath);
        } catch (Exception e) {
            System.err.println("Error durante la ejecución:");
            e.printStackTrace();
        }
    }

    private static void ejecutarMenu(CentroService service, Path xmlPath, Path jsonPath) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1" -> buscarProfesor(scanner, service);
                case "2" -> buscarModulo(scanner, service);
                case "3" -> listarModulosDeProfesor(scanner, service);
                case "4" -> registrarEvaluacion(scanner, service);
                case "5" -> listarEvaluacionesDeModulo(scanner, service);
                case "6" -> calcularMediaDeModulo(scanner, service);
                case "7" -> calcularMediaDeProfesor(scanner, service);
                case "8" -> registrarIncidencia(scanner, service);
                case "9" -> listarIncidenciasDeProfesor(scanner, service);
                case "10" -> mostrarRutas(xmlPath, jsonPath);
                case "0" -> {
                    salir = true;
                    System.out.println("Saliendo de la aplicación...");
                }
                default -> System.out.println("Opción no válida.");
            }

            if (!salir) {
                System.out.println("\nPulsa ENTER para continuar...");
                scanner.nextLine();
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA HÍBRIDO XML + JSON ===");
        System.out.println("1. Buscar profesor");
        System.out.println("2. Buscar módulo");
        System.out.println("3. Listar módulos de un profesor");
        System.out.println("4. Registrar evaluación");
        System.out.println("5. Listar evaluaciones de un módulo");
        System.out.println("6. Calcular media de un módulo");
        System.out.println("7. Calcular media de un profesor");
        System.out.println("8. Registrar incidencia");
        System.out.println("9. Listar incidencias de un profesor");
        System.out.println("10. Mostrar rutas de los ficheros");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void buscarProfesor(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del profesor: ");
        Profesor profesor = service.buscarProfesor(scanner.nextLine());
        imprimirProfesor(profesor);
    }

    private static void buscarModulo(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del módulo: ");
        Modulo modulo = service.buscarModulo(scanner.nextLine());
        imprimirModulo(modulo);
    }

    private static void listarModulosDeProfesor(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del profesor: ");
        List<Modulo> modulos = service.listarModulosDeProfesor(scanner.nextLine());
        if (modulos.isEmpty()) {
            System.out.println("No hay módulos para ese profesor.");
            return;
        }
        modulos.forEach(Main::imprimirModulo);
    }

    private static void registrarEvaluacion(Scanner scanner, CentroService service) {
        System.out.print("Alumno: ");
        String alumno = scanner.nextLine();
        System.out.print("Módulo ID: ");
        String moduloId = scanner.nextLine();
        System.out.print("Nota: ");
        double nota = leerDouble(scanner);

        Evaluacion evaluacion = service.registrarEvaluacion(alumno, moduloId, nota);
        if (evaluacion == null) {
            System.out.println("No se pudo registrar la evaluación.");
            return;
        }
        System.out.println("Evaluación registrada correctamente:");
        imprimirEvaluacion(evaluacion);
    }

    private static void listarEvaluacionesDeModulo(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del módulo: ");
        List<Evaluacion> evaluaciones = service.listarEvaluacionesDeModulo(scanner.nextLine());
        if (evaluaciones.isEmpty()) {
            System.out.println("No hay evaluaciones para ese módulo.");
            return;
        }
        evaluaciones.forEach(Main::imprimirEvaluacion);
    }

    private static void calcularMediaDeModulo(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del módulo: ");
        double media = service.calcularMediaDeModulo(scanner.nextLine());
        System.out.println("Media del módulo: " + media);
    }

    private static void calcularMediaDeProfesor(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del profesor: ");
        double media = service.calcularMediaDeProfesor(scanner.nextLine());
        System.out.println("Media del profesor: " + media);
    }

    private static void registrarIncidencia(Scanner scanner, CentroService service) {
        System.out.print("Profesor ID: ");
        String profesorId = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Fecha (yyyy-mm-dd): ");
        String fecha = scanner.nextLine();

        Incidencia incidencia = service.registrarIncidencia(profesorId, descripcion, fecha);
        if (incidencia == null) {
            System.out.println("No se pudo registrar la incidencia.");
            return;
        }
        System.out.println("Incidencia registrada correctamente:");
        imprimirIncidencia(incidencia);
    }

    private static void listarIncidenciasDeProfesor(Scanner scanner, CentroService service) {
        System.out.print("Introduce el id del profesor: ");
        List<Incidencia> incidencias = service.listarIncidenciasDeProfesor(scanner.nextLine());
        if (incidencias.isEmpty()) {
            System.out.println("No hay incidencias para ese profesor.");
            return;
        }
        incidencias.forEach(Main::imprimirIncidencia);
    }

    private static void mostrarRutas(Path xmlPath, Path jsonPath) {
        System.out.println("XML:  " + xmlPath.toAbsolutePath());
        System.out.println("JSON: " + jsonPath.toAbsolutePath());
    }

    private static double leerDouble(Scanner scanner) {
        while (true) {
            try {
                String value = scanner.nextLine().trim().replace(",", ".");
                return Double.parseDouble(value);
            } catch (NumberFormatException e) {
                System.out.print("Valor no válido. Introduce un número: ");
            }
        }
    }

    private static void inicializarDatos(Path xmlPath, Path jsonPath) {
        XmlManager xmlManager = new XmlManager();
        JsonManager jsonManager = new JsonManager();

        if (!Files.exists(xmlPath)) {
            CentroData centroData = new CentroData(
                    List.of(
                            new Profesor("P01", "Ana Pérez", "Informática"),
                            new Profesor("P02", "Luis Martín", "FOL")
                    ),
                    List.of(
                            new Modulo("M01", "Programación", "P01"),
                            new Modulo("M02", "Acceso a datos", "P01"),
                            new Modulo("M03", "Formación y Orientación Laboral", "P02")
                    )
            );
            xmlManager.write(xmlPath, centroData);
        }

        if (!Files.exists(jsonPath)) {
            jsonManager.write(jsonPath, new EstadoCentro());
        }
    }

    private static void imprimirProfesor(Profesor profesor) {
        if (profesor == null) {
            System.out.println("Profesor no encontrado");
            return;
        }
        System.out.println("- Profesor{id='%s', nombre='%s', departamento='%s'}"
                .formatted(profesor.getId(), profesor.getNombre(), profesor.getDepartamento()));
    }

    private static void imprimirModulo(Modulo modulo) {
        if (modulo == null) {
            System.out.println("Módulo no encontrado");
            return;
        }
        System.out.println("- Modulo{id='%s', nombre='%s', profesorId='%s'}"
                .formatted(modulo.getId(), modulo.getNombre(), modulo.getProfesorId()));
    }

    private static void imprimirEvaluacion(Evaluacion evaluacion) {
        System.out.println("- Evaluacion{alumno='%s', moduloId='%s', nota=%s}"
                .formatted(evaluacion.getAlumno(), evaluacion.getModuloId(), evaluacion.getNota()));
    }

    private static void imprimirIncidencia(Incidencia incidencia) {
        System.out.println("- Incidencia{profesorId='%s', descripcion='%s', fecha='%s'}"
                .formatted(incidencia.getProfesorId(), incidencia.getDescripcion(), incidencia.getFecha()));
    }
}
