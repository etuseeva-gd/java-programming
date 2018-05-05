package com.epam.lena_tuseeva.java.lesson8.task1.models;

public class Nutritive {
    private int calorific;
    private int proteins;
    private int fats;
    private int carbohydrates;

    public Nutritive(int calorific, int proteins, int fats, int carbohydrates) {
        this.calorific = calorific;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public int getCalorific() {
        return calorific;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getFats() {
        return fats;
    }

    public int getProteins() {
        return proteins;
    }

    @Override
    public String toString() {
        StringBuilder strNutritive = new StringBuilder();
        strNutritive
                .append("Calorific: ").append(calorific).append("\n")
                .append("Proteins: ").append(proteins).append("\n")
                .append("Fats: ").append(fats).append("\n")
                .append("Carbohydrates: ").append(carbohydrates).append("\n");
        return String.valueOf(strNutritive);
    }
}
