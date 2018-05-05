package com.epam.lena_tuseeva.java.lesson8.task1.interfaces;

import com.epam.lena_tuseeva.java.lesson8.task1.models.Vegetable;

import java.util.List;

public interface ISalad {
    public void add(Vegetable vegetable);
    public void sort();

    public int getSaladCalories();
    public List<Vegetable> findVegetablesByWeight(int min, int max);
}
