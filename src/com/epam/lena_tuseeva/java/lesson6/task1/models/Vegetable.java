package com.epam.lena_tuseeva.java.lesson6.task1.models;

import java.io.Serializable;

public class Vegetable implements Serializable {
    private Integer calories = null;
    private Integer weight = null;

    public Vegetable(Integer calories, Integer weight) {
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
