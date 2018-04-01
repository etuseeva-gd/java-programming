package com.epam.lena_tuseeva.java.lesson4.task1.interfaces;

import com.epam.lena_tuseeva.java.lesson4.task1.models.Vegetable;

public interface ISalad {
    public void add(int index, Vegetable vegetable);

    public void sort();

    public int getSaladCalories();

    public Vegetable[] findVegetablesByWeight(int min, int max);
}
