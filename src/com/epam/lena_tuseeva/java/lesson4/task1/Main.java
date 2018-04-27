package com.epam.lena_tuseeva.java.lesson4.task1;

import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeCaloriesException;
import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeWeightException;
import com.epam.lena_tuseeva.java.lesson4.task1.models.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int caloriesNegative = -10, caloriesPositive = 10;
        int weightNegative = -100, weightPositive = 100;

        Tomato tomato = null;
        try {
            tomato = new Tomato(caloriesNegative, weightPositive, Tomato.TypeTomato.Simple);
        } catch (NegativeCaloriesException | NegativeWeightException e) {
            System.out.println("Tomato: " + e.getMessage());
        }

        Cucumber cucumber = null;
        try {
            cucumber = new Cucumber(caloriesPositive, weightNegative, Cucumber.StateCucumber.Fresh);
        } catch (NegativeCaloriesException | NegativeWeightException e) {
            System.out.println("Cucumber: " + e.getMessage());
        }

        Bow bow = null;
        try {
            bow = new Bow(caloriesPositive, caloriesPositive, Bow.TypeBow.Bulbous);
        } catch (NegativeCaloriesException | NegativeWeightException e) {
            System.out.println("Bow: " + e.getMessage());
        }

        Salad salad = null;
        try {
            salad = new Salad(-10);
        } catch (Exception e) {
            System.out.println("Salad: " + e.getMessage());
        }

        //Recreate salad for next examples
        salad = new Salad(3);

        if (salad != null) {
            System.out.println("Salad was successfully created!");

            int i = 0;
            if (cucumber != null) {
                System.out.println("Cucumber was successfully created!");
                salad.add(++i, cucumber);
            } else {
                System.out.println("Cucumber wasn't successfully created!");
            }

            if (bow != null) {
                System.out.println("Bow was successfully created!");
                salad.add(++i, bow);
            } else {
                System.out.println("Bow wasn't successfully created!");
            }

            if (tomato != null) {
                System.out.println("Tomato was successfully created!");
                salad.add(++i, tomato);
            } else {
                System.out.println("Tomato wasn't successfully created!");
            }
        } else {
            System.out.println("Salad wasn't successfully created!");
        }
    }
}
