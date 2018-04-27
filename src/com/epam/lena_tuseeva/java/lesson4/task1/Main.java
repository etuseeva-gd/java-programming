package com.epam.lena_tuseeva.java.lesson4.task1;

import com.epam.lena_tuseeva.java.lesson4.task1.models.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        Create vegetables
        Tomato tomato = new Tomato(18, 100, Tomato.TypeTomato.Simple);
        Bow bow = new Bow(40, 75, Bow.TypeBow.Simple);
        Cucumber cucumber = new Cucumber(16, 80, Cucumber.StateCucumber.Fresh);

//        Create salad
        Salad salad = new Salad(4);

        int i = 0;
        salad.add(++i, tomato);
        salad.add(++i, tomato);
        salad.add(++i, bow);
        salad.add(++i, cucumber);

    }
}
