package com.docencia.maps.ejercicio6;

import com.docencia.herencia.ejercicio6.CuentaBancaria;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un mapa de {@link CuentaBancaria} usando internamente
 * {@link HashMap}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class MapaCuentasBancarias {
    private final Map<UUID, CuentaBancaria> index = new HashMap<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(CuentaBancaria elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getTitular() == null
                || elemento.getTitular().isBlank() || elemento.getSaldo() < 0 || index.containsKey(elemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.put(elemento.getId(), elemento);
    }

    /** Busca por id. */
    public CuentaBancaria buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID cuentaBuscada : index.keySet()) {
            if (cuentaBuscada == null) {
                throw new IllegalArgumentException();
            }
            if (cuentaBuscada.equals(id)) {
                return index.get(cuentaBuscada);
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (UUID cuentaBuscada : index.keySet()) {
            if (cuentaBuscada == null) {
                return false;
            }
            if (cuentaBuscada.equals(id)) {
                index.remove(cuentaBuscada);
                return true;
            }
        }
        return false;
    }

    /** Reemplaza el elemento con ese id por otro (mismo id). */
    public void modificar(UUID id, CuentaBancaria nuevoElemento) {
        if (id == null || nuevoElemento == null) {
            throw new IllegalArgumentException();
        }
        CuentaBancaria existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (nuevoElemento.getId() == null || nuevoElemento.getTitular() == null
                || nuevoElemento.getTitular().isBlank() || nuevoElemento.getSaldo() < 0) {
            throw new IllegalArgumentException();
        }
        if (!id.equals(nuevoElemento.getId())) {
            throw new IllegalArgumentException();
        }
        index.remove(existente.getId());
        index.put(id, nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public java.util.Set<CuentaBancaria> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(index.values()));
    }

    public int tamanio() {
        return index.size();
    }

    private void validar(CuentaBancaria elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("La cuenta no puede ser nula");
        }
        if (elemento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (elemento.getTitular() == null || elemento.getTitular().isBlank()) {
            throw new IllegalArgumentException("El titular no puede ser nulo o en blanco");
        }
        if (elemento.getSaldo() < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }

}
