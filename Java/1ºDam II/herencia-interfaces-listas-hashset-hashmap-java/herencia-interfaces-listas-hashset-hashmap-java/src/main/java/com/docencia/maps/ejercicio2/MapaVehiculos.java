package com.docencia.maps.ejercicio2;

import com.docencia.herencia.ejercicio2.Vehiculo;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link Vehiculo} usando internamente {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaVehiculos {
    private final Map<UUID, Vehiculo> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Vehiculo elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getMarca() == null
                || elemento.getMarca().isBlank() || elemento.getModelo() == null || elemento.getModelo().isBlank()
                || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public Vehiculo buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID vehiculoBuscado : index.keySet()) {
            if (vehiculoBuscado == null) {
                throw new IllegalArgumentException();
            }
            if (vehiculoBuscado.equals(id)) {
                return index.get(vehiculoBuscado);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID vehiculoBuscado : index.keySet()) {
            if (vehiculoBuscado == null) {
                return false;
            }
            if (vehiculoBuscado.equals(id)) {
                index.remove(vehiculoBuscado);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Vehiculo nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Vehiculo existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getMarca() == null
                || nuevoElemento.getMarca().isBlank() || nuevoElemento.getModelo() == null
                || nuevoElemento.getModelo().isBlank()) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<Vehiculo> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
    }

    private void validar(Vehiculo elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El vehiculo no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getMarca() == null || elemento.getMarca().isBlank()) {
            throw new IllegalArgumentException("La marca no puede ser nula o en blanco");
        }
        if (elemento.getModelo() == null || elemento.getModelo().isBlank()) {
            throw new IllegalArgumentException("El modelo no puede ser nulo o en blanco");
        }
    }

}
