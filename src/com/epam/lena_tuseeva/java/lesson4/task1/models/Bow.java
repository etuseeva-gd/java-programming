package com.epam.lena_tuseeva.java.lesson4.task1.models;

import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeCaloriesException;
import com.epam.lena_tuseeva.java.lesson4.task1.exceptions.NegativeWeightException;

public class Bow extends Vegetable {
    public enum TypeBow {
        Leek,
        Bulbous,
        RedOnion,
        Simple
    }

    private TypeBow type = null;

    public Bow(Integer calories, Integer weight, TypeBow type) throws NegativeCaloriesException, NegativeWeightException {
        super(calories, weight);

        this.type = type;
    }

    public TypeBow getType() {
        return type;
    }

    public void setType(TypeBow type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[Object] Bow";
    }
}