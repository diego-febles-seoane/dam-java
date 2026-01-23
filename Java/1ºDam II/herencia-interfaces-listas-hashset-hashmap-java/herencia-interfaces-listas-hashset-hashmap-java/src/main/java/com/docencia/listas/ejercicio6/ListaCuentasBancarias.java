package com.docencia.listas.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio6.CuentaBancaria;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link CuentaBancaria} usando
 * {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten cuentas con titular nulo o en blanco.
 * - No se permiten saldos negativos.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaCuentasBancarias {

    private final List<CuentaBancaria> cuentas = new ArrayList<>();

    public void anadir(CuentaBancaria cuenta) {
        validar(cuenta);
        if (existeId(cuenta.getId())) {
            throw new IllegalArgumentException("La cuenta ya existe");
        }
        cuentas.add(cuenta);
    }

    public CuentaBancaria buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        for (CuentaBancaria cuentaBancaria : cuentas) {
            if (cuentaBancaria.getId().equals(id)) {
                return cuentaBancaria;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        return cuentas.removeIf(cuenta -> cuenta.getId().equals(id));
    }

    public void modificar(UUID id, CuentaBancaria nuevaCuenta) {
        validar(nuevaCuenta);
        CuentaBancaria existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException("El id no existe");
        }
        if (!id.equals(nuevaCuenta.getId())) {
            throw new IllegalArgumentException("El ide debe ser el mismo");
        }
        int indice = cuentas.indexOf(existente);
        cuentas.set(indice, nuevaCuenta);
    }

    public List<CuentaBancaria> listar() {
        return List.copyOf(cuentas);
    }

    public int tamanio() {
        return cuentas.size();
    }

    private boolean existeId(UUID id) {
        return cuentas.stream().anyMatch(c -> c.getId().equals(id));
    }

    private void validar(CuentaBancaria cuenta) {
        if (cuenta == null) {
            throw new IllegalArgumentException("La cuenta no puede ser nula");
        }
        if (cuenta.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (cuenta.getTitular() == null || cuenta.getTitular().isBlank()) {
            throw new IllegalArgumentException("El titular no puede ser nulo o en blanco");
        }
        if (cuenta.getSaldo() < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }
}
