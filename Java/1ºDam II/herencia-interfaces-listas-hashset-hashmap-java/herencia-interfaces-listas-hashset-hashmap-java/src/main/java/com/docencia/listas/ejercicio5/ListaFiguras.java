package com.docencia.listas.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio5.Figura;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link Figura} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten figuras con color nulo o en blanco.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaFiguras {

    private final List<Figura> figuras = new ArrayList<>();

    public void anadir(Figura figura) {
        validar(figura);
        if (existeId(figura.getId())) {
            throw new IllegalArgumentException("Esa figura ya existe");
        }
        figuras.add(figura);
    }

    public Figura buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id no puede ser nulo");
        }
        for (Figura figura : figuras) {
            if (figura.getId().equals(id)) {
                return figura;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id no puede ser nulo");
        }
        return figuras.removeIf(figura -> figura.getId().equals(id));
    }

    public void modificar(UUID id, Figura nuevaFigura) {
        validar(nuevaFigura);
        Figura existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException("No existe la figura");
        }
        if (!id.equals(nuevaFigura.getId())) {
            throw new IllegalArgumentException("La figura debe tener el mismo id");
        }
        int indice = figuras.indexOf(existente);
        figuras.set(indice, nuevaFigura);
    }

    public List<Figura> listar() {
        return List.copyOf(figuras);
    }

    public int tamanio() {
        return figuras.size();
    }

    private boolean existeId(UUID id) {
        return figuras.stream().anyMatch(f -> f.getId().equals(id));
    }

    private void validar(Figura figura) {
        if (figura == null) {
            throw new IllegalArgumentException("La figura no puede ser nula");
        }
        if (figura.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (figura.getColor() == null || figura.getColor().isBlank()) {
            throw new IllegalArgumentException("El color no puede ser nulo o en blanco");
        }
    }
}
