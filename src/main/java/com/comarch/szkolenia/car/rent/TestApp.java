package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.model.Car;

public class TestApp {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();

        //
        //
        //
        carBuilder.brand("BMW").model("3");

        //
        //
        //
        carBuilder.year(2000).price(300);
        //
        //
        //
        //
        carBuilder.plate("KR555").rent(true);

        Car car = carBuilder.build();

    }
}
