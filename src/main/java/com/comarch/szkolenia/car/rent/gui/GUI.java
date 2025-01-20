package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.List;
import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public static void listCars(List<Car> cars) {
        for (Car car : cars) {
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

    public static String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showRentResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }

    public static void showWrongChoose() {
        System.out.println("Wrong choose !!");
    }
}
