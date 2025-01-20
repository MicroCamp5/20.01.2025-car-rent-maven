package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.database.CarRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;

public class App {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();

        boolean run = true;
        while(run) {
            switch(GUI.showMenuAndReadChoose()) {
                case "1":
                    GUI.listCars(carRepository.getCars());
                    break;
                case "2":
                    GUI.showRentResult(carRepository.rentCar(GUI.readPlate()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    GUI.showWrongChoose();
                    break;
            }
        }
    }
}
