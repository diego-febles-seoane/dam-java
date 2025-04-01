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
        if (animal == null){
            return false;
        }
        if (!animales.contains(animal)){
            return animales.add(animal);
        } else {
            return false;
        }
    }

    public List<Animal> listar() {
        return new ArrayList<>(animales);
    }

    public Animal buscar(String identificador) {
        if (identificador == null || identificador.isEmpty()){
            return null;
        }
        Animal animalBuscado = new Animal(identificador);
        int posicion = animales.indexOf(animalBuscado);
        if (posicion < 0){
            return null;
        } else{
            return animales.get(posicion);
        }
    }

    public boolean actualizar(String identificador, Animal nuevoAnimal) {
        if (identificador == null || identificador.isEmpty()){
            return false;
        }
        if (nuevoAnimal == null){
            return false;
        }
        Animal animalBuscar =buscar(identificador);
        int posicion = animales.indexOf(animalBuscar);
        if (posicion < 0) {
            return false;
        }
        animales.set(posicion, nuevoAnimal);
        return true;
    }

    public boolean eliminar(String identificador) {
        if (identificador == null || identificador.isEmpty()){
            return false;
        }
        Animal animalAEliminar = new Animal(identificador);
        return animales.remove(animalAEliminar);
    }

}
