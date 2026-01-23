package com.docencia.sets.ejercicio10;

import com.docencia.herencia.ejercicio10.Documento;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Documento} usando internamente
 * {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoDocumentos {

    private final Set<Documento> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Documento elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getTitulo() == null
                || elemento.getTitulo().isBlank() || set.stream().anyMatch(d -> d.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public Documento buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Documento documento : set) {
            if (documento == null) {
                throw new IllegalArgumentException();
            }
            if (documento.getId().equals(id)) {
                return documento;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Documento documento : set) {
            if (documento == null) {
                return false;
            }
            if (documento.getId().equals(id)) {
                set.remove(documento);
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
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<Documento> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
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
