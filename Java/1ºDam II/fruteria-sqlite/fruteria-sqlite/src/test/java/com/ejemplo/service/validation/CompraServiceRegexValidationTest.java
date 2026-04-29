package com.ejemplo.service.validation;

import com.ejemplo.model.Compra;
import com.ejemplo.service.CompraService;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CompraServiceRegexValidationTest {
    private CompraService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new CompraService();
    }

    @Test
    void createCompraConFechaIncorrectaFailTest() {
        assertFalse(service.create(
                new Compra(null, "26/04/2026", "FAC-2026-099", "B12345678", 10.0, 0.7, 10.7, "registrada", "Test")));
    }

    @Test
    void createCompraConFacturaIncorrectaFailTest() {
        assertFalse(service.create(
                new Compra(null, "2026-04-26 10:30:00", "099", "B12345678", 10.0, 0.7, 10.7, "registrada", "Test")));
    }

    @Test
    void findByProveedorConCifIncorrectoFailTest() {
        assertTrue(service.findByProveedor("12345678B").isEmpty());
    }

    @Test
    void findByNumeroFacturaConFormatoIncorrectoFailTest() {
        assertNull(service.findByNumeroFactura("099"));
    }
}
