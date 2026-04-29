package com.ejemplo.service.validation;

import com.ejemplo.model.Producto;
import com.ejemplo.service.ProductoService;
import com.ejemplo.support.TestDatabaseSupport;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductoServiceRegexValidationTest {
    private ProductoService service;

    @BeforeEach
    void setUp() {
        TestDatabaseSupport.resetDatabase();
        service = new ProductoService();
    }

    @Test
    void createProductoConCodigoIncorrectoFailTest() {
        assertFalse(service.create(
                new Producto(null, "MAN-001", "Manzana Test", "kg", 1.0, 2.0, 10.0, 5.0, 1, 1, 1, "B12345678")));
    }

    @Test
    void createProductoConNombreIncorrectoFailTest() {
        assertFalse(service
                .create(new Producto(null, "FRU-PER-001", "#", "kg", 1.0, 2.0, 10.0, 5.0, 1, 1, 1, "B12345678")));
    }

    @Test
    void createProductoConCifProveedorIncorrectoFailTest() {
        assertFalse(service.create(
                new Producto(null, "FRU-PER-001", "Pera Test", "kg", 1.0, 2.0, 10.0, 5.0, 1, 1, 1, "12345678B")));
    }
}
