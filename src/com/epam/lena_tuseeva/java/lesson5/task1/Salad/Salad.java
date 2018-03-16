package com.epam.lena_tuseeva.java.lesson5.task1.Salad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Salad implements ISalad {
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

    //sort by weight
    public void sort() {
        this.vegetables.sort((firstVegetable, secondVegetable) -> {
            Integer firstWeight = firstVegetable.getWeight();
            Integer secondWeight = secondVegetable.getWeight();
            return firstWeight.compareTo(secondWeight);
        });
    }

    public int getSaladCalories() {
        return this.vegetables.stream()
                .map(Vegetable::getCalories)
                .reduce(0, (a, b) -> a + b);
    }

    public List<Vegetable> findVegetablesByWeight(int min, int max) {
        return this.vegetables.stream().filter(vegetable -> {
            int weight = vegetable.getWeight();
            return weight >= min && weight <= max;
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "[Object] Salad";
    }
}
