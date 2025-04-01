package es.ies.puerto.veinte.cuatro;
import java.util.Objects;
/**
 * Crea una clase Zoologico que almacene una lista (array) (array) de animales (clase Animal) con atributos nombre y especie. 
 * Implementa métodos para agregar, eliminar y listar animales. 
 * Usa toString() para describir el zoológico.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Zoologico {
    private int numAnimales;
    private String[] animales;
    private String especie;
    /**
     * Constructor por defecto
     */
    public Zoologico() {
    }
    /**
     * Constructor de la clase
     * @param especie 
     *@param animales 
     */
    public Zoologico(String[]animales,int numAnimales ){
        this.animales = new String[5];
        numAnimales=0;
    }

    public Zoologico(String especie ) {
        this.especie = especie;
        this.animales = new String[5];
        numAnimales=0;
    }

    public String[] getAnimales() {
        return this.animales;
    }

    public void setAnimales(String[] animales) {
        this.animales = animales;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Zoologico animales(String[] animales) {
        setAnimales(animales);
        return this;
    }

    public Zoologico especie(String especie) {
        setEspecie(especie);
        return this;
    }

    /**
     * Agrega un animal al zoológico
     * @param animal a agregar
     * @return true/false si es agregado o no
     */
    public boolean agregarAnimal(String animal) {
        for (String animalZoologico : animales) {
            if (animalZoologico.equals(animal)) {
                return false;
            }
        }
        String[] nuevoArray = new String[animales.length + 1];
        System.arraycopy(animales, 0, nuevoArray, 0, animales.length);
        nuevoArray[nuevoArray.length - 1] = animal;
        animales = nuevoArray;
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Zoologico)) {
            return false;
        }
        Zoologico zoologico = (Zoologico) o;
        return Objects.equals(animales, zoologico.animales) && Objects.equals(especie, zoologico.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animales, especie);
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: " + especie;
        for (String animal : animales) {
            if (animal != null) {
            mensaje += animal.toString();
            
            }
        }
        return mensaje;
}
public boolean addAnimal(Animal animal){
    if(numAnimales<animales.length){
    animales[numAnimales]=animal;
    numAnimales++;
    return true;
    }
    return false;
}
}
        
    
