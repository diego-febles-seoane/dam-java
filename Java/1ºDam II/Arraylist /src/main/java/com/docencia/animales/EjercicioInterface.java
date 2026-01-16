package com.docencia.animales;

import java.util.ArrayList;
import java.util.List;

public class EjercicioInterface {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        Raton raton = new Raton();
        Gato gato = new Gato();
        Perro perro = new Perro();
        Loro loro = new Loro();

        animales.add(loro);
        animales.add(gato);
        animales.add(perro);
        animales.add(raton);
        
        for (Animal animal : animales) {
            System.out.println(animal.comer());
        }
    }
}
