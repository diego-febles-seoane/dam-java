package com.docencia.sets.ejercicio9;

import com.docencia.herencia.ejercicio9.Producto;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Producto} usando internamente {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoProductos {

    private final Set<Producto> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Producto elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getNombre() == null
                || elemento.getNombre().isBlank() || elemento.getPrecio() < 0
                || set.stream().anyMatch(pr -> pr.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public Producto buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Producto producto : set) {
            if (producto == null) {
                throw new IllegalArgumentException();
            }
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Producto producto : set) {
            if (producto == null) {
                return false;
            }
            if (producto.getId().equals(id)) {
                set.remove(producto);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Producto nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Producto existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getNombre() == null
                || nuevoElemento.getNombre().isBlank() || nuevoElemento.getPrecio() < 0) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<Producto> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
    }

    private void validar(Producto elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getNombre() == null || elemento.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
        if (elemento.getPrecio() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

}
