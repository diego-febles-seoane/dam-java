package com.ejemplo.validation;

import com.ejemplo.model.Cliente;
import com.ejemplo.model.Compra;
import com.ejemplo.model.Producto;
import com.ejemplo.model.Proveedor;
import com.ejemplo.model.Venta;

public final class ValidationUtils {

    private ValidationUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidDni(String dni) {
        return dni != null && dni.matches("^[0-9]{8}[A-Za-z]$");
    }

    public static boolean isValidOptionalDni(String dni) {
        return dni == null || isValidDni(dni);
    }

    public static boolean isValidCif(String cif) {
        return cif != null && cif.matches("^[A-Z0-9]{9}$");
    }

    public static boolean isValidTelefono(String telefono) {
        return telefono != null && telefono.matches("^[0-9]{9}$");
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public static boolean isValidNombre(String nombre) {
        return !isBlank(nombre) && nombre.length() >= 2;
    }

    public static boolean isValidCiudad(String ciudad) {
        return !isBlank(ciudad) && ciudad.length() >= 2;
    }

    public static boolean isValidCodigoProducto(String codigo) {
        return codigo != null && codigo.matches("^[A-Z0-9]{3,10}$");
    }

    public static boolean isValidFechaHora(String fecha) {
        return fecha != null && fecha.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$");
    }

    public static boolean isValidFactura(String factura) {
        return factura != null && factura.matches("^FAC-[0-9]{4}-[0-9]{3}$");
    }

    public static boolean isValidTicket(String ticket) {
        return ticket != null && ticket.matches("^TCK-[0-9]{4}-[0-9]{3}$");
    }

    public static boolean isPositive(Integer value) {
        return value != null && value > 0;
    }

    public static boolean isNonNegative(Double value) {
        return value != null && value >= 0;
    }

    public static boolean isPositive(Double value) {
        return value != null && value > 0;
    }

    public static boolean isBooleanInteger(Integer value) {
        return value != null && (value == 0 || value == 1);
    }

    public static boolean isValidCliente(Cliente cliente) {
        if (cliente == null) {
            return false;
        }
        return isValidDni(cliente.getDni())
                && isValidNombre(cliente.getNombre())
                && isValidTelefono(cliente.getTelefono())
                && isValidEmail(cliente.getEmail())
                && isValidCiudad(cliente.getCiudad());
    }

    public static boolean isValidProveedor(Proveedor proveedor) {
        if (proveedor == null) {
            return false;
        }
        return isValidCif(proveedor.getCif())
                && isValidNombre(proveedor.getNombre())
                && isValidTelefono(proveedor.getTelefono())
                && isValidEmail(proveedor.getEmail())
                && isValidCiudad(proveedor.getCiudad())
                && isBooleanInteger(proveedor.getActivo());
    }

    public static boolean isValidProducto(Producto producto) {
        if (producto == null) {
            return false;
        }
        return isValidCodigoProducto(producto.getCodigo())
                && isValidNombre(producto.getNombre())
                && !isBlank(producto.getUnidadMedida())
                && isPositive(producto.getPrecioCompra())
                && isPositive(producto.getPrecioVenta())
                && isNonNegative(producto.getStockActual())
                && isNonNegative(producto.getStockMinimo())
                && isBooleanInteger(producto.getPerecedero())
                && isBooleanInteger(producto.getActivo())
                && isPositive(producto.getIdCategoria())
                && (producto.getCifProveedorPrincipal() == null || isValidCif(producto.getCifProveedorPrincipal()));
    }

    public static boolean isValidCompra(Compra compra) {
        if (compra == null) {
            return false;
        }
        return isValidFechaHora(compra.getFecha())
                && isValidFactura(compra.getNumeroFactura())
                && isValidCif(compra.getCifProveedor())
                && isNonNegative(compra.getSubtotal())
                && isNonNegative(compra.getIva())
                && isNonNegative(compra.getTotal())
                && !isBlank(compra.getEstado())
                && !isBlank(compra.getObservaciones());
    }

    public static boolean isValidVenta(Venta venta) {
        if (venta == null) {
            return false;
        }
        return isValidFechaHora(venta.getFecha())
                && isValidTicket(venta.getTicket())
                && isValidOptionalDni(venta.getDniCliente())
                && !isBlank(venta.getMetodoPago())
                && isNonNegative(venta.getSubtotal())
                && isNonNegative(venta.getDescuentoTotal())
                && isNonNegative(venta.getIva())
                && isNonNegative(venta.getTotal())
                && !isBlank(venta.getEstado());
    }
}
