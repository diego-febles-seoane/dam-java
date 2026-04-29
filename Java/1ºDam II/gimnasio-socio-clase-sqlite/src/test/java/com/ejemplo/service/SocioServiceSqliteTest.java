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

import com.ejemplo.model.Socio;
import com.ejemplo.model.SocioReserva;
import com.ejemplo.support.TestBackupManager;
import com.ejemplo.support.TestDataFactory;
import com.ejemplo.support.TestDatabaseSupport;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SocioServiceSqliteTest {

    private SocioService service;

    @BeforeEach
    void setUp() {
        TestBackupManager.restoreDatabase();
        service = new SocioService();
    }

    @Test @Order(1)
    void findByIdOkTest() {
        assertEquals("Ana Ruiz", service.findById(1).getNombre());
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
        assertEquals(3, service.findAll().size());
    }

    @Test @Order(6)
    void findAllFailTest() {
        TestDatabaseSupport.clearSocios();
        assertTrue(service.findAll().isEmpty());
    }

    @Test @Order(7)
    void findAllEmptyTest() {
        TestDatabaseSupport.clearSocios();
        assertTrue(service.findAll().isEmpty());
    }

    @Test @Order(8)
    void findAllOrderTest() {
        assertEquals(1, service.findAll().get(0).getId());
    }

    @Test @Order(9)
    void createOkTest() {
        assertTrue(service.create(TestDataFactory.validSocio()));
    }

    @Test @Order(10)
    void createNullTest() {
        assertFalse(service.create(null));
    }

    @Test @Order(11)
    void createEmptyTest() {
        assertFalse(service.create(TestDataFactory.invalidSocioWithEmptyName()));
    }

    @Test @Order(12)
    void createFailTest() {
        Socio duplicado = new Socio(null, "44444444D", "Duplicado", "d@gym.com", "600000000", "basic", 1);
        assertFalse(service.create(duplicado));
    }

    @Test @Order(13)
    void updateOkTest() {
        assertTrue(service.update(TestDataFactory.updateSocio(1)));
        assertEquals("Ana Ruiz Premium", service.findById(1).getNombre());
    }

    @Test @Order(14)
    void updateNullTest() {
        assertFalse(service.update(null));
    }

    @Test @Order(15)
    void updateEmptyTest() {
        Socio socio = new Socio(1, "44444444D", "   ", "ana@gym.com", "600111111", "premium", 1);
        assertFalse(service.update(socio));
    }

    @Test @Order(16)
    void updateFailTest() {
        assertFalse(service.update(TestDataFactory.updateSocio(999)));
    }

    @Test @Order(17)
    void deleteByIdOkTest() {
        assertTrue(service.create(TestDataFactory.validSocio()));
        int lastId = service.findAll().stream().mapToInt(Socio::getId).max().orElseThrow();
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
    void findActivosOkTest() {
        assertEquals(2, service.findActivos().size());
    }

    @Test @Order(22)
    void findActivosFailTest() {
        TestDatabaseSupport.clearSocios();
        assertTrue(service.findActivos().isEmpty());
    }

    @Test @Order(23)
    void findActivosEmptyTest() {
        TestDatabaseSupport.clearSocios();
        assertTrue(service.findActivos().isEmpty());
    }

    @Test @Order(24)
    void findActivosFilterTest() {
        assertTrue(service.findActivos().stream().allMatch(s -> s.getActivo() == 1));
    }

    @Test @Order(25)
    void findByPlanOkTest() {
        assertEquals(1, service.findByPlan("premium").size());
    }

    @Test @Order(26)
    void findByPlanNullTest() {
        assertTrue(service.findByPlan(null).isEmpty());
    }

    @Test @Order(27)
    void findByPlanEmptyTest() {
        assertTrue(service.findByPlan(" ").isEmpty());
    }

    @Test @Order(28)
    void findByPlanFailTest() {
        assertTrue(service.findByPlan("gold").isEmpty());
    }

    @Test @Order(29)
    void findSociosConReservasOkTest() {
        assertEquals(4, service.findSociosConReservas().size());
    }

    @Test @Order(30)
    void findSociosConReservasFailTest() {
        TestDatabaseSupport.clearSocios();
        assertTrue(service.findSociosConReservas().isEmpty());
    }

    @Test @Order(31)
    void findSociosConReservasEmptyTest() {
        TestDatabaseSupport.clearSocios();
        assertTrue(service.findSociosConReservas().isEmpty());
    }

    @Test @Order(32)
    void findSociosConReservasJoinTest() {
        SocioReserva socioReserva = service.findSociosConReservas().get(0);
        assertEquals("Ana Ruiz", socioReserva.getSocioNombre());
    }
}
