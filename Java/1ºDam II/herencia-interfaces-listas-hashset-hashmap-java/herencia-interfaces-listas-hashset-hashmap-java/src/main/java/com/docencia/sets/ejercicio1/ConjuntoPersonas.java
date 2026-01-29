package com.docencia.sets.ejercicio1;

import com.docencia.herencia.ejercicio1.Persona;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Persona} usando internamente {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoPersonas {

    private final Set<Persona> set = new HashSet<>();

    /**
     * Anad... un elemento a la coleccion.
     */
    public void anadir(Persona elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getNombre() == null
                || elemento.getEdad() <= 0 || elemento.getNombre().isBlank()
                || set.contains(buscarPorId(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /**
     * Busca por id.
     */
    public Persona buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Persona personaBuscada : set) {
            if (personaBuscada.getId().equals(id)) {
                return personaBuscada;
            }
        }
        return null;
    }

    /**
     * Elimina por id.
     */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            return false;
        }
        for (Persona personaEliminar : set) {
            if (personaEliminar.getId().equals(id)) {
                set.remove(personaEliminar);
                return true;
            }
        }
        return false;
    }

    /**
     * Reemplaza el elemento con ese id por otro (mismo id).
     */
    public void modificar(UUID id, Persona nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Persona existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getNombre() == null
                || nuevoElemento.getEdad() <= 0 || nuevoElemento.getNombre().isBlank()) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /**
     * Devuelve una copia inmutable del conjunto.
     */
    public Set<Persona> listar() {
        return Set.copyOf(set);
    }

    public int tamanio() {
        return set.size();
    }

    private void validar(Persona elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("La persona no puede ser nula");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getNombre() == null || elemento.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
        if (elemento.getEdad() < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

}
