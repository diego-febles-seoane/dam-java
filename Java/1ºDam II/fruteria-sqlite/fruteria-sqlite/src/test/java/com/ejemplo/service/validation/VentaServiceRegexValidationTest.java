package com.ejemplo.service.validation;

import com.ejemplo.model.Venta;
import com.ejemplo.service.VentaService;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class VentaServiceRegexValidationTest {
    private VentaService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new VentaService();
    }

    @Test
    void createVentaConFechaIncorrectaFailTest() {
        assertFalse(service.create(new Venta(null, "26/04/2026", "TCK-2026-099", "11111111A", "tarjeta", 10.0, 0.0, 0.0,
                10.0, "cerrada")));
    }

    @Test
    void createVentaConTicketIncorrectoFailTest() {
        assertFalse(service.create(new Venta(null, "2026-04-26 10:30:00", "TICKET-099", "11111111A", "tarjeta", 10.0,
                0.0, 0.0, 10.0, "cerrada")));
    }

    @Test
    void createVentaConDniClienteIncorrectoFailTest() {
        assertFalse(service.create(new Venta(null, "2026-04-26 10:30:00", "TCK-2026-099", "1234A", "tarjeta", 10.0, 0.0,
                0.0, 10.0, "cerrada")));
    }

    @Test
    void findByTicketConFormatoIncorrectoFailTest() {
        assertNull(service.findByTicket("TICKET-099"));
    }
}
