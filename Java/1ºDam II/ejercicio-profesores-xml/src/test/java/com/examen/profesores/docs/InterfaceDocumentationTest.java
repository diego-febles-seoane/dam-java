package com.examen.profesores.docs;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InterfaceDocumentationTest {

    private static final Path MAIN_JAVA = Path.of("src", "main", "java", "com", "examen", "profesores");

    @Test
    void verificaJavadocEnInterfazProfesorRepositoryTest() throws IOException {
        String source = Files.readString(MAIN_JAVA.resolve("repository/ProfesorRepository.java"));
        assertTrue(source.contains("/**"));
        assertTrue(source.contains("Contrato de persistencia"));
    }

    @Test
    void verificaJavadocDeMetodosEnProfesorRepositoryTest() throws IOException {
        String source = Files.readString(MAIN_JAVA.resolve("repository/ProfesorRepository.java"));
        assertTrue(source.contains("* Guarda un profesor en el repositorio."));
        assertTrue(source.contains("* Busca un profesor por su identificador."));
        assertTrue(source.contains("* Recupera todos los profesores persistidos."));
        assertTrue(source.contains("* Comprueba si existe un profesor con el identificador indicado."));
        assertTrue(source.contains("* Elimina un profesor por identificador."));
        assertTrue(source.contains("* Actualiza el departamento de un profesor."));
    }

    @Test
    void verificaJavadocEnInterfazProfesorServiceTest() throws IOException {
        String source = Files.readString(MAIN_JAVA.resolve("service/ProfesorService.java"));
        assertTrue(source.contains("/**"));
        assertTrue(source.contains("Contrato de logica de negocio"));
    }

    @Test
    void verificaJavadocDeMetodosEnProfesorServiceTest() throws IOException {
        String source = Files.readString(MAIN_JAVA.resolve("service/ProfesorService.java"));
        assertTrue(source.contains("* Registra un nuevo profesor"));
        assertTrue(source.contains("* Busca un profesor"));
        assertTrue(source.contains("* Actualiza el departamento de un profesor"));
        assertTrue(source.contains("* Elimina un profesor"));
        assertTrue(source.contains("* Indica si un profesor existe"));
        assertTrue(source.contains("* Lista todos los profesores"));
    }
}
