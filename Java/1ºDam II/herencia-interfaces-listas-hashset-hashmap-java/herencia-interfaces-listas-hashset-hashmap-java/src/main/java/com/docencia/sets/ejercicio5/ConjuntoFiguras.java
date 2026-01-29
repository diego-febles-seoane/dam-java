package com.docencia.sets.ejercicio5;

import com.docencia.herencia.ejercicio5.Figura;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Figura} usando internamente {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoFiguras {

    private final Set<Figura> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Figura elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getColor() == null
                || elemento.getColor().isBlank() || set.stream().anyMatch(f -> f.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public Figura buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Figura figura : set) {
            if (figura == null) {
                throw new IllegalArgumentException();
            }
            if (figura.getId().equals(id)) {
                return figura;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Figura figura : set) {
            if (figura == null) {
                return false;
            }
            if (figura.getId().equals(id)) {
                set.remove(figura);
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
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<Figura> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
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
