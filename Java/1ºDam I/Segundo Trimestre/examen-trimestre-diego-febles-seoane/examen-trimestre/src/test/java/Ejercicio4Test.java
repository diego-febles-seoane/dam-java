import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import es.ies.puerto.cuatro.Producto;


class Ejercicio4Test {

@Test
    void testActualizarStockAumentar() {
        Producto producto = new Producto(1, "Laptop", 1200.00f, 10);
        producto.actualizarStock(5);
        assertEquals(15, producto.getStock(), "El stock debería ser 15 después de agregar 5 unidades");
    }

    @Test
    void testActualizarStockDisminuir() {
        Producto producto = new Producto(2, "Teclado", 50.00f, 20);
        producto.actualizarStock(-5);
        assertEquals(15, producto.getStock(), "El stock debería ser 15 después de disminuir 5 unidades");
    }

    @Test
    void testActualizarStockDisminuirHastaCero() {
        Producto producto = new Producto(3, "Monitor", 200.00f, 8);
        producto.actualizarStock(-8);
        assertEquals(0, producto.getStock(), "El stock debería ser 0 después de disminuir 8 unidades");
    }

    @Test
    void testActualizarStockDisminuirMasDeLoDisponible() {
        Producto producto = new Producto(4, "Mouse", 25.00f, 3);
        producto.actualizarStock(-5);
        assertEquals(0, producto.getStock(), "El stock debería ser 0 cuando se intenta disminuir más de lo disponible");
    }

    @Test
    void testActualizarStockConCero() {
        Producto producto = new Producto(5, "Impresora", 150.00f, 10);
        producto.actualizarStock(0);
        assertEquals(10, producto.getStock(), "El stock debería mantenerse en 10 cuando se actualiza con 0");
    }

    @Test
    void testCrearProductoYVerificarAtributos() {
        Producto producto = new Producto(6, "Tablet", 300.00f, 25);
        assertEquals(6, producto.getId(), "El ID debería ser 6");
        assertEquals("Tablet", producto.getNombre(), "El nombre debería ser 'Tablet'");
        assertEquals(300.00f, producto.getPrecio(), 0.01, "El precio debería ser 300.00");
        assertEquals(25, producto.getStock(), "El stock debería ser 25");
    }

    @Test
    public void testProductosIguales() {
        Producto producto1 = new Producto(1, "Laptop", 1000.0f, 10);
        Producto producto2 = new Producto(1, "Laptop", 1000.0f, 10);
        
        assertEquals(producto1, producto2, "Los productos deberían ser iguales");
    }

    @Test
    public void testProductosDiferentesId() {
        Producto producto1 = new Producto(1, "Laptop", 1000.0f, 10);
        Producto producto2 = new Producto(2, "Laptop", 1000.0f, 10);
        
        assertNotEquals(producto1, producto2, "Los productos no deberían ser iguales si el ID es diferente");
    }

    @Test
    public void testProductosDiferentesNombre() {
        Producto producto1 = new Producto(1, "Laptop", 1000.0f, 10);
        Producto producto2 = new Producto(1, "Tablet", 1000.0f, 10);
        
        assertEquals(producto1, producto2, "Los productos no deberían ser iguales si el nombre es diferente");
    }

    @Test
    public void testProductosDiferentesPrecio() {
        Producto producto1 = new Producto(1, "Laptop", 1000.0f, 10);
        Producto producto2 = new Producto(1, "Laptop", 1200.0f, 10);
        
        assertEquals(producto1, producto2, "Los productos no deberían ser iguales si el precio es diferente");
    }

    @Test
    public void testProductosDiferentesStock() {
        Producto producto1 = new Producto(1, "Laptop", 1000.0f, 10);
        Producto producto2 = new Producto(1, "Laptop", 1000.0f, 5);
        
        assertEquals(producto1, producto2, "Los productos no deberían ser iguales si el stock es diferente");
    }

    @Test
    public void testProductoIgualASiMismo() {
        Producto producto = new Producto(1, "Laptop", 1000.0f, 10);
        
        assertEquals(producto, producto, "Un producto debería ser igual a sí mismo");
    }

    @Test
    public void testProductoConNull() {
        Producto producto = new Producto(1, "Laptop", 1000.0f, 10);
        
        assertNotEquals(producto, null, "Un producto no debería ser igual a null");
    }
    
}
