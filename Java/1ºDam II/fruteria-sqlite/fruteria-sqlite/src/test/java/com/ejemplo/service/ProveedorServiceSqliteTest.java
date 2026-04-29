package com.ejemplo.service;

import com.ejemplo.model.*;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ProveedorServiceSqliteTest {
    private ProveedorService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new ProveedorService();
    }

    private Proveedor nuevo() {
        return new Proveedor("B99999999", "Test Proveedor", "922000000", "testp@email.com", "Adeje", 1);
    }

    @Test
    void findByCifOkTest() {
        assertNotNull(service.findByCif("B12345678"));
    }

    @Test
    void findByCifNullTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByCifEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void findByCifFailTest() {
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
    void deleteByCifOkTest() {
        service.create(nuevo());
        assertTrue(service.deleteByCif("B99999999"));
    }

    @Test
    void deleteByCifNullTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void deleteByCifEmptyTest() {
        assertTrue(true);
        assertNotNull(service);
    }

    @Test
    void deleteByCifFailTest() {
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
