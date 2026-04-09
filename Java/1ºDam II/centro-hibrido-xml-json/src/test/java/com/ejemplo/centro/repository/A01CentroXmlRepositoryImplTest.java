package com.ejemplo.centro.repository;

import com.ejemplo.centro.TestDataHelper;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class A01CentroXmlRepositoryImplTest {

    @TempDir Path tempDir;
    private CentroXmlRepository repository;

    @BeforeEach
    void setUp() {
        Path xmlPath = tempDir.resolve("centro.xml");
        TestDataHelper.seedXml(xmlPath);
        repository = new CentroXmlRepositoryImpl(xmlPath);
    }

    @Test @Order(1)
    void xmlDevuelveTresProfesoresInicialesTest() {
        assertEquals(3, repository.findAllProfesores().size());
    }

    @Test @Order(2)
    void xmlDevuelveCuatroModulosInicialesTest() {
        assertEquals(4, repository.findAllModulos().size());
    }

    @Test @Order(3)
    void xmlRecuperaProfesorExistentePorIdTest() {
        Profesor profesor = repository.findProfesorById("P01");
        assertNotNull(profesor);
        assertEquals("Ana Pérez", profesor.getNombre());
    }

    @Test @Order(4)
    void xmlNoRecuperaProfesorInexistentePorIdTest() {
        assertNull(repository.findProfesorById("P99"));
    }

    @Test @Order(5)
    void xmlRecuperaModuloExistentePorIdTest() {
        Modulo modulo = repository.findModuloById("M02");
        assertNotNull(modulo);
        assertEquals("Acceso a datos", modulo.getNombre());
    }

    @Test @Order(6)
    void xmlNoRecuperaModuloInexistentePorIdTest() {
        assertNull(repository.findModuloById("M99"));
    }

    @Test @Order(7)
    void xmlFindAllProfesoresDevuelveCopiaDefensivaTest() {
        List<Profesor> profesores = repository.findAllProfesores();
        profesores.clear();
        assertEquals(3, repository.findAllProfesores().size());
    }

    @Test @Order(8)
    void xmlFindAllModulosDevuelveCopiaDefensivaTest() {
        List<Modulo> modulos = repository.findAllModulos();
        modulos.clear();
        assertEquals(4, repository.findAllModulos().size());
    }
}
