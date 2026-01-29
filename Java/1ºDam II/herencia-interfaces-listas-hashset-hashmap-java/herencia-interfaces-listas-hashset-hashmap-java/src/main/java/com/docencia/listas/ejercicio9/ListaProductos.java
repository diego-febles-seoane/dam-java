package com.docencia.listas.ejercicio9;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio9.Producto;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link Producto} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten productos con nombre nulo o en blanco.
 * - No se permiten precios negativos.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaProductos {

    private final List<Producto> productos = new ArrayList<>();

    public void anadir(Producto producto) {
        validar(producto);
        if (existeId(producto.getId())) {
            throw new IllegalArgumentException("Ya existe dicho producto");
        }
        productos.add(producto);
    }

    public Producto buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("id nulo");
        }
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El ide no puede ser nulo");
        }
        return productos.removeIf(prod -> prod.getId().equals(id));
    }

    public void modificar(UUID id, Producto nuevoProducto) {
        validar(nuevoProducto);
        Producto existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException("No existe");
        }
        if (!id.equals(nuevoProducto.getId())) {
            throw new IllegalArgumentException("id debe ser igual");
        }
        int indice = productos.indexOf(existente);
        productos.set(indice, nuevoProducto);
    }

    public List<Producto> listar() {
        return List.copyOf(productos);
    }

    public int tamanio() {
        return productos.size();
    }

    private boolean existeId(UUID id) {
        return productos.stream().anyMatch(p -> p.getId().equals(id));
    }

    private void validar(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        if (producto.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (producto.getNombre() == null || producto.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
        if (producto.getPrecio() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }
}
