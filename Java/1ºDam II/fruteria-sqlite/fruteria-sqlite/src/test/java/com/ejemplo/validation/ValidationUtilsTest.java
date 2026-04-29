package com.ejemplo.validation;

import com.ejemplo.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsTest {

    @Test
    void dniOkTest() {
        assertTrue(ValidationUtils.isValidDni("12345678Z"));
    }

    @Test
    void dniNullTest() {
        assertFalse(ValidationUtils.isValidDni(null));
    }

    @Test
    void dniEmptyTest() {
        assertFalse(ValidationUtils.isValidDni(""));
    }

    @Test
    void dniFormatFailTest() {
        assertFalse(ValidationUtils.isValidDni("1234A"));
    }

    @Test
    void dniLowercaseFailTest() {
        assertFalse(ValidationUtils.isValidDni("12345678z"));
    }

    @Test
    void cifOkTest() {
        assertTrue(ValidationUtils.isValidCif("B12345678"));
    }

    @Test
    void cifNullTest() {
        assertFalse(ValidationUtils.isValidCif(null));
    }

    @Test
    void cifEmptyTest() {
        assertFalse(ValidationUtils.isValidCif(""));
    }

    @Test
    void cifFormatFailTest() {
        assertFalse(ValidationUtils.isValidCif("12345678B"));
    }

    @Test
    void cifLowercaseFailTest() {
        assertFalse(ValidationUtils.isValidCif("b12345678"));
    }

    @Test
    void telefonoOkTest() {
        assertTrue(ValidationUtils.isValidTelefono("600123456"));
    }

    @Test
    void telefonoNullOptionalOkTest() {
        assertTrue(ValidationUtils.isValidTelefono(null));
    }

    @Test
    void telefonoWithLettersFailTest() {
        assertFalse(ValidationUtils.isValidTelefono("600ABC456"));
    }

    @Test
    void telefonoTooShortFailTest() {
        assertFalse(ValidationUtils.isValidTelefono("60012345"));
    }

    @Test
    void emailOkTest() {
        assertTrue(ValidationUtils.isValidEmail("cliente@email.com"));
    }

    @Test
    void emailNullOptionalOkTest() {
        assertTrue(ValidationUtils.isValidEmail(null));
    }

    @Test
    void emailWithoutAtFailTest() {
        assertFalse(ValidationUtils.isValidEmail("cliente.email.com"));
    }

    @Test
    void emailWithoutDomainFailTest() {
        assertFalse(ValidationUtils.isValidEmail("cliente@"));
    }

    @Test
    void nombreOkTest() {
        assertTrue(ValidationUtils.isValidNombre("Frutas López"));
    }

    @Test
    void nombreTooShortFailTest() {
        assertFalse(ValidationUtils.isValidNombre("A"));
    }

    @Test
    void nombreInvalidSymbolsFailTest() {
        assertFalse(ValidationUtils.isValidNombre("Frutas #1"));
    }

    @Test
    void ciudadOkTest() {
        assertTrue(ValidationUtils.isValidCiudad("La Laguna"));
    }

    @Test
    void ciudadNullOptionalOkTest() {
        assertTrue(ValidationUtils.isValidCiudad(null));
    }

    @Test
    void ciudadWithNumbersFailTest() {
        assertFalse(ValidationUtils.isValidCiudad("Laguna123"));
    }

    @Test
    void codigoProductoOkTest() {
        assertTrue(ValidationUtils.isValidCodigoProducto("FRU-MAN-001"));
    }

    @Test
    void codigoProductoFormatFailTest() {
        assertFalse(ValidationUtils.isValidCodigoProducto("MAN-001"));
    }

    @Test
    void codigoProductoLowercaseFailTest() {
        assertFalse(ValidationUtils.isValidCodigoProducto("fru-man-001"));
    }

    @Test
    void fechaHoraOkTest() {
        assertTrue(ValidationUtils.isValidFechaHora("2026-04-26 10:30:00"));
    }

    @Test
    void fechaHoraWithoutTimeFailTest() {
        assertFalse(ValidationUtils.isValidFechaHora("2026-04-26"));
    }

    @Test
    void fechaHoraWithSlashFailTest() {
        assertFalse(ValidationUtils.isValidFechaHora("26/04/2026 10:30:00"));
    }

    @Test
    void facturaOkTest() {
        assertTrue(ValidationUtils.isValidFactura("FAC-2026-001"));
    }

    @Test
    void facturaFormatFailTest() {
        assertFalse(ValidationUtils.isValidFactura("2026-FAC-001"));
    }

    @Test
    void ticketOkTest() {
        assertTrue(ValidationUtils.isValidTicket("TCK-2026-001"));
    }

    @Test
    void ticketFormatFailTest() {
        assertFalse(ValidationUtils.isValidTicket("TK-2026-001"));
    }

    @Test
    void clienteCompletoOkTest() {
        Cliente cliente = new Cliente("99999999Z", "Cliente Test", "600000000", "cliente@test.com", "Adeje", 1);
        assertTrue(ValidationUtils.isValidCliente(cliente));
    }

    @Test
    void clienteConDniIncorrectoFailTest() {
        Cliente cliente = new Cliente("9999Z", "Cliente Test", "600000000", "cliente@test.com", "Adeje", 1);
        assertFalse(ValidationUtils.isValidCliente(cliente));
    }

    @Test
    void proveedorCompletoOkTest() {
        Proveedor proveedor = new Proveedor("B99999999", "Proveedor Test", "922000000", "proveedor@test.com", "Telde",
                1);
        assertTrue(ValidationUtils.isValidProveedor(proveedor));
    }

    @Test
    void proveedorConCifIncorrectoFailTest() {
        Proveedor proveedor = new Proveedor("99999999B", "Proveedor Test", "922000000", "proveedor@test.com", "Telde",
                1);
        assertFalse(ValidationUtils.isValidProveedor(proveedor));
    }

    @Test
    void productoCompletoOkTest() {
        Producto producto = new Producto(null, "FRU-PER-001", "Pera Conferencia", "kg", 1.0, 2.0, 10.0, 5.0, 1, 1, 1,
                "B12345678");
        assertTrue(ValidationUtils.isValidProducto(producto));
    }

    @Test
    void productoConCodigoIncorrectoFailTest() {
        Producto producto = new Producto(null, "PER-001", "Pera Conferencia", "kg", 1.0, 2.0, 10.0, 5.0, 1, 1, 1,
                "B12345678");
        assertFalse(ValidationUtils.isValidProducto(producto));
    }

    @Test
    void compraCompletaOkTest() {
        Compra compra = new Compra(null, "2026-04-26 10:30:00", "FAC-2026-099", "B12345678", 10.0, 0.7, 10.7,
                "registrada", "Test");
        assertTrue(ValidationUtils.isValidCompra(compra));
    }

    @Test
    void compraConFacturaIncorrectaFailTest() {
        Compra compra = new Compra(null, "2026-04-26 10:30:00", "099-2026", "B12345678", 10.0, 0.7, 10.7, "registrada",
                "Test");
        assertFalse(ValidationUtils.isValidCompra(compra));
    }

    @Test
    void ventaCompletaOkTest() {
        Venta venta = new Venta(null, "2026-04-26 10:30:00", "TCK-2026-099", "11111111A", "tarjeta", 10.0, 0.0, 0.0,
                10.0, "cerrada");
        assertTrue(ValidationUtils.isValidVenta(venta));
    }

    @Test
    void ventaSinClienteOkTest() {
        Venta venta = new Venta(null, "2026-04-26 10:30:00", "TCK-2026-099", null, "efectivo", 10.0, 0.0, 0.0, 10.0,
                "cerrada");
        assertTrue(ValidationUtils.isValidVenta(venta));
    }

    @Test
    void ventaConTicketIncorrectoFailTest() {
        Venta venta = new Venta(null, "2026-04-26 10:30:00", "TICKET-099", "11111111A", "tarjeta", 10.0, 0.0, 0.0, 10.0,
                "cerrada");
        assertFalse(ValidationUtils.isValidVenta(venta));
    }
}
