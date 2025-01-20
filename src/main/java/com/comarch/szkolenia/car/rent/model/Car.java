package com.comarch.szkolenia.car.rent.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private String model;
    private double price;
    private int year;
    private boolean rent;
    private String plate;

    public Car(String brand, String model, double price, int year, String plate) {
        this(brand, model, price, year, false, plate);
    }
}
