package com.epam.lena_tuseeva.java.lesson6.task1;

import com.epam.lena_tuseeva.java.lesson6.task1.models.*;
import com.epam.lena_tuseeva.java.lesson6.task1.utils.Connector;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final String prefixOfFiles = "src/com/epam/lena_tuseeva/java/lesson6/task1/";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Main().run();
    }

    private void run() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select action:");
        System.out.println("1 - serialize salad");
        System.out.println("2 - deserialize salad");

        int action = scanner.nextInt();
        switch (action) {
            case 1: {
                this.serialize();
                break;
            }
            case 2: {
                this.deserialize();
                break;
            }
            default: {
                System.out.println("Not correct operation!");
            }
        }

        scanner.close();
    }

    private void serialize() throws IOException {
        Salad salad = this.createSimpleSalad();
        this.serializeSalad(salad);
    }

    private void deserialize() throws IOException, ClassNotFoundException {
        // @todo file name to const
        Salad salad = this.deserializeSalad("salad.txt");
        System.out.println("Salad:");
        this.printVegetables(salad.getVegetables());
    }

    private Salad createSimpleSalad() {
        Tomato tomato = new Tomato(18, 100, Tomato.TypeTomato.Simple);
        Bow bow = new Bow(40, 75, Bow.TypeBow.Simple);
        Cucumber cucumber = new Cucumber(16, 80, Cucumber.StateCucumber.Fresh);

        Salad salad = new Salad();

        salad.add(tomato);
        salad.add(tomato);
        salad.add(bow);
        salad.add(cucumber);

        return salad;
    }

    private void printVegetables(List<Vegetable> vegetables) {
        vegetables.forEach(this::printVegetable);
        System.out.println();
    }

    private void printVegetable(Vegetable vegetable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vegetable.toString()).append("\n")
                .append("Categories: ").append(vegetable.getCalories()).append("\n")
                .append("Weight: ").append(vegetable.getWeight());
        System.out.println(stringBuilder);
    }

    private void serializeSalad(Salad salad) throws IOException {
        File fileOfSalad = new File(this.prefixOfFiles + "salad.txt");
        Connector.printObject(fileOfSalad, salad);
    }

    private Salad deserializeSalad(String fileName) throws IOException, ClassNotFoundException {
        File fileOfSalad = new File(this.prefixOfFiles + fileName);
        return (Salad) Connector.readObject(fileOfSalad);
    }
}
