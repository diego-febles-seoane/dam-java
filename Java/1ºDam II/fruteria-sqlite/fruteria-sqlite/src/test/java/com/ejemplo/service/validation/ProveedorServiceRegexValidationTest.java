package com.ejemplo.service.validation;

import com.ejemplo.model.Proveedor;
import com.ejemplo.service.ProveedorService;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ProveedorServiceRegexValidationTest {
    private ProveedorService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new ProveedorService();
    }

    @Test
    void createProveedorConCifIncorrectoFailTest() {
        assertFalse(service
                .create(new Proveedor("12345678B", "Proveedor Test", "922000000", "proveedor@test.com", "Telde", 1)));
    }

    @Test
    void createProveedorConEmailIncorrectoFailTest() {
        assertFalse(service
                .create(new Proveedor("B99999999", "Proveedor Test", "922000000", "proveedor.test.com", "Telde", 1)));
    }

    @Test
    void createProveedorConTelefonoIncorrectoFailTest() {
        assertFalse(
                service.create(new Proveedor("B99999999", "Proveedor Test", "922", "proveedor@test.com", "Telde", 1)));
    }

    @Test
    void findByCifConFormatoIncorrectoFailTest() {
        assertNull(service.findByCif("12345678B"));
    }
}
