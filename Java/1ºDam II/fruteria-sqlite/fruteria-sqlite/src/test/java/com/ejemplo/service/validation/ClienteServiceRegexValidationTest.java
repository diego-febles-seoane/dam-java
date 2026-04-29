package com.ejemplo.service.validation;

import com.ejemplo.model.Cliente;
import com.ejemplo.service.ClienteService;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ClienteServiceRegexValidationTest {
    private ClienteService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new ClienteService();
    }

    @Test
    void createClienteConDniIncorrectoFailTest() {
        assertFalse(service.create(new Cliente("1234A", "Cliente Test", "600000000", "cliente@test.com", "Adeje", 1)));
    }

    @Test
    void createClienteConEmailIncorrectoFailTest() {
        assertFalse(
                service.create(new Cliente("99999999Z", "Cliente Test", "600000000", "cliente.test.com", "Adeje", 1)));
    }

    @Test
    void createClienteConTelefonoIncorrectoFailTest() {
        assertFalse(service.create(new Cliente("99999999Z", "Cliente Test", "600", "cliente@test.com", "Adeje", 1)));
    }

    @Test
    void findByDniConFormatoIncorrectoFailTest() {
        assertNull(service.findByDni("1234A"));
    }
}
