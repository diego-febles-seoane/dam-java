package com.docencia.maps.ejercicio8;

import com.docencia.herencia.ejercicio8.Pago;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link Pago} usando internamente {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaPagos {
    private final Map<UUID, Pago> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(Pago elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getImporte() <= 0
                || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public Pago buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID pagoBuscado : index.keySet()) {
            if (pagoBuscado == null) {
                throw new IllegalArgumentException();
            }
            if (pagoBuscado.equals(id)) {
                return index.get(pagoBuscado);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID pagoBuscado : index.keySet()) {
            if (pagoBuscado == null) {
                return false;
            }
            if (pagoBuscado.equals(id)) {
                index.remove(pagoBuscado);
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
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<Pago> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
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
