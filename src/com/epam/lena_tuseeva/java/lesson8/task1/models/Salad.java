package com.epam.lena_tuseeva.java.lesson8.task1.models;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetable> vegetables = null;

    public Salad() {
        this.vegetables = new ArrayList<>();
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void add(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    @Override
    public String toString() {
        return "[Object] Salad";
    }
}
