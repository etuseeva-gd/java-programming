package com.epam.lena_tuseeva.java.lesson8.task1;

import com.epam.lena_tuseeva.java.lesson8.task1.models.*;
import com.epam.lena_tuseeva.java.lesson8.task1.utils.*;

import java.io.File;
import java.util.List;

public class Chef {
    private Salad salad = null;

    public void createSalad() {
        if (salad != null) {
            System.out.println("Salad is already created!");
            return;
        }

        this.salad = new Salad();
    }

    public void addTomato() {
        this.salad.add(this.getTomato());
    }

    public void addCucumber() {
        this.salad.add(this.getCucumber());
    }

    public void addBow() {
        this.salad.add(this.getBow());
    }

    public void printSalad() {
        System.out.println("Salad:");
        this.printVegetables(this.salad.getVegetables());
    }

    public void giveAwaySalad() {
        this.salad = null;
    }

    public void printAvailableVegetables() {
        StringBuilder strVegetables = new StringBuilder();

        strVegetables.append("Available vegetables:").append('\n');

        strVegetables.append("Tomato").append('\n');
        strVegetables.append("Bow").append('\n');
        strVegetables.append("Cucumber").append('\n');

        System.out.println(strVegetables);
    }

    private void printVegetables(List<Vegetable> vegetables) {
        vegetables.forEach(vegetable -> {
            System.out.print(vegetable.toString());
        });
    }

    private Vegetable getVegetable(String name) {
        // @todo to const
        File pathToVegetable = new File(Helpers.getPathToFile("vegetables.xml"));

        return XMLParser.getVegetableByXML(pathToVegetable, name);
    }

    private Tomato getTomato() {
        return (Tomato) this.getVegetable("Tomato");
    }

    private Cucumber getCucumber() {
        return (Cucumber) this.getVegetable("Cucumber");
    }

    private Bow getBow() {
        return (Bow) this.getVegetable("Bow");
    }
}
