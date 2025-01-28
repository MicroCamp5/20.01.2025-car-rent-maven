package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.database.ICarRepository;
import com.comarch.szkolenia.car.rent.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@RequiredArgsConstructor
@Component
@Scope(value = "prototype")
public class GUI implements IGUI {
    private final Scanner scanner;
    private final ICarRepository carRepository;

    /*private final static GUI instance = new GUI();

    private GUI() {

    }*/

    @Override
    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    @Override
    public void listCars() {
        for (Car car : this.carRepository.getCars()) {
            System.out.println(new StringBuilder()
                    .append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" Price: ")
                    .append(car.getPrice())
                    .append(" Year: ")
                    .append(car.getYear())
                    .append(" Plate: ")
                    .append(car.getPlate())
                    .append(" Available: ")
                    .append(car.isRent() ? "No" : "Yes"));
        }
    }

    @Override
    public String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    @Override
    public void showRentResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }

    @Override
    public void showWrongChoose() {
        System.out.println("Wrong choose !!");
    }

    /*public static GUI getInstance() {
        return instance;
    }*/
}
