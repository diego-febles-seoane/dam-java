package com.docencia.maps.ejercicio10;

import com.docencia.herencia.ejercicio10.Documento;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link Documento} usando internamente {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaDocumentos {
    private final Map<UUID, Documento> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Documento elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getTitulo() == null
                || elemento.getTitulo().isBlank() || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public Documento buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID documentoBuscado : index.keySet()) {
            if (documentoBuscado == null) {
                throw new IllegalArgumentException();
            }
            if (documentoBuscado.equals(id)) {
                return index.get(documentoBuscado);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID documentoBuscado : index.keySet()) {
            if (documentoBuscado == null) {
                return false;
            }
            if (documentoBuscado.equals(id)) {
                index.remove(documentoBuscado);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Documento nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Documento existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getTitulo() == null
                || nuevoElemento.getTitulo().isBlank()) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<Documento> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
    }

    private void validar(Documento elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El documento no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getTitulo() == null || elemento.getTitulo().isBlank()) {
            throw new IllegalArgumentException("El titulo no puede ser nulo o en blanco");
        }
    }

}
