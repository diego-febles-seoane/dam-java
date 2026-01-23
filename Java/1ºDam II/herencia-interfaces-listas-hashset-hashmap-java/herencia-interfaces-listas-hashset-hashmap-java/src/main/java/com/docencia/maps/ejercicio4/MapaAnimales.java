package com.docencia.maps.ejercicio4;

import com.docencia.herencia.ejercicio4.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link Animal} usando internamente {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaAnimales {
    private final Map<UUID, Animal> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Animal elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getNombre() == null
                || elemento.getNombre().isBlank() || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public Animal buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID animalBuscado : index.keySet()) {
            if (animalBuscado == null) {
                throw new IllegalArgumentException();
            }
            if (animalBuscado.equals(id)) {
                return index.get(animalBuscado);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID animalBuscado : index.keySet()) {
            if (animalBuscado == null) {
                return false;
            }
            if (animalBuscado.equals(id)) {
                index.remove(animalBuscado);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Animal nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Animal existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getNombre() == null
                || nuevoElemento.getNombre().isBlank()) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<Animal> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
    }

    private void validar(Animal elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El animal no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getNombre() == null || elemento.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
    }

}
