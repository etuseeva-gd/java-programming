package com.epam.lena_tuseeva.java.lesson8.task1.models;

public class Bow extends Vegetable {
    public Bow(Nutritive nutritive, String vitamins, String color, String wayForEating) {
        super(nutritive, vitamins, color, wayForEating);
    }

    @Override
    public String toString() {
        return "[Object] Bow";
    }
}