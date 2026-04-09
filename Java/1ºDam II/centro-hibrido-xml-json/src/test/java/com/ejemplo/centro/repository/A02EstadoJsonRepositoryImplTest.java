package com.ejemplo.centro.repository;

import com.ejemplo.centro.TestDataHelper;
import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class A02EstadoJsonRepositoryImplTest {

    @TempDir Path tempDir;
    private EstadoJsonRepository repository;
    private Path jsonPath;

    @BeforeEach
    void setUp() {
        jsonPath = tempDir.resolve("estado.json");
        TestDataHelper.seedJson(jsonPath);
        repository = new EstadoJsonRepositoryImpl(jsonPath);
    }

    @Test @Order(1)
    void jsonDevuelveSeisEvaluacionesInicialesTest() {
        assertEquals(6, repository.findAllEvaluaciones().size());
    }

    @Test @Order(2)
    void jsonDevuelveCuatroIncidenciasInicialesTest() {
        assertEquals(4, repository.findAllIncidencias().size());
    }

    @Test @Order(3)
    void jsonGuardaNuevaEvaluacionTest() {
        repository.saveEvaluacion(new Evaluacion("Sofía", "M01", 9.25));
        assertEquals(7, repository.findAllEvaluaciones().size());
    }

    @Test @Order(4)
    void jsonSobrescribeEvaluacionDuplicadaPorAlumnoYModuloTest() {
        repository.saveEvaluacion(new Evaluacion("Pedro", "M01", 10.0));
        List<Evaluacion> evaluaciones = repository.findEvaluacionesByModuloId("M01");
        assertEquals(2, evaluaciones.size());
        assertTrue(evaluaciones.stream().anyMatch(e -> e.getAlumno().equals("Pedro") && e.getNota() == 10.0));
    }

    @Test @Order(5)
    void jsonFiltraEvaluacionesPorModuloTest() {
        assertEquals(2, repository.findEvaluacionesByModuloId("M01").size());
    }

    @Test @Order(6)
    void jsonDevuelveListaVaciaSiNoHayEvaluacionesDelModuloTest() {
        assertTrue(repository.findEvaluacionesByModuloId("M99").isEmpty());
    }

    @Test @Order(7)
    void jsonGuardaNuevaIncidenciaTest() {
        repository.saveIncidencia(new Incidencia("P01", "Nueva incidencia", "2026-04-20"));
        assertEquals(5, repository.findAllIncidencias().size());
    }

    @Test @Order(8)
    void jsonFiltraIncidenciasPorProfesorTest() {
        assertEquals(2, repository.findIncidenciasByProfesorId("P01").size());
    }

    @Test @Order(9)
    void jsonDevuelveListaVaciaSiNoHayIncidenciasDelProfesorTest() {
        assertTrue(repository.findIncidenciasByProfesorId("P99").isEmpty());
    }

    @Test @Order(10)
    void jsonFindAllEvaluacionesDevuelveCopiaDefensivaTest() {
        List<Evaluacion> evaluaciones = repository.findAllEvaluaciones();
        evaluaciones.clear();
        assertEquals(6, repository.findAllEvaluaciones().size());
    }

    @Test @Order(11)
    void jsonFindAllIncidenciasDevuelveCopiaDefensivaTest() {
        List<Incidencia> incidencias = repository.findAllIncidencias();
        incidencias.clear();
        assertEquals(4, repository.findAllIncidencias().size());
    }

    @Test @Order(12)
    void jsonPersisteCambiosEntreLecturasTest() {
        repository.saveEvaluacion(new Evaluacion("Claudia", "M04", 7.75));
        EstadoJsonRepository nuevo = new EstadoJsonRepositoryImpl(jsonPath);
        assertTrue(nuevo.findEvaluacionesByModuloId("M04").stream()
                .anyMatch(e -> e.getAlumno().equals("Claudia") && e.getNota() == 7.75));
    }
}
