package com.epam.lena_tuseeva.java.lesson4.task1.models;

import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeCaloriesException;
import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeWeightException;

public class Tomato extends Vegetable {
    public enum TypeTomato {
        Simple,
        Cherry,
    }

    private TypeTomato type = null;

    public Tomato(Integer calories, Integer weight, TypeTomato type) throws NegativeCaloriesException, NegativeWeightException {
        super(calories, weight);
        this.type = type;
    }

    public void setType(TypeTomato type) {
        this.type = type;
    }

    public TypeTomato getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[Object] Tomato";
    }
}
