package com.epam.lena_tuseeva.java.lesson2.task1.Salad;

import java.util.List;

public interface ISalad {
    public void add(Vegetable vegetable);
    public void sort();

    public int getSaladCalories();
    public List<Vegetable> findVegetablesByWeight(int min, int max);
}
