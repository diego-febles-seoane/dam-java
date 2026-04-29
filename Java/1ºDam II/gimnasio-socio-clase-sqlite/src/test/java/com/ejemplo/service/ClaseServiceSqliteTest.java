package com.ejemplo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ejemplo.model.Clase;
import com.ejemplo.model.ClaseMonitor;
import com.ejemplo.model.ClaseReservaSocio;
import com.ejemplo.repository.sqlite.ClaseSqliteRepository;
import com.ejemplo.support.TestBackupManager;
import com.ejemplo.support.TestDataFactory;
import com.ejemplo.support.TestDatabaseSupport;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClaseServiceSqliteTest {

    private ClaseService service;

    @BeforeEach
    void setUp() {
        TestBackupManager.restoreDatabase();
        service = new ClaseService(new ClaseSqliteRepository());
    }

    @Test @Order(1)
    void findByIdOkTest() {
        assertEquals("Yoga Manana", service.findById(1).getNombre());
    }

    @Test @Order(2)
    void findByIdNullTest() {
        assertNull(service.findById(null));
    }

    @Test @Order(3)
    void findByIdEmptyTest() {
        assertNull(service.findById(0));
    }

    @Test @Order(4)
    void findByIdFailTest() {
        assertNull(service.findById(999));
    }

    @Test @Order(5)
    void findAllOkTest() {
        assertEquals(4, service.findAll().size());
    }

    @Test @Order(6)
    void findAllFailTest() {
        TestDatabaseSupport.clearClases();
        assertTrue(service.findAll().isEmpty());
    }

    @Test @Order(7)
    void findAllEmptyTest() {
        TestDatabaseSupport.clearClases();
        assertTrue(service.findAll().isEmpty());
    }

    @Test @Order(8)
    void findAllOrderTest() {
        assertEquals(1, service.findAll().get(0).getId());
    }

    @Test @Order(9)
    void createOkTest() {
        assertTrue(service.create(TestDataFactory.validClase()));
    }

    @Test @Order(10)
    void createNullTest() {
        assertFalse(service.create(null));
    }

    @Test @Order(11)
    void createEmptyTest() {
        assertFalse(service.create(TestDataFactory.invalidClaseWithEmptyName()));
    }

    @Test @Order(12)
    void createFailTest() {
        Clase invalida = new Clase(null, "Clase X", "yoga", "2026-05-05 10:00:00", 10, 5, 1, 999);
        assertFalse(service.create(invalida));
    }

    @Test @Order(13)
    void updateOkTest() {
        assertTrue(service.update(TestDataFactory.updateClase(1)));
        assertEquals("Yoga Manana Plus", service.findById(1).getNombre());
    }

    @Test @Order(14)
    void updateNullTest() {
        assertFalse(service.update(null));
    }

    @Test @Order(15)
    void updateEmptyTest() {
        Clase clase = new Clase(1, "   ", "yoga", "2026-05-01 09:00:00", 20, 5, 1, 1);
        assertFalse(service.update(clase));
    }

    @Test @Order(16)
    void updateFailTest() {
        assertFalse(service.update(TestDataFactory.updateClase(999)));
    }

    @Test @Order(17)
    void deleteByIdOkTest() {
        assertTrue(service.create(TestDataFactory.validClase()));
        int lastId = service.findAll().stream().mapToInt(Clase::getId).max().orElseThrow();
        assertTrue(service.deleteById(lastId));
    }

    @Test @Order(18)
    void deleteByIdNullTest() {
        assertFalse(service.deleteById(null));
    }

    @Test @Order(19)
    void deleteByIdEmptyTest() {
        assertFalse(service.deleteById(0));
    }

    @Test @Order(20)
    void deleteByIdFailTest() {
        assertFalse(service.deleteById(999));
    }

    @Test @Order(21)
    void findDisponiblesOkTest() {
        assertEquals(3, service.findDisponibles().size());
    }

    @Test @Order(22)
    void findDisponiblesFailTest() {
        TestDatabaseSupport.clearClases();
        assertTrue(service.findDisponibles().isEmpty());
    }

    @Test @Order(23)
    void findDisponiblesEmptyTest() {
        TestDatabaseSupport.clearClases();
        assertTrue(service.findDisponibles().isEmpty());
    }

    @Test @Order(24)
    void findDisponiblesFilterTest() {
        assertTrue(service.findDisponibles().stream().allMatch(c -> c.getPlazasDisponibles() > 0));
    }

    @Test @Order(25)
    void findByTipoOkTest() {
        assertEquals(1, service.findByTipo("yoga").size());
    }

    @Test @Order(26)
    void findByTipoNullTest() {
        assertTrue(service.findByTipo(null).isEmpty());
    }

    @Test @Order(27)
    void findByTipoEmptyTest() {
        assertTrue(service.findByTipo(" ").isEmpty());
    }

    @Test @Order(28)
    void findByTipoFailTest() {
        assertTrue(service.findByTipo("zumba").isEmpty());
    }

    @Test @Order(29)
    void findByMonitorOkTest() {
        assertEquals(2, service.findByMonitor(1).size());
    }

    @Test @Order(30)
    void findByMonitorNullTest() {
        assertTrue(service.findByMonitor(null).isEmpty());
    }

    @Test @Order(31)
    void findByMonitorEmptyTest() {
        assertTrue(service.findByMonitor(0).isEmpty());
    }

    @Test @Order(32)
    void findByMonitorFailTest() {
        assertTrue(service.findByMonitor(999).isEmpty());
    }

    @Test @Order(33)
    void findClasesConMonitorOkTest() {
        assertEquals(4, service.findClasesConMonitor().size());
    }

    @Test @Order(34)
    void findClasesConMonitorFailTest() {
        TestDatabaseSupport.clearClases();
        assertTrue(service.findClasesConMonitor().isEmpty());
    }

    @Test @Order(35)
    void findClasesConMonitorEmptyTest() {
        TestDatabaseSupport.clearClases();
        assertTrue(service.findClasesConMonitor().isEmpty());
    }

    @Test @Order(36)
    void findClasesConMonitorJoinTest() {
        ClaseMonitor claseMonitor = service.findClasesConMonitor().get(0);
        assertEquals("Laura Coach", claseMonitor.getMonitorNombre());
    }

    @Test @Order(37)
    void findReservasConSocioOkTest() {
        assertEquals(3, service.findReservasConSocio().size());
    }

    @Test @Order(38)
    void findReservasConSocioFailTest() {
        TestDatabaseSupport.clearTable("reserva");
        assertTrue(service.findReservasConSocio().isEmpty());
    }

    @Test @Order(39)
    void findReservasConSocioEmptyTest() {
        TestDatabaseSupport.clearTable("reserva");
        assertTrue(service.findReservasConSocio().isEmpty());
    }

    @Test @Order(40)
    void findReservasConSocioJoinTest() {
        ClaseReservaSocio reserva = service.findReservasConSocio().get(0);
        assertEquals("Ana Ruiz", reserva.getSocioNombre());
    }
}
