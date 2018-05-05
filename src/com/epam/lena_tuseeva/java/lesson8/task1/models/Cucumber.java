package com.epam.lena_tuseeva.java.lesson8.task1.models;

public class Cucumber extends Vegetable {
    public Cucumber(Nutritive nutritive, String vitamins, String color, String wayForEating) {
        super(nutritive, vitamins, color, wayForEating);
    }

    @Override
    public String toString() {
        StringBuilder strVegetable = new StringBuilder();
        strVegetable
                .append("[Object] Cucumber").append("\n")
                .append(super.toString()).append("\n");
        return String.valueOf(strVegetable);
    }
}