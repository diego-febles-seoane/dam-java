package com.docencia.maps.ejercicio7;

import com.docencia.herencia.ejercicio7.Dispositivo;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link Dispositivo} usando internamente {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaDispositivos {
    private final Map<UUID, Dispositivo> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Dispositivo elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getFabricante() == null
                || elemento.getFabricante().isBlank() || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public Dispositivo buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID dispositivoBuscado : index.keySet()) {
            if (dispositivoBuscado == null) {
                throw new IllegalArgumentException();
            }
            if (dispositivoBuscado.equals(id)) {
                return index.get(dispositivoBuscado);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID dispositivoBuscado : index.keySet()) {
            if (dispositivoBuscado == null) {
                return false;
            }
            if (dispositivoBuscado.equals(id)) {
                index.remove(dispositivoBuscado);
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
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<Dispositivo> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
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
