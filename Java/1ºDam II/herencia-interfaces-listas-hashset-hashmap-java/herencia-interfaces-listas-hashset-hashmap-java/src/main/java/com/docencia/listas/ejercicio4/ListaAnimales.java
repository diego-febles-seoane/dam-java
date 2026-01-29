package com.docencia.listas.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio4.Animal;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link Animal} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten animales con nombre nulo o en blanco.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaAnimales {

    private final List<Animal> animales = new ArrayList<>();

    public void anadir(Animal animal) {
        validar(animal);
        if (animales.contains(buscarPorId(animal.getId()))) {
            throw new IllegalArgumentException("El animal ya existe");
        }
        animales.add(animal);
    }

    public Animal buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id no puede ser null");
        }
        for (Animal animal : animales) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Si lees esto copie el ej del github de sebas");
        }
        return animales.removeIf(animal -> animal.getId().equals(id));
    }

    public void modificar(UUID id, Animal nuevoAnimal) {
        validar(nuevoAnimal);
        Animal existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException("El Id no existe");
        }
        if (!id.equals(nuevoAnimal.getId())) {
            throw new IllegalArgumentException();
        }
        int indice = animales.indexOf(existente);
        animales.set(indice, nuevoAnimal);
    }

    public List<Animal> listar() {
        return List.copyOf(animales);
    }

    public int tamanio() {
        return animales.size();
    }

    private boolean existeId(UUID id) {
        return animales.stream().anyMatch(a -> a.getId().equals(id));
    }

    private void validar(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("El animal no puede ser nulo");
        }
        if (animal.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (animal.getNombre() == null || animal.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
    }
}
