package com.docencia.sets.ejercicio7;

import com.docencia.herencia.ejercicio7.Dispositivo;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Dispositivo} usando internamente
 * {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoDispositivos {

    private final Set<Dispositivo> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Dispositivo elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getFabricante() == null
                || elemento.getFabricante().isBlank()
                || set.stream().anyMatch(d -> d.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public Dispositivo buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Dispositivo dispositivo : set) {
            if (dispositivo == null) {
                throw new IllegalArgumentException();
            }
            if (dispositivo.getId().equals(id)) {
                return dispositivo;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Dispositivo dispositivo : set) {
            if (dispositivo == null) {
                return false;
            }
            if (dispositivo.getId().equals(id)) {
                set.remove(dispositivo);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Dispositivo nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Dispositivo existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getFabricante() == null
                || nuevoElemento.getFabricante().isBlank()) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<Dispositivo> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
    }

    private void validar(Dispositivo elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El dispositivo no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getFabricante() == null || elemento.getFabricante().isBlank()) {
            throw new IllegalArgumentException("El fabricante no puede ser nulo o en blanco");
        }
    }

}
