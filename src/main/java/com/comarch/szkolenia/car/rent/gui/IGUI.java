package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

public interface IGUI {
    String showMenuAndReadChoose();
    void listCars();
    String readPlate();
    void showRentResult(boolean result);
    void showWrongChoose();
}
