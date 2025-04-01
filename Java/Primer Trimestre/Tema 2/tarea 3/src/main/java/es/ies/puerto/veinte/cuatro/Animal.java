package es.ies.puerto.veinte.cuatro;
import java.util.Objects;

public class Animal {
    private String nombre;
    private String especie;

    /**
     * Constructor por defecto
     */

    public  Animal() {
    }

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;

    }

    /**
     * Creamos los geter y seter
     */


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    

    @Override
    public String toString() {
        return "{" +
            "nombre= '" + getNombre() + "'" +
            ", especie= '" + getEspecie() + "'" +
            "}";
    }

    /**
     * Creamos el .equals()
     */
    @Override
    public boolean equals(Object o) {
        if ((o==null)){
            return false;
        }
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(nombre, animal.nombre) && Objects.equals(especie, animal.especie);
    }
}
