package com.epam.lena_tuseeva.java.lesson2.task1;

import com.epam.lena_tuseeva.java.lesson2.task1.models.*;

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

//        Operations with salad
        System.out.println("Salad calories: ");
        System.out.println(salad.getSaladCalories());
        System.out.println();

        System.out.println("Sorted salad by weight:");
        System.out.println("Before sort:");
        this.printVegetables(salad.getVegetables());

        salad.sort();

        System.out.println("After sort");
        this.printVegetables(salad.getVegetables());

        System.out.println("Find vegetables by weight:");
        System.out.println("From 50 to 75:");
        this.printVegetables(salad.findVegetablesByWeight(50, 75));
        System.out.println("From 80 to 150:");
        this.printVegetables(salad.findVegetablesByWeight(80, 150));
    }

    private void printVegetables(Vegetable vegetables[]) {
        for (Vegetable vegetable : vegetables) {
            printVegetable(vegetable);
        }
        System.out.println();
    }

    private void printVegetable(Vegetable vegetable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vegetable.toString()).append("\n")
                .append("Categories: ").append(vegetable.getCalories()).append("\n")
                .append("Weight: ").append(vegetable.getWeight());
        System.out.println(stringBuilder);
    }
}
