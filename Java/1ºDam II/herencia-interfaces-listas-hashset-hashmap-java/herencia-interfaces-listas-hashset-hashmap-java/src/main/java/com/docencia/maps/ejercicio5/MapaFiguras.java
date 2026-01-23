package com.docencia.maps.ejercicio5;

import com.docencia.herencia.ejercicio5.Figura;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link Figura} usando internamente {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaFiguras {
    private final Map<UUID, Figura> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Figura elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getColor() == null
                || elemento.getColor().isBlank() || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public Figura buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID figuraBuscada : index.keySet()) {
            if (figuraBuscada == null) {
                throw new IllegalArgumentException();
            }
            if (figuraBuscada.equals(id)) {
                return index.get(figuraBuscada);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID figuraBuscada : index.keySet()) {
            if (figuraBuscada == null) {
                return false;
            }
            if (figuraBuscada.equals(id)) {
                index.remove(figuraBuscada);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Figura nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Figura existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getColor() == null
                || nuevoElemento.getColor().isBlank()) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<Figura> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
    }

    private void validar(Figura elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("La figura no puede ser nula");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getColor() == null || elemento.getColor().isBlank()) {
            throw new IllegalArgumentException("El color no puede ser nulo o en blanco");
        }
    }

}
