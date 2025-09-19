package es.file.json;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarService {
    ObjectMapper objectMapper;
    String path = "src/main/resources/cars.json";
    File file;
    List<Car> listCar;

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
        if (car == null){
            return false;
        }
        int posicion = listCar.indexOf(car);
        if (posicion >= 0) {
            return false;
        }
        boolean insertar = listCar.add(car);
        if (insertar){
            saveFile(file, listCar);
        }
        return insertar;
    }

    public List<Car> searchPrice(double precio){
        List<Car> list = new ArrayList<>();
        for (Car car : listCar){
            if (car.getPrecio() >= precio) {
                list.add(car);
            }
        }
        return list;
    }

    public Car search(int id){
        Car car = new Car(id);
        int posicion = listCar.indexOf(car);
        if (posicion < 0){
            return null;
        }
        return listCar.get(posicion);
    }

    public boolean deleteCar(Car car) {
        if (car == null){
            return false;
        }
        boolean borrar = listCar.remove(car);
        if (borrar){
            saveFile(file, listCar);
        }
        return borrar;
    }

    public List<Car> getCars() {
        return listCar;
    }
}
