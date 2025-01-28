package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

public interface ICarRepository {
    boolean rentCar(String plate);
    List<Car> getCars();
}
