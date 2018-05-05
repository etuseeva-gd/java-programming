package com.epam.lena_tuseeva.java.lesson8.task1.models;

public class Vegetable {
    private Nutritive nutritive = null;
    private String vitamins = null;
    private String color = null;
    private String wayForEating = null;

    public Vegetable(Nutritive nutritive, String vitamins, String color, String wayForEating) {
        this.nutritive = nutritive;
        this.vitamins = vitamins;
        this.color = color;
        this.wayForEating = wayForEating;
    }

    public Nutritive getNutritive() {
        return nutritive;
    }

    public String getVitamins() {
        return vitamins;
    }

    public String getColor() {
        return color;
    }

    public String getWayForEating() {
        return wayForEating;
    }

    @Override
    public String toString() {
        return "[Object] Vegetable";
    }
}
