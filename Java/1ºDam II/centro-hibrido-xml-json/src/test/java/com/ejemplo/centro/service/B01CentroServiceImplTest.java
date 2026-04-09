package com.ejemplo.centro.service;

import com.ejemplo.centro.TestDataHelper;
import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import com.ejemplo.centro.repository.CentroXmlRepository;
import com.ejemplo.centro.repository.CentroXmlRepositoryImpl;
import com.ejemplo.centro.repository.EstadoJsonRepository;
import com.ejemplo.centro.repository.EstadoJsonRepositoryImpl;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class B01CentroServiceImplTest {

    @TempDir Path tempDir;
    private CentroService service;

    @BeforeEach
    void setUp() {
        Path xmlPath = tempDir.resolve("centro.xml");
        Path jsonPath = tempDir.resolve("estado.json");
        TestDataHelper.seedXml(xmlPath);
        TestDataHelper.seedJson(jsonPath);
        CentroXmlRepository xmlRepository = new CentroXmlRepositoryImpl(xmlPath);
        EstadoJsonRepository jsonRepository = new EstadoJsonRepositoryImpl(jsonPath);
        service = new CentroServiceImpl(xmlRepository, jsonRepository);
    }

    @Test @Order(1)
    void servicioBuscaProfesorExistenteTest() {
        Profesor profesor = service.buscarProfesor("P01");
        assertNotNull(profesor);
        assertEquals("Ana Pérez", profesor.getNombre());
    }

    @Test @Order(2)
    void servicioNoEncuentraProfesorInexistenteTest() {
        assertNull(service.buscarProfesor("P99"));
    }

    @Test @Order(3)
    void servicioNoBuscaProfesorConIdBlankTest() {
        assertNull(service.buscarProfesor("   "));
    }

    @Test @Order(4)
    void servicioBuscaModuloExistenteTest() {
        Modulo modulo = service.buscarModulo("M03");
        assertNotNull(modulo);
        assertEquals("Formación y Orientación Laboral", modulo.getNombre());
    }

    @Test @Order(5)
    void servicioListaDosModulosDeProfesorTest() {
        assertEquals(2, service.listarModulosDeProfesor("P01").size());
    }

    @Test @Order(6)
    void servicioListaVaciaDeModulosSiProfesorNoExisteTest() {
        assertTrue(service.listarModulosDeProfesor("P99").isEmpty());
    }

    @Test @Order(7)
    void servicioRegistraEvaluacionValidaTest() {
        Evaluacion evaluacion = service.registrarEvaluacion("Sofía", "M01", 9.25);
        assertNotNull(evaluacion);
        assertEquals("Sofía", evaluacion.getAlumno());
    }

    @Test @Order(8)
    void servicioRegistraEvaluacionRecortandoEspaciosTest() {
        Evaluacion evaluacion = service.registrarEvaluacion("  Sofía  ", "  M01  ", 9.25);
        assertNotNull(evaluacion);
        assertEquals("Sofía", evaluacion.getAlumno());
        assertEquals("M01", evaluacion.getModuloId());
    }

    @Test @Order(9)
    void servicioRechazaEvaluacionDeModuloInexistenteTest() {
        assertNull(service.registrarEvaluacion("Sofía", "M99", 9.25));
    }

    @Test @Order(10)
    void servicioRechazaEvaluacionConAlumnoBlankTest() {
        assertNull(service.registrarEvaluacion(" ", "M01", 9.25));
    }

    @Test @Order(11)
    void servicioRechazaEvaluacionConNotaMayorQueDiezTest() {
        assertNull(service.registrarEvaluacion("Sofía", "M01", 10.01));
    }

    @Test @Order(12)
    void servicioListaEvaluacionesDeModuloExistenteTest() {
        assertEquals(2, service.listarEvaluacionesDeModulo("M01").size());
    }

    @Test @Order(13)
    void servicioCalculaMediaCorrectaDeModuloTest() {
        assertEquals(7.5, service.calcularMediaDeModulo("M01"));
    }

    @Test @Order(14)
    void servicioCalculaMediaCorrectaDeProfesorTest() {
        assertEquals(8.0, service.calcularMediaDeProfesor("P01"));
    }

    @Test @Order(15)
    void servicioRegistraIncidenciaValidaTest() {
        Incidencia incidencia = service.registrarIncidencia("P03", "Fallo de red", "2026-04-20");
        assertNotNull(incidencia);
        assertEquals("P03", incidencia.getProfesorId());
    }

    @Test @Order(16)
    void servicioRechazaIncidenciaDeProfesorInexistenteTest() {
        assertNull(service.registrarIncidencia("P99", "Fallo de red", "2026-04-20"));
    }

    @Test @Order(17)
    void servicioListaIncidenciasDeProfesorExistenteTest() {
        assertEquals(2, service.listarIncidenciasDeProfesor("P01").size());
    }

    @Test @Order(18)
    void servicioSobrescribeEvaluacionDuplicadaTest() {
        service.registrarEvaluacion("Pedro", "M01", 10.0);
        List<Evaluacion> evaluaciones = service.listarEvaluacionesDeModulo("M01");
        assertEquals(2, evaluaciones.size());
        assertTrue(evaluaciones.stream().anyMatch(e -> e.getAlumno().equals("Pedro") && e.getNota() == 10.0));
    }

    @Test @Order(19)
    void servicioNuevaIncidenciaAumentaListadoTest() {
        service.registrarIncidencia("P01", "Nueva incidencia", "2026-04-25");
        assertEquals(3, service.listarIncidenciasDeProfesor("P01").size());
    }

    @Test @Order(20)
    void servicioBuscarProfesorRecortaEspaciosTest() {
        assertNotNull(service.buscarProfesor(" P01 "));
    }
}
