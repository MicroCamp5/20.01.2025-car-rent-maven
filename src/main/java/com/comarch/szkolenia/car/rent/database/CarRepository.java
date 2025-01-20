package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class CarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository() {
        cars.add(new Car("Audi", "A5", 400.0, 2020, "KR11"));
        cars.add(new Car("BMW", "5", 500.0, 2022, "KR22"));
        cars.add(new Car("Kia", "Ceed", 300.0, 2021, "KR33"));
        cars.add(new Car("Toyota", "Corolla", 300.0, 2019, "KR44"));
    }

    public boolean rentCar(String plate) {
        Optional<Car> carBox = findByPlate(plate);
        if(carBox.isPresent() && !carBox.get().isRent()) {
            carBox.get().setRent(true);
            return true;
        }
        return false;
    }

    private Optional<Car> findByPlate(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                return Optional.of(car);
            }
        }

        return Optional.empty();
    }
}
