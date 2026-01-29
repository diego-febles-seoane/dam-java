package com.docencia.sets.ejercicio3;

import com.docencia.herencia.ejercicio3.Empleado;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Empleado} usando internamente {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoEmpleados {

    private final Set<Empleado> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Empleado elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getNombre() == null
                || elemento.getNombre().isBlank() || elemento.getSalarioBase() < 0
                || set.stream().anyMatch(e -> e.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public Empleado buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Empleado empleado : set) {
            if (empleado == null) {
                throw new IllegalArgumentException();
            }
            if (empleado.getId().equals(id)) {
                return empleado;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Empleado empleado : set) {
            if (empleado == null) {
                return false;
            }
            if (empleado.getId().equals(id)) {
                set.remove(empleado);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Empleado nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Empleado existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getNombre() == null
                || nuevoElemento.getNombre().isBlank() || nuevoElemento.getSalarioBase() < 0) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<Empleado> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
    }

    private void validar(Empleado elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getNombre() == null || elemento.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
        if (elemento.getSalarioBase() < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo");
        }
    }

}
