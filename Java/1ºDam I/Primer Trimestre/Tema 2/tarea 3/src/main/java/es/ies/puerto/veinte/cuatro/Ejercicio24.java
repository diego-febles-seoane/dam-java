package es.ies.puerto.veinte.cuatro;

public class Ejercicio24 {
    private static Zoologico zoologico;

    public static void main(String[] args) {
        Animal animal1 = new  Animal("Rexi", "Tyranosaurio");
        Animal animal2 = new  Animal("Blue", "Velociraptor");
        Animal animal3 = new  Animal("The Goat", "Indominus Rex");
        Animal animal4 = new  Animal("La copia", "Indoraptor");
        zoologico = new Zoologico("Jurasic Park");
        zoologico.addAnimal(animal1);
        zoologico.addAnimal(animal2);
        zoologico.addAnimal(animal3);
        zoologico.addAnimal(animal4);
        System.out.println(zoologico);
    }
}
