package com.docencia.examen.composicion;

import com.docencia.examen.herencia.Directivo;
import com.docencia.examen.herencia.Empleado;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    private Directivo crearDirectorGeneral() {
        return new Directivo(
                "D001",
                "Laura",
                "Martín",
                "Dirección",
                4000.0,
                "Directora General",
                1000.0
        );
    }

    @Test
    @DisplayName("El constructor inicializa CIF, nombre y director general y la empresa comienza sin empleados")
    void constructor_inicializaCamposYNoTieneEmpleados() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        assertAll(
                () -> assertEquals("B12345678", empresa.getCif()),
                () -> assertEquals("MiEmpresa S.L.", empresa.getNombre()),
                () -> assertEquals(director, empresa.getDirectorGeneral()),
                () -> assertEquals(0, empresa.getNumeroEmpleados()),
                () -> assertTrue(empresa.getEmpleados().isEmpty())
        );
    }

    @Test
    @DisplayName("agregarEmpleado añade empleados y aumenta el número de empleados")
    void agregarEmpleado_incrementaNumeroEmpleados() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        Empleado e1 = new Empleado("E001", "Ana", "López", "IT", 1800.0);
        Empleado e2 = new Empleado("E002", "Juan", "Pérez", "Ventas", 1900.0);

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);

        assertAll(
                () -> assertEquals(2, empresa.getNumeroEmpleados()),
                () -> assertEquals(2, empresa.getEmpleados().size()),
                () -> assertTrue(empresa.getEmpleados().contains(e1)),
                () -> assertTrue(empresa.getEmpleados().contains(e2))
        );
    }

    @Test
    @DisplayName("agregarEmpleado ignora empleados null y no lanza excepción")
    void agregarEmpleado_ignoraNull() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        empresa.agregarEmpleado(null);

        assertEquals(0, empresa.getNumeroEmpleados(), "No debe añadirse ningún empleado null");
    }

    @Test
    @DisplayName("Empresa puede almacenar un Directivo como empleado en la lista de empleados")
    void empresaPuedeGuardarDirectivoComoEmpleado() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        Directivo d2 = new Directivo(
                "E100",
                "Marta",
                "Gómez",
                "Marketing",
                2800.0,
                "Jefa de área",
                400.0
        );

        empresa.agregarEmpleado(d2);

        assertAll(
                () -> assertEquals(1, empresa.getNumeroEmpleados()),
                () -> assertTrue(empresa.getEmpleados().contains(d2)),
                () -> assertEquals("E100", empresa.getEmpleados().get(0).getIdentificador())
        );
    }

    @Test
    @DisplayName("buscarPorIdentificador devuelve el empleado correcto si existe")
    void buscarPorIdentificador_encuentraEmpleado() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        Empleado e1 = new Empleado("E001", "Ana", "López", "IT", 1800.0);
        Empleado e2 = new Empleado("E002", "Juan", "Pérez", "Ventas", 1900.0);

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);

        Empleado encontrado = empresa.buscarPorIdentificador("E002");

        assertAll(
                () -> assertNotNull(encontrado),
                () -> assertEquals("E002", encontrado.getIdentificador()),
                () -> assertEquals("Juan", encontrado.getNombre())
        );
    }

    @Test
    @DisplayName("buscarPorIdentificador devuelve null si el identificador no existe o es null")
    void buscarPorIdentificador_devuelveNullCuandoNoExiste() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        empresa.agregarEmpleado(new Empleado("E001", "Ana", "López", "IT", 1800.0));

        Empleado noExiste = empresa.buscarPorIdentificador("E999");
        Empleado idNull = empresa.buscarPorIdentificador(null);

        assertAll(
                () -> assertNull(noExiste),
                () -> assertNull(idNull)
        );
    }

    @Test
    @DisplayName("eliminarPorIdentificador borra todos los empleados con ese id y devuelve true si elimina alguno")
    void eliminarPorIdentificador_borraEmpleadosYDevuelveTrue() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        Empleado e1 = new Empleado("E001", "Ana", "López", "IT", 1800.0);
        Empleado e2 = new Empleado("E002", "Juan", "Pérez", "Ventas", 1900.0);
        Empleado e3 = new Empleado("E001", "Ana2", "López2", "IT", 2000.0); // mismo id que e1

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);

        assertEquals(3, empresa.getNumeroEmpleados());

        boolean eliminado = empresa.eliminarPorIdentificador("E001");

        assertAll(
                () -> assertTrue(eliminado, "Debe devolver true si se elimina al menos un empleado"),
                () -> assertEquals(1, empresa.getNumeroEmpleados(), "Solo debe quedar el de id E002"),
                () -> assertNull(empresa.buscarPorIdentificador("E001"))
        );

        // volver a intentar borrar el mismo id no elimina nada
        boolean eliminadoOtraVez = empresa.eliminarPorIdentificador("E001");
        assertFalse(eliminadoOtraVez, "No debe eliminar nada si ya no hay empleados con ese id");
    }

    @Test
    @DisplayName("eliminarPorIdentificador con id null devuelve false y no modifica la lista")
    void eliminarPorIdentificador_idNull() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        empresa.agregarEmpleado(new Empleado("E001", "Ana", "López", "IT", 1800.0));

        boolean eliminado = empresa.eliminarPorIdentificador(null);

        assertAll(
                () -> assertFalse(eliminado),
                () -> assertEquals(1, empresa.getNumeroEmpleados())
        );
    }

    @Test
    @DisplayName("getEmpleados devuelve una copia de la lista: modificarla no afecta a Empresa")
    void getEmpleados_devuelveCopia() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        Empleado e1 = new Empleado("E001", "Ana", "López", "IT", 1800.0);
        empresa.agregarEmpleado(e1);

        List<Empleado> copia = empresa.getEmpleados();
        assertEquals(1, copia.size());

        // modificamos la copia
        copia.add(new Empleado("E002", "Juan", "Pérez", "Ventas", 1900.0));

        // la empresa no debería verse afectada por esa modificación
        assertAll(
                () -> assertEquals(1, empresa.getNumeroEmpleados(), "La lista interna no debe cambiar"),
                () -> assertEquals(1, empresa.getEmpleados().size(), "La copia interna sigue teniendo 1 elemento")
        );
    }

    @Test
    @DisplayName("toString de Empresa incluye CIF, nombre, nombre del director general y número de empleados")
    void toString_contieneInformacionBasica() {
        Directivo director = crearDirectorGeneral();
        Empresa empresa = new Empresa("B12345678", "MiEmpresa S.L.", director);

        empresa.agregarEmpleado(new Empleado("E001", "Ana", "López", "IT", 1800.0));

        String texto = empresa.toString();

        assertAll(
                () -> assertTrue(texto.contains("B12345678"), "Debe contener el CIF"),
                () -> assertTrue(texto.contains("MiEmpresa S.L."), "Debe contener el nombre de la empresa"),
                () -> assertTrue(texto.contains("Laura"), "Debe contener el nombre del director general"),
                () -> assertTrue(texto.contains("numeroEmpleados=1"), "Debe contener el número de empleados")
        );
    }
}
