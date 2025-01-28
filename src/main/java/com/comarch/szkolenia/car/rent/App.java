package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.configuration.AppConfiguration;
import com.comarch.szkolenia.car.rent.core.Core;
import com.comarch.szkolenia.car.rent.core.ICore;
import com.comarch.szkolenia.car.rent.database.CarRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        ICore core = context.getBean(ICore.class);
        core.run();
    }
}
