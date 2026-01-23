package com.docencia.sets.ejercicio8;

import com.docencia.herencia.ejercicio8.Pago;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link Pago} usando internamente {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoPagos {

    private final Set<Pago> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Pago elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getImporte() <= 0
                || set.stream().anyMatch(p -> p.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public Pago buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Pago pago : set) {
            if (pago == null) {
                throw new IllegalArgumentException();
            }
            if (pago.getId().equals(id)) {
                return pago;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Pago pago : set) {
            if (pago == null) {
                return false;
            }
            if (pago.getId().equals(id)) {
                set.remove(pago);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, Pago nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        Pago existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getImporte() <= 0) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<Pago> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
    }

    private void validar(Pago elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El pago no puede ser nulo");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getImporte() <= 0) {
            throw new IllegalArgumentException("El importe debe ser mayor que cero");
        }
    }

}
