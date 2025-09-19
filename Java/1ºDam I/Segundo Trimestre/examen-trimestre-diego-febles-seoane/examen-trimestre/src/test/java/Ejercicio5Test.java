import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.cinco.Inventario;
import es.ies.puerto.cuatro.Producto;


 class Ejercicio5Test {

    private Inventario inventario;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;

    @BeforeEach
    void beforeEach() {

        inventario = new Inventario(3);
        
        producto1 = new Producto(1, "Laptop", 1500.99f, 10);
        producto2 = new Producto(2, "Mouse", 25.75f, 50);
        producto3 = new Producto(3, "Teclado", 45.99f, 30);
        producto4 = new Producto(4, "Monitor", 299.99f, 15);
    }

    @Test
    void testCrearProducto() {
        assertTrue(inventario.crear(producto1), "Debe permitir añadir un producto");
    }

    @Test
    void testCrearProductosHastaLlenarInventario() {
        assertTrue(inventario.crear(producto1));
        assertTrue(inventario.crear(producto2));
        assertTrue(inventario.crear(producto3));
        assertFalse(inventario.crear(producto4), "No debe permitir añadir cuando el inventario está lleno");
    }

    
    @Test
    void testMostrarProductos() {
        inventario.crear(producto1);
        inventario.crear(producto2);
        inventario.crear(producto3);

        String resultado = inventario.toString();
        assertTrue(resultado.contains("Laptop"), "El resultado debería contener el nombre del producto 'Laptop'");
        assertTrue(resultado.contains("Mouse"), "El resultado debería contener el nombre del producto 'Mouse'");
        assertTrue(resultado.contains("Teclado"), "El resultado debería contener el nombre del producto 'Teclado'");
    
    }

    @Test
    void testActualizarProducto() {
        inventario.crear(producto1);
        Producto productoActualizado = new Producto(1, "Laptop Actualizada", 1200.99f, 8);
        assertTrue(inventario.actualizar(productoActualizado), "Debe actualizar el producto existente");
    }


    @Test
    void testActualizarProductoInexistente() {
        inventario.crear(producto1);
        assertFalse(inventario.actualizar(producto2), "No debe actualizar un producto que no existe en el inventario");
    }

    @Test
    void testEliminarUltimoProducto() {
        inventario.crear(producto1);
        inventario.crear(producto2);
        inventario.crear(producto3);
        assertTrue(inventario.eliminar(), "Debe eliminar el último producto añadido");
        assertEquals(2, inventario.getNumeroProductos(), "El inventario debe tener 2 productos después de la eliminación");
    }


    @Test
    void testEliminarProductoEnInventarioVacio() {
        assertFalse(inventario.eliminar(), "No debe permitir eliminar de un inventario vacío");
    }

    @Test
    void testBuscarProductoExistente() {
        inventario.crear(producto1);
        inventario.crear(producto2);
        assertTrue(inventario.buscarProducto(producto1), "Debe encontrar el producto en el inventario");
    }

    @Test
    void testBuscarProductoInexistente() {
        inventario.crear(producto1);
        assertFalse(inventario.buscarProducto(producto3), "No debe encontrar un producto que no existe en el inventario");
    }

    @Test
    void testOperacionesCRUD() {
        assertTrue(inventario.crear(producto1), "Debe añadir producto1");
        assertTrue(inventario.crear(producto2), "Debe añadir producto2");
        assertTrue(inventario.buscarProducto(producto2), "Debe encontrar producto2");
        
        inventario.eliminar();
        assertFalse(inventario.buscarProducto(producto2), "producto2 ya no debería estar en el inventario tras eliminar");
        
        Producto productoActualizado = new Producto(1, "Laptop Pro", 1700.99f, 7);
        assertTrue(inventario.actualizar(productoActualizado), "Debe actualizar producto1");
        
        assertTrue(inventario.buscarProducto(productoActualizado), "Debe encontrar la versión actualizada de producto1");
    }
    
}
