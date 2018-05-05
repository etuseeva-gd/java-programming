package com.epam.lena_tuseeva.java.lesson8.task1.models;

public class Tomato extends Vegetable {
    public Tomato(Nutritive nutritive, String vitamins, String color, String wayForEating) {
        super(nutritive, vitamins, color, wayForEating);
    }

    @Override
    public String toString() {
        StringBuilder strVegetable = new StringBuilder();
        strVegetable
                .append("[Object] Tomato").append("\n")
                .append(super.toString()).append("\n");
        return String.valueOf(strVegetable);
    }
}
