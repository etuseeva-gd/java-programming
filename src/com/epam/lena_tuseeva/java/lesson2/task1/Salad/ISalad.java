package com.epam.lena_tuseeva.java.lesson2.task1.Salad;

public interface ISalad {
    public void add(int index, Vegetable vegetable);

    public void sort();

    public int getSaladCalories();

    public Vegetable[] findVegetablesByWeight(int min, int max);
}
