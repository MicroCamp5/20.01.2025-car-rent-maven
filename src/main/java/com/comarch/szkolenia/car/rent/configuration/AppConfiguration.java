package com.comarch.szkolenia.car.rent.configuration;

import com.comarch.szkolenia.car.rent.core.Core;
import com.comarch.szkolenia.car.rent.database.ICarRepository;
import com.comarch.szkolenia.car.rent.gui.IGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {
        "com.comarch.szkolenia.car.rent.core",
        "com.comarch.szkolenia.car.rent.database",
        "com.comarch.szkolenia.car.rent.gui"})
//@ImportResource("beans.xml")
public class AppConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    /*@Bean
    public Core core(IGUI gui, @Autowired(required = false) ICarRepository carRepository) {
        return new Core(carRepository, gui);
    }*/
}
