package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
//@Component
public class CarRepositoryV2 implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepositoryV2() {
        cars.add(new Car("Audi", "A5", 400.0, 2020, "KR111"));
        cars.add(new Car("BMW", "5", 500.0, 2022, "KR222"));
        cars.add(new Car("Kia", "Ceed", 300.0, 2021, "KR333"));
        cars.add(new Car("Toyota", "Corolla", 300.0, 2019, "KR444"));
    }

    @Override
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
