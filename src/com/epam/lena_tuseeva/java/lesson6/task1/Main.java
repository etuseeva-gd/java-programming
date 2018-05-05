package com.epam.lena_tuseeva.java.lesson6.task1;

import com.epam.lena_tuseeva.java.lesson6.task1.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

    }

    private void printVegetables(List<Vegetable> vegetables) {
        vegetables.forEach(this::printVegetable);
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
