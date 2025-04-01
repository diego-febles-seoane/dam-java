package es.ies.puerto;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TrabajoJson {
    static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        Car miCoche = new Car();
        miCoche.setColor("gris");
        miCoche.setTypo("automovil");
        Set<Car> coches = new HashSet<>();
        coches.add(miCoche);
        coches.add(miCoche);

        try {
            Car car = objectMapper.readValue(new File("src/main/resources/car.json"), Car.class);
            objectMapper.writeValue(new File("src/main/resources/car.json"), coches);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
