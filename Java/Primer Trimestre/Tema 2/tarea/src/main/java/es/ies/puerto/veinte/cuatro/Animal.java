package es.ies.puerto.veinte.cuatro;
import java.util.Objects;

public class Animal {
    private String animal;
    private String especie;

    public Animal(String animal, String especie) {
        this.animal = animal;
        this.especie = especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Animal especie(String especie) {
        setEspecie(especie);
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal, especie);
    }
    public Animal() {
    }

    public Animal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return this.animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Animal animal(String animal) {
        setAnimal(animal);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(animal, animal.animal);
    }

    @Override
    public String toString() {
        return "{" +
            " animal='" + getAnimal() + "'" +
            "}";
    }
    
   
}
