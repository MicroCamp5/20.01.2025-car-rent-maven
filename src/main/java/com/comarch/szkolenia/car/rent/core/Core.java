package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.database.CarRepository;
import com.comarch.szkolenia.car.rent.database.CarRepositoryV2;
import com.comarch.szkolenia.car.rent.database.ICarRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;
import com.comarch.szkolenia.car.rent.gui.IGUI;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Core implements ICore {
    //@Qualifier("stare-repo")
    private final ICarRepository carRepository;
    private final IGUI gui;

    @Override
    public void run() {
        boolean run = true;
        while(run) {
            switch(this.gui.showMenuAndReadChoose()) {
                case "1":
                    this.gui.listCars();
                    break;
                case "2":
                    this.gui.showRentResult(this.carRepository.rentCar(this.gui.readPlate()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    this.gui.showWrongChoose();
                    break;
            }
        }
    }

    /*@Autowired
    public void setCarRepository(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Autowired
    public void setGui(IGUI gui) {
        this.gui = gui;
    }*/
}
