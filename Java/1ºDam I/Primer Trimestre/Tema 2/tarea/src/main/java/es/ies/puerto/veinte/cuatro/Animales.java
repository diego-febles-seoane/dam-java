package es.ies.puerto.veinte.cuatro;

public class Animales {
    static Animal[] animales;
    public static void main(String[] args) {
        animales=new Animal[2];
        for (int i = 0; i < animales.length; i++) {
            int valor=i+1;
            Animal animal=new Animal("gato"+valor);
            animales[i]=animal;
        }
        for(Animal animal:animales){
            System.out.println(animal);
        }
    }
}
