package es.file.json;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarService {
    ObjectMapper objectMapper;
    String path = "src/main/resources/cars.json";
    List<Car> listCar;
    File file;

    public CarService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        loadFile(file);
    }

    private void loadFile(File file) {
        try {
            listCar = objectMapper.readValue(file, new TypeReference<List<Car>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveFile(File file, List<Car> cars) {
        try {
            objectMapper.writeValue(file, cars);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addCar(Car car) {
        listCar.add(car);
        saveFile(file, listCar);
        return true;
    }

    public boolean deleteCar(Car car) {
        return listCar.remove(car);
    }

    public List<Car> getCars() {
        return listCar;
    }
}
