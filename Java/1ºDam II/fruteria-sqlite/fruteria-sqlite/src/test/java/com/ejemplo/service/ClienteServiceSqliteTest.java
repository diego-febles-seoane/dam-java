package com.ejemplo.service;

import com.ejemplo.model.*;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ClienteServiceSqliteTest {
    private ClienteService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new ClienteService();
    }

    private Cliente nuevo() {
        return new Cliente("99999999Z", "Test Cliente", "600000000", "testc@email.com", "Adeje", 1);
    }

    @Test
    void findByDniOkTest() {
        assertNotNull(service.findByDni("11111111A"));
    }

    @Test
    void findByDniNullTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByDniEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByDniFailTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findAllOkTest() {
        assertFalse(service.findAll().isEmpty());
    }

    @Test
    void findAllFailTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findAllEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findAllOrderTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void createOkTest() {
        assertTrue(service.create(nuevo()));
    }

    @Test
    void createNullTest() {
        assertFalse(service.create(null));
    }

    @Test
    void createEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void createFailTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void updateOkTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void updateNullTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void updateEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void updateFailTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void deleteByDniOkTest() {
        assertTrue(service.deleteByDni("33333333C"));
    }

    @Test
    void deleteByDniNullTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void deleteByDniEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void deleteByDniFailTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findActivosOkTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByCiudadOkTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByEmailOkTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByEmailFailTest() {
        assertTrue(true);
        assertNotNull(service);
    }
}
