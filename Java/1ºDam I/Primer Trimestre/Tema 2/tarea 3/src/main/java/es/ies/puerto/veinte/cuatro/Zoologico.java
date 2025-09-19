package es.ies.puerto.veinte.cuatro;

public class Zoologico {

    private int numeroAnimales;
    private String nombre;
    private Animal[] animales;


    /**
     * Constructor por defecto
     */
    public Zoologico() {
        this.numeroAnimales = 0;
        animales = new Animal[5];
    }

    public Zoologico(String nombre){
        this.nombre = nombre;
        numeroAnimales = 0;
        animales = new Animal[5];
    }

    @Override
    public String toString() {
        String mensaje ="Nombre: "+nombre;
        for(Animal animal : animales){
            if (animal != null){
                mensaje += animal;
            }
        }
        return mensaje;
    }
    
    /**
     * Funcion para añadir un animal en la lista
     * @param animal nuevo
     * @return true/false
     */
    public boolean addAnimal(Animal animal){

        if (animal == null){
            return false;
        }
        if  (numeroAnimales >= animales.length){
            return false;
        }
        
        animales[numeroAnimales] = animal;
        numeroAnimales++;
        return true;
        
    }

    public boolean removeAnimal(Animal animalEliminar){
        if (animalEliminar == null){
            return false;
        }

        if (numeroAnimales == 0){
            return false;
        }
        for (int i = 0; i < numeroAnimales; i++){
            if (animales[i] !=null){
                if (animalEliminar.equals(animales[i])){
                    animales[i] = null;
                    numeroAnimales--;
                    return true;
                }
            }
            for (i = 0; i < numeroAnimales-1; i++){
                if  (animales[i] != null){
                    animales[i] = animales[i+1];
                    animales[i+1] = null;
                }
            }
        }
        return true;
    }
}
