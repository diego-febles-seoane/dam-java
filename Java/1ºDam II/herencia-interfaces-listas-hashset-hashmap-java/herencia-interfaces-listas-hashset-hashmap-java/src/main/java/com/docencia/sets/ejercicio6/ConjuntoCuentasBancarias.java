package com.docencia.sets.ejercicio6;

import com.docencia.herencia.ejercicio6.CuentaBancaria;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona un conjunto de {@link CuentaBancaria} usando internamente
 * {@link HashSet}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten elementos con campos "vacios" segun la validacion del
 * ejercicio.
 * - No se permiten ids nulos ni duplicados.
 */
public class ConjuntoCuentasBancarias {

    private final Set<CuentaBancaria> set = new HashSet<>();

    /** Anad... un elemento a la coleccion. */
    public void anadir(CuentaBancaria elemento) {
        if (elemento == null || elemento.getId() == null || elemento.getTitular() == null
                || elemento.getTitular().isBlank() || elemento.getSaldo() < 0
                || set.stream().anyMatch(c -> c.getId().equals(elemento.getId()))) {
            throw new IllegalArgumentException();
        }
        set.add(elemento);
    }

    /** Busca por id. */
    public CuentaBancaria buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (CuentaBancaria cuenta : set) {
            if (cuenta == null) {
                throw new IllegalArgumentException();
            }
            if (cuenta.getId().equals(id)) {
                return cuenta;
            }
        }
        return null;
    }

    /** Elimina por id. */
    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (CuentaBancaria cuenta : set) {
            if (cuenta == null) {
                return false;
            }
            if (cuenta.getId().equals(id)) {
                set.remove(cuenta);
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
        set.remove(existente);
        set.add(nuevoElemento);
    }

    /** Devuelve una copia inmutable del conjunto. */
    public Set<CuentaBancaria> listar() {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet<>(set));
    }

    public int tamanio() {
        return set.size();
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
