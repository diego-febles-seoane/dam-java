package com.examen.profesores.repository;

import com.examen.profesores.model.Profesor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ProfesorRepositoryImplTest {

    @TempDir
    Path tempDir;

    private ProfesorRepository repository;

    @BeforeEach
    void setUp() {
        repository = new ProfesorRepositoryImpl(tempDir.resolve("profesores.xml"));
    }

    @Test
    void guardaProfesorNuevoTest() {
        assertTrue(repository.save(new Profesor("P001", "Ana Perez", "Informatica")));
    }

    @Test
    void noGuardaProfesorDuplicadoPorIdTest() {
        repository.save(new Profesor("P001", "Ana Perez", "Informatica"));
        assertFalse(repository.save(new Profesor("P001", "Otro", "Otro")));
    }

    @Test
    void recuperaProfesorPorIdTest() {
        Profesor profesor = new Profesor("P001", "Ana Perez", "Informatica");
        repository.save(profesor);
        assertEquals(profesor, repository.findById("P001"));
    }

    @Test
    void compruebaExistenciaPorIdTest() {
        repository.save(new Profesor("P001", "Ana Perez", "Informatica"));
        assertTrue(repository.existsById("P001"));
    }

    @Test
    void eliminaProfesorExistentePorIdTest() {
        repository.save(new Profesor("P001", "Ana Perez", "Informatica"));
        assertTrue(repository.deleteById("P001"));
        assertFalse(repository.existsById("P001"));
    }

    @Test
    void actualizaDepartamentoTest() {
        repository.save(new Profesor("P001", "Ana Perez", "Informatica"));
        assertTrue(repository.updateDepartamento("P001", "Matematicas"));
        assertEquals("Matematicas", repository.findById("P001").getDepartamento());
    }
}
