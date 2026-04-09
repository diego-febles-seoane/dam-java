package com.examen.profesores.service;

import com.examen.profesores.model.Profesor;
import com.examen.profesores.repository.ProfesorRepository;
import com.examen.profesores.repository.ProfesorRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProfesorServiceImplTest {

    @TempDir
    Path tempDir;

    private ProfesorService service;

    @BeforeEach
    void setUp() {
        ProfesorRepository repository = new ProfesorRepositoryImpl(tempDir.resolve("profesores.xml"));
        service = new ProfesorServiceImpl(repository);
    }

    @Test
    void registraProfesorValidoTest() {
        Profesor profesor = service.registrarProfesor("P001", "Ana Perez", "Informatica");
        assertNotNull(profesor);
        assertEquals("P001", profesor.getId());
        assertTrue(profesor.isActivo());
    }

    @Test
    void rechazaProfesorConIdDuplicadoTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        Profesor duplicado = service.registrarProfesor("P001", "Otro", "Otro");
        assertNull(duplicado);
    }

    @Test
    void rechazaProfesorConIdVacioTest() {
        assertNull(service.registrarProfesor(" ", "Ana Perez", "Informatica"));
    }

    @Test
    void rechazaProfesorConNombreVacioTest() {
        assertNull(service.registrarProfesor("P001", " ", "Informatica"));
    }

    @Test
    void rechazaProfesorConDepartamentoVacioTest() {
        assertNull(service.registrarProfesor("P001", "Ana Perez", " "));
    }

    @Test
    void buscaProfesorExistenteTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        assertEquals("Ana Perez", service.buscarProfesor("P001").getNombre());
    }

    @Test
    void devuelveNullSiProfesorNoExisteTest() {
        assertNull(service.buscarProfesor("P001"));
    }

    @Test
    void actualizaDepartamentoDeProfesorExistenteTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        assertTrue(service.actualizarDepartamento("P001", "Matematicas"));
    }

    @Test
    void rechazaActualizacionSiProfesorNoExisteTest() {
        assertFalse(service.actualizarDepartamento("P001", "Matematicas"));
    }

    @Test
    void rechazaActualizacionConDepartamentoVacioTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        assertFalse(service.actualizarDepartamento("P001", " "));
    }

    @Test
    void eliminaProfesorExistenteTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        assertTrue(service.eliminarProfesor("P001"));
    }

    @Test
    void rechazaEliminacionDeProfesorInexistenteTest() {
        assertFalse(service.eliminarProfesor("P001"));
    }

    @Test
    void existeProfesorDevuelveTrueTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        assertTrue(service.existeProfesor("P001"));
    }

    @Test
    void existeProfesorDevuelveFalseSiNoExisteTest() {
        assertFalse(service.existeProfesor("P001"));
    }

    @Test
    void listaTodosLosProfesoresTest() {
        service.registrarProfesor("P001", "Ana Perez", "Informatica");
        service.registrarProfesor("P002", "Luis Martin", "FOL");
        List<Profesor> profesores = service.listarProfesores();
        assertEquals(2, profesores.size());
    }

    @Test
    void devuelveListaVaciaSiNoHayProfesoresTest() {
        assertTrue(service.listarProfesores().isEmpty());
    }
}
