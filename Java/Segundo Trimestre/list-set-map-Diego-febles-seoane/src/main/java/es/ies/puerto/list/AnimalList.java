package es.ies.puerto.list;

import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.Animal;

public class AnimalList {
    private List<Animal> animales;

    public AnimalList() {
        this.animales = new ArrayList<>();
    }

    public boolean agregar(Animal animal) {
        if (!animales.contains(animal)) {
            return animales.add(animal);
        } else {
            return false;
        }
    }

    public List<Animal> listar() {
        return new ArrayList<>(animales);
    }

    public Animal buscar(String identificador) {
        Animal animalBuscar = new Animal(identificador);
        int posicion = animales.indexOf(animalBuscar);
        if (posicion < 0) {
            return null;
        } else {
            return animales.get(posicion);
        }    
    }

    public boolean actualizar(String identificador, Animal nuevoAnimal) {
        Animal animalBuscar = new Animal(identificador);
        int posicion = animales.indexOf(animalBuscar);
        if (posicion < 0) {
            return false;
        }
        animales.set(posicion, nuevoAnimal);
        return true;
    }

    public boolean eliminar(String identificador) {
        Animal animalEliminar = new Animal(identificador);
        return animales.remove(animalEliminar);
    }

}
