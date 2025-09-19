package es.ies.puerto.set;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.Animal;

public class AnimalSet {
    private Set<Animal> animales;

    public AnimalSet() {
        this.animales = new HashSet<>();
    }

    public boolean agregar(Animal animal) {
        if (!animales.contains(animal)) {
            return animales.add(animal);
        } else {
            return false;
        }
    }

    public Set<Animal> listarAnimales() {
        return new HashSet(animales);
    }

    public Animal buscar(String identificador) {
        for (Animal animal : animales){
            if (animal.getIdentificador().equals(identificador)){
                return animal;
            }
        }
        return null;
    }

    public boolean actualizar(String identificador, Animal nuevoAnimal) {
        Animal animalExistente = buscar(identificador);
        if (animalExistente != null){
            eliminar(identificador);
            return agregar(nuevoAnimal);
        }
        return false;
    }

    public boolean eliminar(String identificador) {
        Animal animalEliminar = new Animal(identificador);
        return animales.remove(animalEliminar);
    }
}
