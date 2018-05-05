package com.epam.lena_tuseeva.java.lesson8.task1.models;

public class Tomato extends Vegetable {
    public Tomato(Nutritive nutritive, String vitamins, String color, String wayForEating) {
        super(nutritive, vitamins, color, wayForEating);
    }

    @Override
    public String toString() {
        return "[Object] Tomato";
    }
}
