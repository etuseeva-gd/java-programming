package com.epam.lena_tuseeva.java.lesson8.task1;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Chef chef = new Chef();

        // Show vegetables, that chif can use
        chef.printAvailableVegetables();

        // Create new salad
        chef.createSalad();

        // Add vegetables to created salad
        chef.addBow();
        chef.addTomato();
        chef.addCucumber();
        chef.addTomato();

        // Print salad
        chef.printSalad();

        // Give away salad, clean it
        chef.giveAwaySalad();
    }
}
