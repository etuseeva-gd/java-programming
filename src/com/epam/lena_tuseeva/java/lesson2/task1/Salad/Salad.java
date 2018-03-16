package com.epam.lena_tuseeva.java.lesson2.task1.Salad;

import java.util.Arrays;

public class Salad implements ISalad {
    private Vegetable[] vegetables = null;

    public Salad(int n) {
        this.vegetables = new Vegetable[n];
    }

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public void add(int index, Vegetable vegetable) {
        this.vegetables[index] = vegetable;
    }

    //sort by weight
    public void sort() {
        Arrays.sort(this.vegetables, (firstVegetable, secondVegetable) -> {
            Integer firstWeight = firstVegetable.getWeight();
            Integer secondWeight = secondVegetable.getWeight();
            return firstWeight.compareTo(secondWeight);
        });
    }

    public int getSaladCalories() {
        int cal = 0;
        for (Vegetable vegetable : this.vegetables) {
            cal += vegetable.getCalories();
        }
        return cal;
    }

    public Vegetable[] findVegetablesByWeight(int min, int max) {
        int n = 0;
        for (Vegetable vegetable : this.vegetables) {
            int weight = vegetable.getWeight();
            if (weight >= min && weight <= max) {
                n++;
            }
        }

        int i = 0;
        Vegetable[] result = new Vegetable[n];
        for (Vegetable vegetable : this.vegetables) {
            int weight = vegetable.getWeight();
            if (weight >= min && weight <= max) {
                result[++i] = vegetable;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "[Object] Salad";
    }
}
