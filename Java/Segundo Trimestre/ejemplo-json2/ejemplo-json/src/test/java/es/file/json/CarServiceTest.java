package es.file.json;

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
    }

    @Test
    void addCarTest() {
        Assertions.assertEquals(3, carService.getCars().size());
    }
}
