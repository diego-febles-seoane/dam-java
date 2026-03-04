package com.docencia.hito0;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StructureTest {

    @Test
    void debeExistirEstructuraDeArchivosdeMain() {
        List<String> requiredFiles = List.of(
                "src/main/java/com/docencia/app/Main.java");

        for (String fichero : requiredFiles) {
            assertTrue(Files.exists(Path.of(fichero)), "Falta el archivo: " + fichero);
        }
    }

    @Test
    void debeExistirEstructuraDeArchivosdeModelo() {
        List<String> requiredFiles = List.of(
                "src/main/java/com/docencia/model/Usuario.java",
                "src/main/java/com/docencia/model/Persona.java");

        for (String fichero : requiredFiles) {
            assertTrue(Files.exists(Path.of(fichero)), "Falta el archivo: " + fichero);
        }
    }

    @Test
    void debeExistirEstructuraDeArchivosdeInterfacesDeServicio() {
        List<String> requiredFiles = List.of(
                "src/main/java/com/docencia/service/IAuthService.java",
                "src/main/java/com/docencia/service/IUserService.java",
                "src/main/java/com/docencia/repository/IUserRepository.java");

        for (String fichero : requiredFiles) {
            assertTrue(Files.exists(Path.of(fichero)), "Falta el archivo: " + fichero);
        }
    }

    @Test
    void debeExistirEstructuraDeArchivosdeImplementacionesDeServicio() {
        List<String> requiredFiles = List.of(
                "src/main/java/com/docencia/service/impl/AuthServiceImpl.java",
                "src/main/java/com/docencia/service/impl/UserServiceImpl.java",
                "src/main/java/com/docencia/repository/impl/UserRepositoryImpl.java");

        for (String fichero : requiredFiles) {
            assertTrue(Files.exists(Path.of(fichero)), "Falta el archivo: " + fichero);
        }
    }

    @Test
    void debeExistirEstructuraDeArchivosdeValidaciones() {
        List<String> requiredFiles = List.of(
                "src/main/java/com/docencia/util/Validaciones.java");

        for (String fichero : requiredFiles) {
            assertTrue(Files.exists(Path.of(fichero)), "Falta el archivo: " + fichero);
        }
    }

    @Test
    void debenExistirLasClasesPorReflection() throws Exception {
        List<String> requiredClasses = List.of(
                "com.docencia.app.Main",
                "com.docencia.model.Usuario",
                "com.docencia.model.Persona",
                "com.docencia.service.IAuthService",
                "com.docencia.service.IUserService",
                "com.docencia.service.impl.AuthServiceImpl",
                "com.docencia.service.impl.UserServiceImpl",
                "com.docencia.repository.IUserRepository",
                "com.docencia.repository.impl.UserRepositoryImpl",
                "com.docencia.util.Validaciones");

        for (String clase : requiredClasses) {
            assertNotNull(Class.forName(clase), "Falta la clase: " + clase);
        }
    }
}
