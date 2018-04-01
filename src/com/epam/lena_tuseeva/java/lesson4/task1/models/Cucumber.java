package com.epam.lena_tuseeva.java.lesson4.task1.models;

public class Cucumber extends Vegetable {
    public enum StateCucumber {
        Fresh,
        Salty,
        Marinated,
    }

    private StateCucumber state = null;

    public Cucumber(Integer calories, Integer weight, StateCucumber state) {
        super(calories, weight);

        this.state = state;
    }

    public void setState(StateCucumber state) {
        this.state = state;
    }

    public StateCucumber getState() {
        return state;
    }

    @Override
    public String toString() {
        return "[Object] Cucumber";
    }
}