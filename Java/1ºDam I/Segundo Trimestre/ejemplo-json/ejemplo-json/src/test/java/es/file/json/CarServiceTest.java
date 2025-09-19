package es.file.json;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarServiceTest {

    CarService carService;
    Car car;
    
    @BeforeEach
    void before() {
        carService = new CarService();
        car = new Car(3, "marca", "modelo", 10000);
        carService.addCar(car);
    }

    @AfterEach
    void afterEach() {
        carService.deleteCar(car);
        Assertions.assertEquals(2, carService.getCars().size());
    }


    @Test
    void addCarTest() {
        Assertions.assertEquals(3, carService.getCars().size());
    }

    @Test
    void addCarNuloTest(){
        boolean result = carService.addCar(null);
        Assertions.assertFalse(result);
    }

    @Test
    void addCarExistTest(){
        Car newCar = new Car(1);
        boolean result = carService.addCar(newCar);
        Assertions.assertFalse(result);
    }

    @Test
    void searchCarTest() {
        Car newCar = carService.search(car.getId());
        Assertions.assertEquals(car, newCar, "No es el coche buscado" );
    }

    @Test
    void searchPriceCarTest() {
        List<Car> newCar = carService.searchPrice(20000);
        Assertions.assertEquals(car, newCar.size(), "No es el coche buscado" );
    }
}
