package com.epam.lena_tuseeva.java.lesson4.task1.models;

import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeCaloriesException;
import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeWeightException;

public class Vegetable {
    private Integer calories = null;
    private Integer weight = null;

    public Vegetable(Integer calories, Integer weight) throws NegativeCaloriesException, NegativeWeightException {
        if (calories < 0) {
            throw new NegativeCaloriesException("Calories is negative!");
        }
        if (weight < 0) {
            throw new NegativeWeightException("Weight is negative!");
        }
        this.calories = calories;
        this.weight = weight;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[Object] Vegetable";
    }
}
